/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USE
 */
public class Feature4 {

    private Validate check = new Validate();
    private Scanner sc = new Scanner(System.in);

    public int findUserIndex(String userName, ArrayList<User> userList) {
         //loop from the first to the last of array list 
        for (int i = 0; i < userList.size(); i++) {
            // if name equals name of index i in the listUser
            if (userList.get(i).getName().equalsIgnoreCase(userName)) {
                return i;
            }
        }
        return -1;
    }

    public User inputNewUser(ArrayList<User> userList) {
        int code;
        if (userList.isEmpty()) {
            code = 1;
        } else {
            code = userList.get(userList.size() - 1).getCode() + 1;
        }
        System.out.println("--------- Add Student -----------");
        String userName;
        //check index
        do {
            userName = check.inputStringValue("Enter userName: ",
                    "Please follow fomat Admin x!!!", "^[a-zA-Z]+$");
            //check the code exizt 
            if (this.findUserIndex(userName, userList) != -1) {
                System.out.println("User name is already existed!!");
            } else {
                break;
            }
        } while (true);
        String password = check.inputStringValue("Enter password: ", "Password Invalid", "^[A-Za-z0-9_-]*$");
        User u = new User(code, userName, password, 1);
        return u;
    }

    public boolean addUser(User newUser, ArrayList<User> userList) {

        if (newUser != null) {
            userList.add(newUser);
            return true;
        } else {
            return false;
        }
    }

    public void addUser(ArrayList<User> userList) {

        User newUser = this.inputNewUser(userList);

        if (addUser(newUser, userList)) {
            System.out.println("Add Successfully!");
        } else {
            System.out.println("Add Fail!");
        }
    }

//    public void addUser(List<User> list) {
//        System.out.println("Add User!!");
//        System.out.println("Enter code: ");
//        int code = sc.nextInt();
//        System.out.println("Enter user name: ");
//        String name = sc.nextLine();
//        System.out.println("Enter password: ");
//        String password = sc.nextLine();
//        User u = new User(code, name, password, 1);
//        list.add(u);
//        System.out.println("Add new worker successfully");
//    }
    public int inputIndexUser(ArrayList<User> userList) {
        String userName;
        do {
            userName = check.inputStringValue("Enter User Name: ",
                    "Please follow fomat Admin x!!!", "^[a-zA-Z]+$");
            //check the code exizt 
            if (this.findUserIndex(userName, userList) == -1) {
                System.out.println("This user is not exist");
            }
        } while (this.findUserIndex(userName, userList) == -1);
        int index = this.findUserIndex(userName, userList);
        return index;
    }

    public boolean deleteIndexUser(int index, ArrayList<User> userList) {
        //check index
        if (index >= 0) {
            userList.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public void resetID(int index, ArrayList<User> userList) {
        int size = userList.size();
        for (int i = index; i < size; i++) {
            User e = userList.get(i);
            e.setCode(i + 1);
        }
    }

    public void deleteUser(ArrayList<User> userList) {
        System.out.println("--------- Delete User -------");
        int index = inputIndexUser(userList);
        //Check add new student
        if (deleteIndexUser(index, userList)) {
            resetID(index, userList);
            System.out.println("Delete Successfully!");
        } else {
            System.out.println("Delete Fail!");
        }
    }

//    public void removeUser(List<User> list) {
//        System.out.println("Remove User!!");
//        System.out.println("Enter name: ");
//        String code = sc.nextLine();
//        int size = list.size();
//
//        for (int i = 0; i < size; i++) {
//            User e = list.get(i);
//            if (e.getCode().equals(code)) {
//                list.remove(i);
//                System.out.println("Remove successfully");
//                return;
//            }
//        }
//        System.out.println("Name does not exist");
//    }

      public User inputUpdateUser(User updatedUser) {
        String name = check.inputStringValue("Enter New User Name: ", "Name Invalid",
                "[a-zA-Z]+");
        updatedUser.setName(name);
        String password = check.inputStringValue("Enter New Password: ",
                "Password Invalid", "^[A-Za-z0-9_-]*$");
        updatedUser.setPassword(password);
        return updatedUser;
    }

    public boolean updatedUser(int index, User updatedUser,ArrayList<User> userList) {
        //check new student null or not
        if (index > 0) {
            User oldUser = userList.get(index);
            userList.set(index, updatedUser);
            return true;
        } else {
            return false;
        }

    }


    public void changeUserPassword(ArrayList<User> userList) {
        System.out.println("--------- Update Student -----------");
        // get index of old Doctor
        int index = inputIndexUser(userList);
        // input new doctor's information
        User newUser = inputUpdateUser(userList.get(index));
        //Check add new doctor
        if (updatedUser(index, newUser,userList)) {
            System.out.println("Update Successfully!");
        } else {
            System.out.println("Update Successfully!");
        }
    }
//    public void updateUser(List<User> list) {
//        System.out.println("Update User");
//        System.out.println("Enter Code:");
//        String code = sc.nextLine();
//        for (int i = 0; i < list.size(); i++) {
//            User e = list.get(i);
//            if (e.getCode().equals(code)) {
//                System.out.println("Enter new name: ");
//                e.setName(sc.nextLine());
//                System.out.println("Update name successfully");
//                System.out.println("Enter new password: ");
//                e.setPassword(sc.nextLine());
//                System.out.println("Update user successfully");
//                return;
//            }
//        }
//        System.out.println("code does not exist");
//    }

}
