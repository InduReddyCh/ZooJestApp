/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo06group;

import java.io.FileNotFoundException;
import java.lang.invoke.StringConcatException;

/**
 *
 * @author Indu Chinthakuntla
 */
public class Hippopotamus extends Animal {

    private String name;

    public Hippopotamus(String name) {
        super(name);

    }

    @Override
    public void speak() {
        System.out.println("I'm an Hippopotamus!");
    }

    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }
    public void profess() {
        double a = 2.5;
        int b = 2;
        double c = getHippopotamusAddition(a, b);
        System.out.printf("I know HippopotamusAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }
    
    public void divide()throws ArithmeticException{
        try{
          int a=2;
          int b=0;
          System.out.println(a/b);  
        }
        catch(ArithmeticException e){
            System.out.println("throws an exception");
        }
        finally{
            System.out.println("Handling an exception");
        }
        
    }
    public void multipy()throws ArrayIndexOutOfBoundsException{
        try{
            int[] array={1,2,3,4};
            System.out.println("Multiplication of two numbers"+array[3]*array[4]);
        }
        finally{
            System.out.println("handling array exception");
        }
    }
    public void name() {
        try{
            String s1="Indu";
            for(int i=0;i<s1.length();i++)
            System.out.println("character at 10"+s1.charAt(10));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("exception");
        }
        finally{
            System.out.println("string exception");
        }
        
        
    }

    /**
     * Custom Hippopotamus function - your class must use a unique function name
     * unique first parameter identifier unique second parameter identifier do
     * something creative
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getHippopotamusAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public static void main(String[] args) {
        var a = new Hippopotamus("Tester");
        a.speak();
        a.move();
        a.profess();
        a.divide();
        a.name();
        a.multipy();
       
    }

}


    



