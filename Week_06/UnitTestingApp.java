package com.batson_java_course_2021.Week_06;

public class UnitTestingApp {

	Unit Testing App

	pom.xml 
	xml version="1.0" encoding="UTF-8"?>

	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	  <modelVersion>4.0.0</modelVersion>

	  <parent>
	    <artifactId>spring-boot-starter-parent</artifactId>
	    		<groupId>org.springframework.boot</groupId>
	    <version>2.2.6.RELEASE</version>
	  </parent>

	  <groupId>co.newlabs</groupId>
	  		<artifactId>unittesting_blog</artifactId>
	  <version>1.0-SNAPSHOT</version>

	  <dependencies>
	    <dependency>
	      <groupId>junit</groupId>
	      	<artifactId>junit</artifactId>
	      <scope>test</scope>
	    </dependency>
	    
		<dependency>
	    	  	<groupId>org.springframework.boot</groupId>
	    	  	<artifactId>spring-boot-starter-web</artifactId>
	    	</dependency>
	    
	<dependency>
	      	<groupId>org.springframework.boot</groupId>
	      	<artifactId>spring-boot-starter-data-jdbc</artifactId>
	    </dependency>
	    
	<dependency>
	    	  	<groupId>org.projectlombok</groupId>
	     	  	<artifactId>lombok</artifactId>
	</dependency>
	    
	<dependency>
	     		<groupId>org.springframework.boot</groupId>
	      	<artifactId>spring-boot-starter-test</artifactId>
	      <scope>test</scope>
	      
	      <exclusions>
	        	<exclusion>
	        		<groupId>org.junit.vintage</groupId>
	        		<artifactId>junit-vintage-engine</artifactId>
	        	</exclusion>
	        </exclusions>
	 	</dependency>
	 </dependencies>

	  <build>

	  </build>
	</project>

	
	
	
	
	
	
	src/
	src/test/
	src/main/
	src/main/java/
	src/main/java/co/
	src/main/java/co/newlabs/
	src/main/java/co/newlabs/AppService.java
	package co.newlabs;

	import lombok.AllArgsConstructor;
	import org.springframework.stereotype.Service;

	import java.util.ArrayList;
	import java.util.List;

	@Service
	@AllArgsConstructor
	public class AppService {
	    private AppRepository repository;

	    public List<CustomerDTO> getAllCustomers() {
	        List<CustomerEntity> entities = repository.getAllCustomers();
	        List<CustomerDTO> retVal = new ArrayList<>();
	        for (CustomerEntity e: entities) {
	            CustomerDTO c = new CustomerDTO(e.getId(), e.getName(), e.getAddress(), e.getCity(), e.getState(), e.getZipCode());
	            retVal.add(c);
	        }
	        return retVal;
	    }

	    public CustomerDTO getCustomerById(long id) {
	        CustomerEntity e = repository.getCustomerById(id);
	        return new CustomerDTO(e.getId(), e.getName(), e.getAddress(), e.getCity(), e.getState(), e.getZipCode());
	    }

	    public void createCustomer(CustomerDTO customer) {
	        CustomerEntity entity = new CustomerEntity(0, customer.getName(), customer.getAddress(), customer.getCity(), customer.getState(), customer.getZipCode());
	        repository.insertCustomer(entity);
	    }
	}
	
	
	
	
	

	src/main/java/co/newlabs/CustomerEntity.java
	package co.newlabs;

	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public class CustomerEntity {
	    private long id;
	    private String name;
	    private String address;
	    private String city;
	    private String state;
	    private String zipCode;
	}

	src/main/java/co/newlabs/CustomerDTO.java
	package co.newlabs;

	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public class CustomerDTO {
	    private long id;
	    private String name;
	    private String address;
	    private String city;
	    private String state;
	    private String zipCode;
	}

	src/main/java/co/newlabs/AppController.java
	package co.newlabs;

	import lombok.AllArgsConstructor;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.*;

	import java.util.List;

	@RestController
	@AllArgsConstructor
	@RequestMapping("customers")
	public class AppController {
	    private AppService service;

	    @GetMapping
	    public ResponseEntity<List<CustomerDTO>> getAllCustomers() {
	        return ResponseEntity.status(HttpStatus.OK).body(service.getAllCustomers());
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable long id) {
	        return ResponseEntity.status(HttpStatus.OK).body(service.getCustomerById(id));
	    }
	    @PostMapping
	    public ResponseEntity createNewCustomer(@RequestBody CustomerDTO customer) {
	        service.createCustomer(customer);
	        return ResponseEntity.status(HttpStatus.CREATED).build();
	    }
	}

	src/main/java/co/newlabs/AppRepository.java
	package co.newlabs;

	import org.springframework.jdbc.core.BeanPropertyRowMapper;
	import org.springframework.jdbc.core.RowMapper;
	import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
	import org.springframework.stereotype.Repository;

	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	@Repository
	public class AppRepository {
	    private NamedParameterJdbcTemplate template;

	    public List<CustomerEntity> getAllCustomers() {
	        String query = "select * from customers";
	        Map<String, Object> params = new HashMap<>();

	        RowMapper<CustomerEntity> rowMapper = new BeanPropertyRowMapper<>(CustomerEntity.class);

	        return template.query(query, params, rowMapper);
	    }

	    public CustomerEntity getCustomerById(long id) {
	        String query = "select * from customers where id = :id";
	        Map<String, Object> params = new HashMap<>();
	        params.put("id", id);

	        RowMapper<CustomerEntity> rowMapper = new BeanPropertyRowMapper<>(CustomerEntity.class);

	        return template.queryForObject(query, params, rowMapper);
	    }

	    public void insertCustomer(CustomerEntity entity) {
	        String query = "insert into customers (name, address, city, state, zipCode) values (:name, :address, :city, :state, :zip)";
	        Map<String, Object> params = new HashMap<>();
	        params.put("name", entity.getName());
	        params.put("address", entity.getAddress());
	        params.put("city", entity.getCity());
	        params.put("zip", entity.getZipCode());

	        template.update(query, params);
	    }
	}

	src/main/java/co/newlabs/App.java
	package co.newlabs;

	/**
	 * Hello world!
	 *
	 */
	public class App 
	{
	    public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	    }

	    public int divide(int a, int b) {
	        if (b == 0) {
	            throw new IllegalArgumentException("Cannot divide by zero.");
	        }
	        return a / b;
	    }
	}
	src/test/java
	src/test/java/co/
	src/test/java/co/newlabs

	
	
	
	
	
	
	
	
	
	
}
