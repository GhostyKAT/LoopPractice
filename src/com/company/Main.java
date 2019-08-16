package com.company;

public class Main {

    public static void main(String[] args) {
	    double[] numbers = new double[]{0, 1.618, 2.718, 3.141592654, 4, 5, 6, 7, 8, 9, 1341};
	    for(int i = 0; i < 11; i++){
	        System.out.println(numbers[(int) Math.pow(numbers[i], 2)]);
	        if(i == 11){
	            break;
            }
        }
        for(double i : numbers) {
            System.out.println(numbers[(int) Math.pow(numbers[(int) i], 2)]);
        }
        while(true){
            for(int i = 0; i < 11; i++){
                System.out.println(numbers[(int) Math.pow(numbers[i], 2)]);
            }
        }
    }
}
