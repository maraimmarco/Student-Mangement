/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudy;

/**
 *
 * @author Resal
 */
public class DtoGrade {
    private int grade_code;
    private char grade;

    public int getGrade_code() {
        return grade_code;
    }

    public void setGrade_code(int grade_code) {
        this.grade_code = grade_code;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public DtoGrade(int grade_code, char grade) {
        this.grade_code = grade_code;
        this.grade = grade;
    }
    
}
