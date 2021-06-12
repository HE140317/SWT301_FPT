/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USE
 */
public class Feature6 {

    private Validate check = new Validate();
    Scanner sc = new Scanner(System.in);
    private boolean isLogin = false;

    public void login(List<User> list) {
        System.out.println("Login!!!");

        if (!isLogin) {

            String userName = check.inputStringValue("Enter User Name: ",
                    "User Name has >=5 chars, unique & must start with a letter character", "[a-zA-Z][a-zA-Z0-9]{4,100}");

            String password = check.inputStringValue("Enter Password: ",
                    "Password must include >=6 chars, including only letters or numbers ", "^[a-zA-Z0-9]{6,100}");
            for (int i = 0; i < list.size(); i++) {
                User u = list.get(i);
                if (u.getName().equals(userName) && u.getPassword().equals(password)) {

                    isLogin = true;
                }

            }
            if (isLogin) {
                System.out.println("Login Succesfull!");
            } else {
                System.out.println("Login fail");
            }
        } else {
            System.out.println("You are already logged in");
            return;
        }
    }

    public void logout() {
        String cf = check.inputStringNoRegexValue("Do you want to logout?(Y/N)", "");
        if (cf.toLowerCase().equals("yes") || cf.toLowerCase().equals("YES")) {
            isLogin = false;
            System.exit(0);
        } else {
            return;
        }
    }

    public void changUserPass(List<User> list) {
        System.out.println("Change User Pass");
        int code = check.inputIntValue("Enter Code:", "Code must be a integer number", 0, Integer.MAX_VALUE);
        for (int i = 0; i < list.size(); i++) {
            User e = list.get(i);
            if (e.getCode() == code) {
                String password = check.inputStringValue("Enter Password: ",
                        "Password must include >=6 chars, including only letters or numbers ", "^[a-zA-Z0-9]{6,100}");
                e.setPassword(password);
                System.out.println("Change pass successfully");
                return;
            }
        }
        System.out.println("code does not exist");
    }

    public void display(List<User> list) {
        for (User e : list) {
            System.out.println(e);
        }
    }

}
