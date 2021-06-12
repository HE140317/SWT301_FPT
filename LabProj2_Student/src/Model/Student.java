/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hieunxhe140317
 */
public class Student {

    private int id;
    private String userName, name, className;
    private double classMarks;

    public Student() {
    }

    public Student(int id, String userName, String name, String className, double classMarks) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.className = className;
        this.classMarks = classMarks;
    }

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return className
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return classMarks
     */
    public double getClassMarks() {
        return classMarks;
    }

    /**
     * @param classMarks
     */
    public void setClassMarks(double classMarks) {
        this.classMarks = classMarks;
    }

    /**
     * Convert mark into Type A B C D
     *
     * @param mark
     * @return A B C D
     */
    public String getType(double mark) {
        String type = "";
        if (mark > 7.5) {
            type = "A";
        } else if (mark >= 6 && mark <= 7.5) {
            type = "B";
        } else if (mark >= 4 && mark < 6) {
            type = "C";
        } else {
            type = "D";
        }
        return type;
    }

    @Override
    public String toString() {
        return id + "\t" + userName + "\t" + name + "\t" + className + "\t"
                + getType(classMarks);
    }

}