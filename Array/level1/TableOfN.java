package com.gla.array.level1;

import java.util.Scanner;

public class TableOfN {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            int product=n*i;
            System.out.println(n +"*"+ i +"="+ product);
        }
    }
}


