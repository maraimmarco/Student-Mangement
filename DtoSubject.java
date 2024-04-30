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
public class DtoSubject {
    private int subjectCode;
    private String SubjectName;

    public int getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(int subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    public DtoSubject(int subjectCode, String SubjectName) {
        this.subjectCode = subjectCode;
        this.SubjectName = SubjectName;
    }

    public DtoSubject(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    public DtoSubject(int subjectCode) {
        this.subjectCode = subjectCode;
    }
    
}
