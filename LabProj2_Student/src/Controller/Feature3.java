/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Student;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author win
 */
public class Feature3 {

    Validate check = new Validate();
    Scanner sc = new Scanner(System.in);
    /**
     * Query student information  Group By Class
     *
     * @param List<Student> LssS
     */
    public void queryStudentInfGroupByClass(List<Student> lstS) {
       lstS.sort(new Comparator<Student>(){
           public int compare(Student a , Student b){
               return a.getClassName().compareTo(b.getClassName());
           }
       });
    }
  

}
