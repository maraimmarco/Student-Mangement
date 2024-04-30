/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudy;

import java.io.IOException;
import java.sql.DriverManager;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Resal
 */
public class switches {
    private Stage stage;
    private Parent root;

    public switches(Stage stage, Parent root) {
        this.stage = stage;
        this.root = root;
    }

    public void switchToStudent() throws IOException {
        FXMLDocumentBase studentBase = new FXMLDocumentBase();
        handler handler = new handler(stage, studentBase);  // Pass the studentBase to handler
        Scene scene = new Scene(studentBase);
        if (stage != null) {
            stage.setScene(scene);
            stage.show();
        } else {
            System.err.println("Error: Stage is not initialized.");
        }
    }
    public void switchToHime() throws IOException{
        System.out.println("enter to method ");
        
         homeBaseBase HomePage = new homeBaseBase();
         handler handler = new handler(stage, HomePage);  // Pass the studentBase to handler
        Scene scene = new Scene(HomePage);
        if (stage != null) {
            stage.setScene(scene);
            stage.show();
            System.out.println("end the method");
        } else {
            System.err.println("Error: Stage is not initialized.");
        }
    }
    public void switchToInstrucor() throws IOException{
        System.out.println("Enter method");
            instructorBase instructorSwitch =new instructorBase();
            handler handler =new handler(stage,instructorSwitch);
            Scene scene =new Scene(instructorSwitch);
            if (stage != null){
                stage.setScene(scene);
                stage.show();
                System.out.println("end of method ");
            }else {
                System.err.println("Error: Stage is not initialized.");
            }
            
    }
    public void switchToTrack() throws IOException{
        System.out.println("enter to track scene");
        trackBase trackSwitch =new trackBase();
        handler handler=new handler(stage,trackSwitch);
        Scene scene=new Scene(trackSwitch);
        if (stage != null){
                stage.setScene(scene);
                stage.show();
                System.out.println("end of method ");
            }else {
                System.err.println("Error: Stage is not initialized.");
            }
    }
    public void switchToBranch() throws IOException{
        System.out.println("enter to branch scene ");
        BranchBase branchBase=new BranchBase();
        handler handler=new handler(stage,branchBase);
        Scene scene=new Scene(branchBase);
        if (stage != null){
                stage.setScene(scene);
                stage.show();
                System.out.println("end of method ");
            }else {
                System.err.println("Error: Stage is not initialized.");
            }
    }
    
    public void switchToSubject() throws IOException{
        SubjectBase subjectBase=new SubjectBase();
        handler handler =new handler(stage,subjectBase);
        Scene scene=new Scene(subjectBase);
        if (stage != null){
                stage.setScene(scene);
                stage.show();
                System.out.println("end of method ");
            }else {
                System.err.println("Error: Stage is not initialized.");
            }
    }
        public void switchToreport() throws IOException{
        ReportBase reportbase=new ReportBase();
        handler handler =new handler(stage,reportbase);
        Scene scene=new Scene(reportbase);
        if (stage != null){
                stage.setScene(scene);
                stage.show();
                System.out.println("end of method ");
            }else {
                System.err.println("Error: Stage is not initialized.");
            }
    }
        
}
