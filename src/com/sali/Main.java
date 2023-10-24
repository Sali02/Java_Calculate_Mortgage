package com.sali;

import java.awt.*;
import java.text.NumberFormat;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Period (years): ");
        double period = scanner.nextDouble();
        interestRate = (interestRate/100) / 12;
        period *= 12;
        double powerOfEquation;
        powerOfEquation = 1 + interestRate;
        powerOfEquation = Math.pow(powerOfEquation,period);
        double mortgage = principal * ((interestRate * powerOfEquation) / (powerOfEquation - 1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your mortgage payment will be: " + mortgageFormatted);
    }
}