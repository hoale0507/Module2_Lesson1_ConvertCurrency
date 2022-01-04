package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int rate = 23000;
    System.out.println("Enter USD amount");
    Scanner sc = new Scanner(System.in);
    float usd = sc.nextFloat();
    float vnd = usd * rate;
    System.out.printf("%.0f USD equal to %.0f VND", usd, vnd);
    }
}
