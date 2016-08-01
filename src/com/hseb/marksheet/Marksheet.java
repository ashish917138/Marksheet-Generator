/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hseb.marksheet;

import java.util.Scanner;

/**
 *
 * @author Aasick
 */
public class Marksheet {

    double eng, math, comp, nep, acc;
    double passMark = 32;
    double fullMark = 500;

    Scanner input = new Scanner(System.in);

    public void entry() {
        System.out.println("English: ");
        eng = input.nextDouble();
        System.out.println("Math: ");
        math = input.nextDouble();
        System.out.println("Computer: ");
        comp = input.nextDouble();
        System.out.println("Nepali: ");
        nep = input.nextDouble();
        System.out.println("Account: ");
        acc = input.nextDouble();
    }

    public boolean isfail() {
        return (eng < passMark || math < passMark || comp < passMark || nep < passMark || acc < passMark);
    }

    public double getTotal() {
        return (eng + math + comp + nep + acc);
    }

    public double getPercentage() {
        return (getTotal() / fullMark) * 100;
    }
    public String getGrade() {
        double per = getPercentage();
        String grade = "";
        if (per >= 80) {
            grade = "Distinction";
        } else if (per < 80 && per >= 60) {
            grade = "First Division";
        } else if (per < 60 && per >= 45) {
            grade = "Second Division";
        } else {
            grade = "Third Division";
        }
        return grade;
        
    }

}
