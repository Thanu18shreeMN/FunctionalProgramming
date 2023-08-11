package com.inter;


public class Even {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        int[] arr = {12, 23, 11, 19, 25, 32, 16, 22};

             NumberFilter isEven = Even::isEvenNumber;

        System.out.println("Even numbers:");
        for (int num : arr) {
            if (isEven.test(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
	    


