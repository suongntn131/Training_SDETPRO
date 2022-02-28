package lession_02;

import java.util.Scanner;

public class Lab21 {
    /**
     * Underweight = <18.5
     * Normal weight = 18.5 – 24.9
     * Overweight = 25–29.9
     * Obesity = BMI of 30 or greater
     * BMI = weight / (height x 2)
     */
    public static void main(String[] args) {
        float height;
        float weight;
        float bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height (m): ");
        height = scanner.nextFloat();
        System.out.print("Please enter your weight (kg): ");
        weight = scanner.nextFloat();
        bmi = weight/(height*2);
        if (bmi < 18.5){
            System.out.println("You are a bit thin");
        } else if (bmi < 25){
            System.out.println("Great, you have a fit body");
        } else if (bmi < 30){
            System.out.println("You are a bit fat");
        } else {
            System.out.println("You are obese, lose weight to be good for your health");
        }

    }
}
