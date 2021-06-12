/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author USE
 */
public class User {
    private int code;
    private String name, password;
    private int role;

    public User() {
    }

    public User(int code, String name, String password, int role) {
        this.code = code;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    
   
    @Override
    public String toString() {
        return code + "\t" + name + "\t" + password + "\t" + role;
    }

}
