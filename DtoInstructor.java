/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudy;

import java.sql.Date;
import java.time.LocalDate;
import oracle.sql.DATE;

/**
 *
 * @author Resal
 */
public class DtoInstructor {
    private int salary;
    private Date yearOfExperience;
    private int superVisor;
    private int NationalId;
    private String firstName;
    private String lastName;
    private String cirtifate;
    private String  trackname;
    private int trackId;

    DtoInstructor(int nationalId) {
        this.NationalId=nationalId;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    DtoInstructor(int nationalId, String firstName, String lastName, Date yearOfExper, String cirtficate,int trackId) {
        this.NationalId=nationalId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.yearOfExperience=yearOfExper;
        this.cirtifate=cirtficate;
        this.trackId=trackId;
    }
    

   /* DtoInstructor(int nationalId, String firstName, String lastName, Date yearOfExper, String cirtficate) {
               this.NationalId=nationalId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.yearOfExperience=yearOfExper;
        this.cirtifate=cirtficate;
    }*/

    public String getTrackNameIns() {
        return trackname;
    }

    public void setTrackName(String trackName) {
        this.trackname = trackName;
    }


    public DtoInstructor(int salary, Date yearOfExperience, int superVisor,int NationalId, String firstName, String lastName, String cirtifate) {
        this.salary = salary;
        this.yearOfExperience = yearOfExperience;
        this.superVisor = superVisor;
        this.NationalId = NationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cirtifate = cirtifate;
    }

    DtoInstructor(int nationalId, String firstName, Date yearOfexp, int salary, String trackName) {
        this.NationalId = NationalId;
        this.firstName = firstName;
        this.yearOfExperience = yearOfExperience;
        this.salary=salary;
        this.trackname=trackName;
    }
    
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(Date yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public int getSuperVisor() {
        return superVisor;
    }

    public void setSuperVisor(int superVisor) {
        this.superVisor = superVisor;
    }

    public int getNationalId() {
        return NationalId;
    }

    public void setNationalId(int NationalId) {
        this.NationalId = NationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCirtifate() {
        return cirtifate;
    }

    public void setCirtifate(String cirtifate) {
        this.cirtifate = cirtifate;
    }
    public DtoInstructor(int nationalId,String firstName,Date yearOfexp,String cirtifacte,int salary,String trackName){
        this.NationalId=nationalId;
        this.firstName=firstName;
        this.yearOfExperience=yearOfexp;
        this.cirtifate=cirtifacte;
        this.salary=salary;
        this.trackname=trackName;
        
    }
   
    
}
