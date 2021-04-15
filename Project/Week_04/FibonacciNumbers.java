package com.batson_java_course_2021.Week_04;

public class FibonacciNumbers {
	
	    public static void main(String[] args) {
	        int[] numbers = {9,8,7,6,5,4,3,2,1};
	        mergeSort(numbers);
	        for (int n: numbers) {
	            System.out.print(n + ",");
	        }
	        System.out.println("");
	    }

	    public static long fibonacciRecursive(int n) {
	        if (n == 0 || n == 1) {
	            return n;
	        }
	        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	    }

	    public static long fibonacciDynamic(int n) {
	        if (n == 0 || n == 1) {
	            return n;
	        }
	        long[] numbers = new long[n + 1];
	        numbers[0] = 0;
	        numbers[1] = 1;
	        
	        for (int i = 2; i <= n; i++) {
	            numbers[i] = numbers[i - 1] + numbers[n - 2];
	        }
	        return numbers[n];
	    }

	    public static int binarySearch(int[] array, int leftIndex, int rightIndex, int target) {
	        if (leftIndex < rightIndex) {
	            int middleIndex = leftIndex + (rightIndex - 1) / 2;

	            if (array[middleIndex] == target) {
	                return middleIndex;
	            }

	            if (target < array[middleIndex]) {
	                return binarySearch(array, leftIndex, middleIndex - 1, target);
	            } else if (target > array[middleIndex]) {
	                return binarySearch(array, middleIndex + 1, rightIndex, target);
	            }
	        }

	        return -1;
	    }

	    public static void bubbleSort(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array.length - 1 - i; j++) {
	                if (array[j] > array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }

	    public static void insertionSort(int[] array) {
	        for (int i = 0; i < array.length - 1; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] > array[j]) {
	                    int temp = array[i];
	                    array[i] = array[j];
	                    array[j] = temp;
	                }
	            }
	        }
	    }

	    public static void mergeSort(int[] array) {
	        sort(array, 0, array.length -1);
	    }

	    public static void sort(int[] array, int leftIndex, int rightIndex) {
	        if (leftIndex < rightIndex) {
	            int middleIndex = (leftIndex + rightIndex) / 2;

	            sort(array, leftIndex, middleIndex);
	            sort(array, middleIndex + 1, rightIndex);

	            merge(array, leftIndex, middleIndex, rightIndex);
	        }
	    }

	    public static void merge(int[] array, int leftIndex, int middleIndex, int rightIndex) {
	        // how big are the pieces?
	        int leftSize = middleIndex - leftIndex + 1;
	        int rightSize = rightIndex - middleIndex;

	        // make storage locations
	        int[] leftTempArray = new int[leftSize];
	        int[] rightTempArray = new int[rightSize];

	        // store the pieces
	        for (int i = 0; i < leftSize; i++) {
	            leftTempArray[i] = array[leftIndex + i];
	        }

	        for (int j = 0; j < rightSize; j++) {
	            rightTempArray[j] = array[middleIndex + 1 + j];
	        }

	        System.out.println("left temp: ");
	        for (int l: leftTempArray) {
	            System.out.print(l + ", ");
	        }
	        System.out.println("");
	        System.out.println("right temp: ");
	        for (int r: rightTempArray) {
	            System.out.print(r + ", ");
	        }
	        System.out.println("");

	        int leftTempIndex = 0;
	        int rightTempIndex = 0;
	        int k = leftIndex;

	        // compare the storage arrays
	        // move the smaller into the left index
	        while (leftTempIndex < leftSize && rightTempIndex < rightSize) {
	            if (leftTempArray[leftTempIndex] <= rightTempArray[rightTempIndex]) {
	                array[k] = leftTempArray[leftTempIndex];
	                leftTempIndex++;
	            } else {
	                array[k] = rightTempArray[rightTempIndex];
	                rightTempIndex++;
	            }
	            k++;
	        }

	        // ran out of right numbers and have left numbers over
	        while (leftTempIndex < leftSize) {
	            array[k] = leftTempArray[leftTempIndex];
	            leftTempIndex++;
	            k++;
	        }

	        // ran out of right nubmers and have right numbers over
	        while (rightTempIndex < rightSize) {
	            array[k] = rightTempArray[rightTempIndex];
	            rightTempIndex++;
	            k++;
	        }
	    }
	}

