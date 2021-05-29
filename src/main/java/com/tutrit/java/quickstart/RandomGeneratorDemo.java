package com.tutrit.java.quickstart;

import java.util.Random;

public class RandomGeneratorDemo {

    public static void main(String[] args){

        int a= (int) (1+Math.random()*100*Math.random());
        double b= Math.random()*5;
        int c= (int) (Math.random()*200) -100;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("random numbers summ is " + (a+b+c));











    }
}
