package com.gla.array.level1;

import java.util.Scanner;

public class NumberChecking {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int []num =new int[5];
        for(int i=0;i<num.length;i++){
            num[i]= sc.nextInt();
        }
        for(int i=0;i<num.length;i++){
            if(num[i]<0){
                System.out.println("negetive");
            }
            else if(num[i]==0){
                System.out.println("zero");
            }
            else {
                System.out.println("positive");
            }
        }
        for(int j=0;j<num.length;j++){
            if (num[j] % 2 == 0) {
                System.out.println(num[j]+ " is even");
            }
            else
                System.out.println(num[j]+" is odd");
        }
        for(int j=0;j< num.length;j++){
            if (num[j] > num[j+1]){
                System.out.println("greater one");
            }
            else if(num[j]<num[j+1]){
                System.out.println("less one");
            }
            else {
                System.out.println("Equals");
            }

        }
    }
}
