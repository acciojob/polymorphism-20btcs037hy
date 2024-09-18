package com.driver;

// Task 1 
public class Main{
    

    public static void main(String[] args) {
        // Task 2
        Product p = new Product();
        p.product(10, 20);
        p.product(20, 30, 40);
        p.product(10.50, 20.40);

    }
       public static class Product{
        // Task 3
        public static int product(int x, int y){
            return x*y;
        }
        // Task 4
        public static int product(int x, int y, int z){
            return x*y*z;
        }
        // Task 5
        public static double product(double x, double y){
            return x*y;  
        }

    }

    }
