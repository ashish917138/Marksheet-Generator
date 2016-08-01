/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hseb.marksheet;

import com.hseb.marksheet.Marksheet;
import java.util.Scanner;

/**
 *
 * @author Aasick
 */
public class Marks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Marksheet marksheet = new Marksheet();
        Scanner input = new Scanner(System.in);
        while (true) {
         marksheet.entry();
         
            
       

            if (marksheet.isfail()) {
                System.out.println("You have failed");
            } else {
                double total = marksheet.getTotal();
                double per = marksheet.getPercentage();
                String grade = marksheet.getGrade();
                
                System.out.println("Total marks obtained is " + total);
                System.out.println("Percentage is " + per);
                System.out.println("Grade is " + grade);
            }

            System.out.println("Do you want to continue[Y/N]");
            
            if(input.next().equalsIgnoreCase("n")){
                System.exit(0);
            }
        }
    }
}
