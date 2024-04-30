/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudy;

import java.sql.Date;
import java.time.LocalDate;
import javafx.scene.control.TableColumn;

/**
 *
 * @author Resal
 */
public class DtoStudent {
    private String firstName;
    private String lastName;
    private String UserName;
    private String phone;
    private int  TrackId;
    private Date DateOfBirth ;
    private int nationalId;
    private int age;
    private String trackName;
    private String facultyName;
    private int facultyId;
    public DtoStudent(String firstName, String lastName, String UserName, String phone, int TrackId, LocalDate DateOfBirth, int nationalId, int facultyId, String facultyName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.UserName = UserName;
        this.phone = phone;
        this.TrackId = TrackId;
        this.DateOfBirth = java.sql.Date.valueOf( DateOfBirth);
        this.facultyId=facultyId;
        this.facultyName=facultyName;
        this.nationalId = nationalId;
    }
    public DtoStudent(String FirstName){
        this.firstName=firstName;
    }
    public DtoStudent(int nationalId, String firstName,String lastName,int TrackId, Date dateOfBirth)
    {
        this.nationalId=nationalId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.TrackId=TrackId;
        this.DateOfBirth=dateOfBirth;
    }
    public DtoStudent(int nationalId,String firstName,String lastName,int TrackId,int age,String trackName,String facultyName){
        this.nationalId=nationalId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.TrackId=TrackId;
        this.age=age;
        this.trackName=trackName;
        this.facultyName=facultyName;
        //this.facultyId=facultyId;
    }

    public DtoStudent(String firstName, String lastName, String UserName, String phone, int TrackId, Date DateOfBirth, int nationalId, int age, String trackName, String facultyName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.UserName = UserName;
        this.phone = phone;
        this.TrackId = TrackId;
        this.DateOfBirth = DateOfBirth;
        this.nationalId = nationalId;
        this.age = age;
        this.trackName = trackName;
        this.facultyName = facultyName;
    }

    public DtoStudent(int nationalId,String firstName, String lastName, String UserName, Date DateOfBirth, String phone, int TrackId, int age, String trackName, String facultyName, int facultyId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.UserName = UserName;
        this.phone = phone;
        this.TrackId = TrackId;
        this.DateOfBirth = DateOfBirth;
        this.nationalId = nationalId;
        this.age = age;
        this.trackName = trackName;
        this.facultyName = facultyName;
        this.facultyId = facultyId;
    }

    DtoStudent(String firstName, String lastName, String userName, String phone, int trackId, LocalDate dateOfBirthTxtField, int nationalId) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.UserName=userName;
        this.phone = phone;
        this.TrackId = TrackId;
        this.DateOfBirth = DateOfBirth;
        this.nationalId = nationalId;
        this.age = age;
        this.trackName = trackName;
   
       
    }


    

    DtoStudent(int nationalId, String firstName, String lastName, int trackId, int age, String trackName) {
        this.nationalId=nationalId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.TrackId=trackId;
        this.age=age;
        this.trackName=trackName;
    }

    DtoStudent(int nationalId, String firstName, String lastName, String userName, Date dateOfBirthTxtField, String phone,int trackId) {
      this.firstName = firstName;
        this.lastName = lastName;
        this.UserName = userName;
        this.phone = phone;
        this.TrackId = TrackId;
        this.DateOfBirth = dateOfBirthTxtField;
        this.nationalId = nationalId;
        this.age = age;  
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }
    public DtoStudent(int nationalId){
        this.nationalId=nationalId;
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

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getTrackId() {
        return TrackId;
    }

    public void setTrackId(int TrackId) {
        this.TrackId = TrackId;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getTrackName(){
        return trackName;
    }
    public void setTrackName(String TrackName){
        this.trackName=TrackName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    
}
