/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Student;
import Model.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hieunxhe140317
 */
public class Input {

    /**
     * Input Students Info Into List
     *
     * @param studentList
     * @return list
     */
    public ArrayList<Student> input() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "HE140000", "Hieu", "SE1435", 7));
        list.add(new Student(2, "HE140001", "Hieu", "SE1435", 7));
        list.add(new Student(3, "HE140002", "Nguyen", "SE1435", 7));
        list.add(new Student(4, "HE140003", "Thanh", "SE1435", 7));
        list.add(new Student(5, "HE140004", "Nga", "SE1435", 7));
        return list;
    }

    /**
     * Input Admin Accounts Into List
     *
     * @param userList
     * @return list
     */
    public static ArrayList<User> adminAcc() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1, "Admin1", "123", 1));
        list.add(new User(2, "Admin2", "123", 1));
        list.add(new User(3, "Admin3", "123", 1));
        list.add(new User(4, "Admin4", "123", 1));
        return list;
    }

    /**
     * Input Students Accounts Into List
     *
     * @param userList
     * @return list
     */
    public static ArrayList<User> studentAcc() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1, "User1", "123", 0));
        list.add(new User(2, "User2", "123", 0));
        list.add(new User(3, "User2", "123", 0));
        list.add(new User(4, "User3", "123", 0));
        return list;
    }

    /**
     * Display Admin's Menu
     *
     */
    public static void menuAdmin() {
        System.out.println("1. View List, add, update, delete Student");
        System.out.println("2. Add, update, delete, the marks of a specific student");
        System.out.println("3. Query student information, including the marks, group by classes");
        System.out.println("4. View list, add, update, delete user; change user’s password");
        System.out.println("5. Query & print out the percentages of student grading-types (ABCD)");
        System.out.println("6. Login, Logout, change user’s password");
    }

    /**
     * Display Feature1's Menu
     *
     */
    public static void feature1MenuAdmin() {
        System.out.println("1. View list students");
        System.out.println("2. Add new student");
        System.out.println("3. Update a student");
        System.out.println("4. Delete a student");
        System.out.println("5. Return to admin menu");
    }

    /**
     * Display Feature4's Menu
     *
     */
    public static void feature4MenuAdmin() {
        System.out.println("1. View list user");
        System.out.println("2. Add new user");
        System.out.println("3. Delete a user");
        System.out.println("4. Change user's password");
        System.out.println("5. Return to admin menu");
    }

    /**
     * Display Student's Menu
     *
     */
    public static void menuStudent() {
        System.out.println("1. Query student information, including the marks, group by classes");
        System.out.println("2. Login, Logout, change user’s password");
    }

    /**
     * Display Feature6's Menu
     *
     */
    public void feature6MenuAdmin() {
        System.out.println("1. Login");
        System.out.println("2. Logout");
        System.out.println("3. Change user’s password");
        System.out.println("4. Return to admin menu");
    }

    /**
     * Display Feature2's Menu
     *
     */
    public static void feature2MenuAdmin() {
        System.out.println("1.Add mark ");
        System.out.println("2.Update mark ");
        System.out.println("3.Delete mark ");
        System.out.println("4.View student");
        System.out.println("0.Admin menu");
    }
}