package com.inter;
import java.util.function.*;

class Candidate implements AgeChecker {
       public boolean isAgeValid(int age) {
        return age > 18;
    }
}


public class Age {
	public static void main(String[] args) {
        int[] agearray = {12, 23, 11, 19, 35, 22};

        Candidate candidate = new Candidate();
      
        Predicate<Integer> agePredicate = candidate::isAgeValid;

        for (int age : agearray) {
            if (agePredicate.test(age)) {
                System.out.println("Valid age");
            } else {
                System.out.println("Invalid age");
            }
        }
    }

}
