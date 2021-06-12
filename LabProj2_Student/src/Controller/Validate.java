/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USE
 */
public class Validate {
    private static Scanner sc = new Scanner(System.in);

    /**
     * input an integer value
     *
     * @param message
     * @param err
     * @param min
     * @param max
     * @return (Int)number
     */
    
    
    public int inputIntValue(String message, String err, int min, int max) {
        int number;
        // while true
        while (true) {
            try {
                System.out.print(message);
                number = Integer.parseInt(sc.nextLine());
                //check the number out of range
                if (number < min || number > max) {
                    System.out.print(err);
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print(err);
            }
        }
    }
        /**
     * input an double value
     *
     * @param message
     * @param err
     * @param min
     * @param max
     * @return (Double)number
     */
    
    public double inputDoubleValue(String message, String err, double min, double max) {
        double number;
        // while true
        while (true) {
            try {
                System.out.print(message);
                number = Double.parseDouble(sc.nextLine());
                //check the number out of range
                if (number < min || number > max) {
                    System.out.print(err);
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print(err);
            }
        }
    }

    /**
     * input string value
     *
     * @param message
     * @param err
     * @param regex
     * @return string
     */
    public String inputStringValue(String message, String err, String regex) {
        String string;
        //while true
        while (true) {
            System.out.print(message);
            string = sc.nextLine();
            //check input string
            if (!string.matches(regex) || string.trim().equals("")) {
                System.out.println(err);
                continue;
            }
            return string.trim();
        }
    }

    /**
     * input string value
     *
     * @param message
     * @param err
     * @return string
     */
    public String inputStringNoRegexValue(String message, String err) {
        String string;
        //while true
        while (true) {
            System.out.print(message);
            string = sc.nextLine();
            //check input string
            if (string.trim().equals("")) {
                System.out.println(err);
                continue;
            }
            return string.trim();
        }
    }
    
}
