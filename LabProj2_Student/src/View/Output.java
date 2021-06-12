/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Student;
import Model.User;
import java.util.List;

/**
 *
 * @author hieunxhe140317
 */
public class Output {

    /**
     * Display List Of Students
     *
     * @param ID, USERNAME, NAME, CLASS NAME, CLASS MARKS
     */
    public void displayListStudent(List<Student> list) {
        System.out.format("%s%20s%20s%20s%20s\n", "ID", "User Name", "Name", "Class Name", "Class Marks");
        for (Student e : list) {
            System.out.format("%d%20s%20s%20s%20f\n", e.getId(), e.getUserName(), e.getName(), e.getClassName(), e.getClassMarks());
        }
    }

    /**
     * Display List Of Users
     *
     * @param USERCODE, USERNAME, PASSWORD, ROLE
     */
    public void displayListUser(List<User> list) {
        System.out.format("%s%20s%20s%20s\n", "User Code", "User Name", "Password", "Role");
        for (User e : list) {
            System.out.format("%d%25s%22s%20d\n", e.getCode(), e.getName(), e.getPassword(), e.getRole());
        }
    }

    /**
     * Display Percentages Of Student Grading
     *
     * @param A,B, C, D
     *
     */
    public void displayPercentagesOfStudentGrading(double A, double B, double C, double D) {
        System.out.printf("A: %.2f ", A);
        System.out.println("%");
        System.out.printf("B: %.2f ", B);
        System.out.println("%");
        System.out.printf("C: %.2f ", C);
        System.out.println("%");
        System.out.printf("D: %.2f ", D);
        System.out.println("%");
    }
}