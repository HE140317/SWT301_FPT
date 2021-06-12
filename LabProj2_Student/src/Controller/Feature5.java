/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Student;
import View.Output;
import java.util.List;

/**
 *
 * @author USE
 */
public class Feature5 {
    Output out = new Output();
    /**
     * Calculate Percentages Of Student Grading
     *
     * @param list
     * 
     */
  public void calPercent(List<Student> list){
        System.out.println("Percentage grading");
        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if(s.getClassMarks() > 7.5){
                countA++;
            } else if(s.getClassMarks()>= 6 && s.getClassMarks() <= 7.5){
                countB++;
            } else if(s.getClassMarks() >= 4 && s.getClassMarks() < 6){
                countC++;
            } else if(s.getClassMarks() < 4){
                countD++;
            }
        }
        float A = ((float)countA/(float)list.size())*100;
        float B = ((float)countB/(float)list.size())*100;
        float C = ((float)countC/(float)list.size())*100;
        float D = ((float)countD/(float)list.size())*100;
        out.displayPercentagesOfStudentGrading(A, B, C, D);
    }
    
}
