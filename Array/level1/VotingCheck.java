package com.gla.Array.level1;


import java.sql.SQLOutput;
import java.util.Scanner;

    public class VotingCheck {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int []ages=new int[10];
            for(int i=0;i<ages.length;i++) {
                System.out.println("enter ages of student");
                ages[i] = sc.nextInt();
            }
            for(int age:ages)
                if(age<0){
                    System.out.println("invalid output");
                }
                else if(age>=18){
                    System.out.println("the student with " +  age + " can vote");

                }
                else {
                    System.out.println("the student with age " + age + " can not vote");
                }

        }
    }


