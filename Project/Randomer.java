package com.batson_java_course_2021.Week_03.Project;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Random;


public class Randomer {
    //MAIN
    public static void main(String[] args)
    {
        //WHY IS THERE A SYSOUT HERE??
    	System.out.println(Arrays.toString(generateSorted(100, 0, 100)));
    
    }

    public static int[] generateSorted(final int length, final int minVal, final int maxVal)
    
    {
        ArrayList<Integer> data = new ArrayList<>(length);
        
        data.add(getRandomVal(minVal, maxVal));

        boolean added;
        for(int i = 0; i < length; i++) {
                
            added = false;
            ListIterator<Integer> itr = data.listIterator();
            int rndNum = getRandomVal(minVal, maxVal);
            while(itr.hasNext() && !added) {
            	
                Integer currentNum = itr.next();
                if(currentNum >= rndNum)
                {
                   	itr.previous();
                    itr.add(rndNum);
                    added = true;
                }
            }

            if(!added)//ADDS TO THE END OF THE ARRAYLIST
            {
                data.add(rndNum);
            }
            //printArrList(data);
        }
        
        //STREAM INPUT CHANNEL
        return data.stream().mapToInt(i -> {
        	return i;
        }).toArray();
    }

    //prints contents of ArrayList ALL IN ONE LINE          ?? PROBLEM!
    public static void printArrList(ArrayList<Integer> al)
    {
    	System.out.print("[ ");
        
        //replace with a for (each) loop					??						
        al.stream().forEach((i) -> {
        	System.out.println(i + ", ");  //WON'T PRINT A NEW LINE
        
    	});
        System.out.print("]");
    }

    //RETURNS A RANDOM INTEGER BETWEEN [MIN, MAX]
    private static int getRandomVal(int min, int max)
    {
        int n = max - min + 1;
        int i = rand.nextInt(n);//nextInt(n) RETURNS A RANDOM INT IN [0, n])
        return min + i;
    }
    final static private Random rand = new Random();
}

