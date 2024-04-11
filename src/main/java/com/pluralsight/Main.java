package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //Question 1
        int bobSalary = 80000;
        int garySalary = 100000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("This highest salary is: " + highestSalary);

        //Question 2
        int carPrice = 75000;
        int truckPrice = 90000;
        int smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is: " + smallestPrice);

        //Question 3
        double Radius = 7.25F;
        double Area = Math.PI * Radius * Radius;
        System.out.println("The area of the circle is: " + Area);

        //Question 4
        double Variable = 5.0;
        double squareRoot = Math.sqrt(Variable);
        System.out.println("The square root of 5.0 is: " + squareRoot);

        //Question 5

    }
}