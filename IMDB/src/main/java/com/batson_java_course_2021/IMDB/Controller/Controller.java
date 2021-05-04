package com.batson_java_course_2021.IMDB.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batson_java_course_2021.IMDB.Model.Movie;

@RestController
@RequestMapping("/movies")
public class Controller {

	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") int id, String title) {
		return new Movie(id, title);
	}
}
