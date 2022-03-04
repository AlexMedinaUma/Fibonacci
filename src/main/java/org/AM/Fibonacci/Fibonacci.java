package org.AM.Fibonacci;

/**
 * Class providing a method that computes Fibonacci on a natural number
 *
 * @author Alejandro Medina Astorga
 */

public class Fibonacci {
    public int compute(int value) {
        int result;
        if(value < 0){
            throw new RuntimeException("The value is negative: " + value);
        } else if(value == 0){
            result = 0;
        } else if(value == 1){
            result = 1;
        }else{
            result = compute(value - 1) + compute(value - 2);
        }
        return result;
    }
}
