package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.Student;
import Model.User;
import java.util.ArrayList;
import java.util.Scanner;
import Controller.Feature1;
import Controller.Feature2;
import Controller.Feature3;
import Controller.Feature4;
import Controller.Feature5;
import Controller.Feature6;
import Controller.Validate;
import View.Input;
import View.Output;

/**
 *
 * @author hieunxhe140317
 */
public class main {

    /**
     * @param args the command line arguments
     */
    private static boolean check = true;

    public static void main(String[] args) {
        Feature1 f1 = new Feature1();
        Feature2 f2 = new Feature2();
        Feature3 f3 = new Feature3();
        Feature4 f4 = new Feature4();
        Feature5 f5 = new Feature5();
        Feature6 f6 = new Feature6();
        Input ip = new Input();
        Output op = new Output();
        ArrayList<Student> lstS = new ArrayList<>();
        ArrayList<User> lstU = new ArrayList<>();
        Validate v = new Validate();
        Scanner sc = new Scanner(System.in);
        ArrayList<User> loginUser = ip.studentAcc();
        ArrayList<User> loginAdmin = ip.adminAcc();
        lstS = ip.input();

        while (true) {
            String cf = v.inputStringNoRegexValue("Admin or Student??\n",
                    "Please enter a or s");
            if (cf.toLowerCase().equals("a")) {
                ip.menuAdmin();
                int option = v.inputIntValue("Choose 1-6\n", "Input again from 1-6", 1, 6);
                switch (option) {
                    case 1: //View List, add, update, delete Student
                        do {
                            ip.feature1MenuAdmin();
                            int f1Option = v.inputIntValue("Choose 1-5\n",
                                    "Input again from 1-5", 1, 5);
                            switch (f1Option) {
                                case 1: //View list students
                                    op.displayListStudent(lstS);
                                    break;
                                case 2: //Add new student
                                    f1.addStudent(lstS);
                                    break;
                                case 3: //Update a student
                                    f1.updateStudent(lstS);
                                    break;
                                case 4: //Delete a student
                                    f1.deleteStudent(lstS);
                                    break;
                                case 5: //Return to admin menu
                                    check = false;
                                    break;

                            }
                        } while (check);
//                        lstS = ip.input();
//                        op.displayListStudent(lstS);
//                        f1.addStudent(lstS);
//                        op.displayListStudent(lstS);
//                        f1.removeStudent(lstS);
//                        op.displayListStudent(lstS);
//                        f1.updateStudent(lstS);
//                        op.displayListStudent(lstS);
//                        break;
                    case 2:
                        while (check) {
                            ip.feature2MenuAdmin();
                            int select = v.inputIntValue("Chosse 0-3: ", "Invalid ", 0, 3);
                            switch (select) {
                                case 1:
                                    f2.updateMark(lstS);
                                    break;
                                case 2:
                                    f2.deleteMark(lstS);
                                    break;
                                case 3:
                                    op.displayListStudent(lstS);
                                    break;
                                case 0:
                                    check = false;
                                    break;
                            }
                        }
                    case 3:
                        f3.queryStudentInfGroupByClass(lstS);
                        break;
                    case 4:
                        lstU = ip.adminAcc();
                        do {
                            ip.feature4MenuAdmin();
                            int f4Option = v.inputIntValue("Choose 1-5\n",
                                    "Input again from 1-5", 1, 5);
                            switch (f4Option) {
                                case 1: //View list users
                                    op.displayListUser(lstU);
                                    break;
                                case 2: //Add new user
                                    f4.addUser(lstU);
                                    break;
                                case 3: //Update a user
                                    f4.deleteUser(lstU);
                                    break;
                                case 4: //Delete a user
                                    f4.changeUserPassword(lstU);
                                    break;
                                case 5: //Return to admin menu
                                    check = false;
                                    break;

                            }
                        } while (check);
//                        lstU = ip.userAcc();
//                        op.displayListUser(lstU);
//                        f4.addUser(lstU);
//                        op.displayListUser(lstU);
//                        f4.removeUser(lstU);
//                        op.displayListUser(lstU);
//                        f4.updateUser(lstU);
//                        op.displayListUser(lstU);
//                        break;
                    case 5:
                        f5.calPercent(lstS);
                        break;
                    case 6:
                        lstU = ip.adminAcc();
                        do {
                            ip.feature6MenuAdmin();
                            int f6Option = v.inputIntValue("Choose 1-4: \n",
                                    "Input again from 1-4", 1, 4);
                            switch (f6Option) {
                                case 1:
                                    f6.login(lstU);
                                    break;
                                case 2:
                                    f6.logout();
                                    break;
                                case 3:
                                    f6.changUserPass(lstU);
                                    break;
                                case 4:
                                    check = false;
                                    break;
                            }
                        } while (true);
                }
            } else if (cf.toLowerCase().equals("s")) {
                ip.menuStudent();
                int option = v.inputIntValue("Choose 1-2", "Input again from 1-2", 1, 2);
                switch (option) {
                    case 1:
                        f3.queryStudentInfGroupByClass(lstS);
                        break;
                    case 2:
                        lstU = ip.studentAcc();
                        do {
                            ip.feature6MenuAdmin();
                            int f6Option = v.inputIntValue("Choose 1-4: \n",
                                    "Input again from 1-4", 1, 4);
                            switch (f6Option) {
                                case 1:
                                    f6.login(lstU);
                                    break;
                                case 2:
                                    f6.logout();
                                    break;
                                case 3:
                                    f6.changUserPass(lstU);
                                    break;
                                case 4:
                                    check = false;
                                    break;
                            }
                        } while (true);
                }
            } else {
                System.out.println("Please input a or s");
            }
        }

    }

}
