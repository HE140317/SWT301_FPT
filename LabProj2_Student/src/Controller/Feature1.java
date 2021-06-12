/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hieunxhe140317
 */
public class Feature1 {

    Validate check = new Validate();

    /**
     * Check index in ArrayList
     *
     * @param studentCode
     * @param studentList
     * @return i, -1
     */
    public int findStudentIndex(String studentCode, ArrayList<Student> studentList) {
        //loop from the first to the last of array list 
        for (int i = 0; i < studentList.size(); i++) {
            // if code equals code of index i in the listStudent
            if (studentList.get(i).getUserName().equalsIgnoreCase(studentCode)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Input information of new student
     *
     * @param studentList
     * @return student
     */
    public Student inputNewStudent(ArrayList<Student> studentList) {
        int id;
        if (studentList.isEmpty()) {
            id = 1;
        } else {
            id = studentList.get(studentList.size() - 1).getId() + 1;
        }
        System.out.println("--------- Add Student -----------");
        String userName;
        //check index
        do {
            userName = check.inputStringValue("Enter userName: ",
                    "Please follow fomat HE1xxxxx!!!", "^HE1\\d{5}$");
            //check the code exizt 
            if (this.findStudentIndex(userName, studentList) != -1) {
                System.out.println("User name is already existed!!");
            } else {
                break;
            }
        } while (true);
        String name = check.inputStringValue("Enter name: ", "Name Invalid", "[a-zA-Z ]+");
        String className = check.inputStringValue("Enter class name: ",
                "PLease follow fomat SE1xxx", "^SE1\\d{3}$");
        double classMarks = check.inputDoubleValue("Enter mark: ",
                "Please enter a number from 0 to 10", 0, 10);
        Student s = new Student(id, userName, name, className, classMarks);
        return s;
    }

    public boolean addStudent(Student newStudent, ArrayList<Student> studentList) {
        //check newStudent null or not
        if (newStudent != null) {
            studentList.add(newStudent);
            return true;
        } else {
            return false;
        }
    }

    /**
     * function add
     */
    public void addStudent(ArrayList<Student> studentList) {
        // input new student's information
        Student newStudent = this.inputNewStudent(studentList);
        //Check add new student
        if (addStudent(newStudent, studentList)) {
            System.out.println("Add Successfully!");
        } else {
            System.out.println("Add Fail!");
        }
    }

    /**
     * Display the list
     *
     * @param studentList
     */
    public void displayStudent(ArrayList<Student> studentList) {
        System.out.println("--------- List Student ------------");
        System.out.println("ID\tUsername\tName\tClassName\tClassMarks");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    /**
     * Input index
     *
     * @return index
     */
    public int inputIndexStudent(ArrayList<Student> studentList) {
        String userName;
        do {
            userName = check.inputStringValue("Enter userName: ",
                    "Please follow fomat HE1xxxxx!!!", "^HE1\\d{5}$");
            //check the code exizt 
            if (this.findStudentIndex(userName, studentList) == -1) {
                System.out.println("This student is not exist");
            }
        } while (this.findStudentIndex(userName, studentList) == -1);
        int index = this.findStudentIndex(userName, studentList);
        return index;
    }

    /**
     * Reset ID from the member u had deleted
     *
     * @param index
     */
    public void resetID(int index, ArrayList<Student> studentList) {
        int size = studentList.size();
        for (int i = index; i < size; i++) {
            Student e = studentList.get(i);
            e.setId(i + 1);
        }
    }
    
    /**
     * Delete a student with index input
     *
     * @param index
     * @return true|| false
     */
    public boolean deleteIndexStudent(int index, ArrayList<Student> studentList) {
        //check index
        if (index >= 0) {
            studentList.remove(index);
            return true;
        } else {
            return false;
        }
    }

    /**
     * function delete
     */
    public void deleteStudent(ArrayList<Student> studentList) {
        System.out.println("--------- Delete Student -------");
        int index = inputIndexStudent(studentList);
        //Check add new student
        if (deleteIndexStudent(index, studentList)) {
            resetID(index, studentList);
            System.out.println("Delete Successfully!");
        } else {
            System.out.println("Delete Fail!");
        }
    }

    /**
     * Input information of new student
     *
     * @return student
     */
    public Student inputUpdateStudent(Student updatedStudent) {
        String name = check.inputStringValue("Enter Name: ", "Name Invalid",
                "[a-zA-Z ]+");
        updatedStudent.setName(name);
        String className = check.inputStringValue("Enter class name: ",
                "PLease follow fomat SE1xxx", "^SE1\\d{3}$");
        updatedStudent.setClassName(className);
        double classMarks = check.inputDoubleValue("Enter mark: ",
                "Please enter a number from 0 to 10", 0, 10);
        updatedStudent.setClassMarks(classMarks);
        return updatedStudent;
    }

    /**
     * Function update student's information
     *
     * @param newStudent
     */
    public boolean updateStudent(int index, Student updatedStudent,
            ArrayList<Student> studentList) {
        //check new student null or not
        if (index > 0) {
            Student oldStudent = studentList.get(index);
            studentList.set(index, updatedStudent);
            return true;
        } else {
            return false;
        }

    }

    /**
     * function update
     */
    public void updateStudent(ArrayList<Student> studentList) {
        System.out.println("--------- Update Student -----------");
        // get index of old Doctor
        int index = inputIndexStudent(studentList);
        // input new doctor's information
        Student newStudent = inputUpdateStudent(studentList.get(index));
        //Check add new doctor
        if (updateStudent(index, newStudent,studentList)) {
            System.out.println("Update Successfully!");
        } else {
            System.out.println("Update Successfully!");
        }
    }
}
