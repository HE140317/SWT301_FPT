/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Student;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USE
 */
public class Feature2 {

    private Validate check = new Validate();
    private final Scanner sc = new Scanner(System.in);
    private Student e = new Student();

    public void updateMark(List<Student> list) {
        System.out.println("Update Mark");
        int ID = check.inputIntValue("Input id: ", "Invalid", 0, Integer.MAX_VALUE);
        double mark = check.inputDoubleValue("", "Mark must be number.Re-enter: ", 0, 10);
        for (int i = 0; i < list.size(); i++) {
            e = list.get(i);
            if (e.getId() == ID) {
                System.out.println("Enter new mark: ");
                e.setClassMarks(mark);
                System.out.println("Update mark successfully");
                return;
            }
        }
        System.out.println("ID does not exist");
    }

    public void deleteMark(List<Student> list) {
        System.out.println("Delete Mark");
        System.out.println("Enter ID: ");
        int ID = check.inputIntValue("", "ID must be integer number.Re-enter: ", 0, Integer.MAX_VALUE);
        for (int i = 0; i < list.size(); i++) {
            e = list.get(i);
            if (e.getId() == ID) {
                e.setClassMarks(0);
                System.out.println("Mark has been setted to 0");
                return;
            }
        }
        System.out.println("ID does not exist");
    }
}
