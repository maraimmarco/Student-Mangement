/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudy;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.Stage;
import casestudy.FXMLDocumentBase;
import casestudy.DtoInstructor;
import com.sun.glass.ui.MenuItem;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.EventType;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 *
 * @author Resal
 */
public class handler {
    final TableView<DtoStudent>[] finalTableViewStudent = new TableView[]{new TableView<>()};
    final TableColumn<DtoStudent , String>[] finalColumnFirstName=new TableColumn[]{null};
    final TableColumn<DtoStudent ,String>[] finalColumnLastName=new TableColumn[] {null};
    final TableColumn<DtoStudent,String>[] finalCOlumnTrackName=new TableColumn[] {null};
    final TableColumn<DtoStudent,Long>[] finalColumnNationalId=new TableColumn[] {null};
    final TableColumn<DtoStudent,Integer>[] finalDolumnDateOfbirth=new TableColumn[] {null};
    final TableColumn<DtoStudent,String>[] finalcolumnFacultyname=new TableColumn[] {null};
    final ArrayList<DtoStudent>[] finalStudent = new ArrayList[]{null};
    /////////////////////////////////////////////////////////////////////////////////
    final ArrayList<DtoInstructor>[] finalInstructor=new ArrayList[]{null};
    final TableView<DtoInstructor>[] finalTableViewInstructor=new TableView[]{new TableView<>()};
    final TableColumn<DtoInstructor,Long>[] finalColumnNationalIdInstructor=new TableColumn[] {null};
    final TableColumn<DtoInstructor,String>[] finalColumnFirstNameInstructor=new TableColumn[] {null};
    final TableColumn<DtoInstructor,String>[] finalColumnCirtifacteColumn=new TableColumn[] {null};
    final TableColumn<DtoInstructor,Integer>[] finalcolumnSalaryInstructor=new TableColumn[] {null};
    final TableColumn<DtoInstructor,Integer>[] finalColumnYearOfExperince=new TableColumn[] {null};
    final TableColumn<DtoInstructor,String>[] finalcolumnTrackNameIns=new TableColumn[] {null};
    /////////////////////////////////////////////////////////////////////////////////////////
    final ArrayList<DtoTrack>[] finalTrack=new ArrayList[] {null};
    final TableView<DtoTrack>[] finalTableViewTrack=new TableView[] {new TableView<> ()};
    final TableColumn<DtoTrack,Integer>[] finalColumnTrackIdTrack=new TableColumn[] {null};
    final TableColumn<DtoTrack,String>[] finalColumnTrackNameTrack=new TableColumn[] {null};
    /////////////////////////////////////////////////////////////////////////
    final ArrayList<DtoBranch>[] finalBranch=new ArrayList[] {null};
    final TableView<DtoBranch>[] finalTableViewBranch=new TableView[] {new TableView<> ()};
    final TableColumn<DtoBranch,Integer>[] finalColumnBranchId=new TableColumn[] {null};
    final TableColumn<DtoBranch,String>[] finalColumnBranchCity=new TableColumn[] {null};
    final TableColumn<DtoBranch,String>[] finalColumnBranchAddress=new TableColumn[] {null};
    ///////////////////////////////////////////////////////////////////////////////////
    final ArrayList<DtoSubject>[] finalSubjet=new ArrayList[] {null};
    final TableView<DtoSubject>[] finalTableViewSubject=new TableView[] {new TableView<> ()};
    final TableColumn<DtoSubject,Integer>[] finalColumnSubjectId=new TableColumn[] {null};
    final TableColumn<DtoSubject,String>[] finalColumnSubjectName=new TableColumn[] {null};
    ////////////////////////////////////////////////////////////////////////////////////
    final ArrayList<DtoTrack>[] finalTrackName=new ArrayList[] {null};
    final TableView<DtoTrack>[] finalTableViewTrackName=new TableView[] {new TableView<>()};
    final TableColumn<DtoTrack,String>[] finalColtrackName=new TableColumn[] {null};
    final TableColumn<DtoSubject,String>[] finalColSubjectName=new TableColumn[] {null};
            
    public handler(Stage stage , FXMLDocumentBase FX){
        
        FX.getHome().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                switches switches = new switches(stage, (Parent) FX);
                try {
                    switches.switchToHime();
                } catch (IOException ex) {
                    Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        FX.getInsert().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
            public void handle(ActionEvent event) {
                   DtoStudent student = new DtoStudent(FX.getNationalId(),FX.getFirstName(),FX.getLastName(),FX.getUserName(),(Date.valueOf(FX.getDateOfBirthTxtField())),FX.getPhone(),FX.getTrackID());
                   System.out.println((Date.valueOf(FX.getDateOfBirthTxtField())));
                   DAO.addStudent(student);
                   System.out.println("inserted a new student");
            }          
});  
        FX.getSelectStudent().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
            public void handle(ActionEvent event) {
                ArrayList<DtoStudent> student= new ArrayList<>();    
                try {
                      student=(ArrayList<DtoStudent>) DAO.selectAll();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    
                    if (student != null){
                       finalStudent[0] = student;
                       finalTableViewStudent[0] = FX.getTableView();
                       finalColumnFirstName[0]=FX.getFirstNameCol();
                       finalColumnLastName[0]=FX.getLastNameCol();
                       finalCOlumnTrackName[0]=FX.getTrackNameCol();
                       finalColumnNationalId[0]=FX.getNationalCol();
                       finalDolumnDateOfbirth[0]=FX.getDateOfBirthCol();
                      
                       finalColumnFirstName[0].setCellValueFactory(cellData ->{
                           return new SimpleStringProperty(cellData.getValue().getFirstName());
                       });
                        finalColumnLastName[0].setCellValueFactory(cellData ->{
                           return new SimpleStringProperty(cellData.getValue().getLastName());
                       });
                        //finalCOlumnTrackName[0].setCellValueFactory(cellData -> return new SimpleIntegerProperty(cellData.getValue().getTrackId()).asObject());
                        //finalCOlumnTrackName[0].setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getTrackId().asObject()));
                       //finalCOlumnTrackName[0].setCellValueFactory(cellData -> new SimpleLongProperty(cellData.getValue().getTrackId()).asObject());
                       finalColumnNationalId[0].setCellValueFactory(cellData -> new SimpleLongProperty(cellData.getValue().getNationalId()).asObject());
                       //finalDolumnDateOfbirth[0].setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getAge()).asObject();
                       finalDolumnDateOfbirth[0].setCellValueFactory(cellData ->
                            new SimpleIntegerProperty(cellData.getValue().getAge()).asObject());
                       finalCOlumnTrackName[0].setCellValueFactory(cellData ->{
                           return new SimpleStringProperty(cellData.getValue().getTrackName());
                       });
                         //finalcolumnFacultyname[0].setCellValueFactory(cellData ->{
                          // return new SimpleStringProperty(cellData.getValue().getFacultyName());
//                       });

                       //finalDolumnDateOfbirth[0].setCellValueFactory(cellData -> {
                         //  return new SimpleObjectProperty(cellData.getValue().getDateOfBirth());
                       //});
                // Update TableView with the retrieved data
                
                       finalTableViewStudent[0].getItems().clear();
                       finalTableViewStudent[0].getItems().addAll(student);
                        
                    }
            }           
});
      FX.getdelete().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            DtoStudent selectedStudent = finalTableViewStudent[0].getSelectionModel().getSelectedItem();
            System.out.println(selectedStudent);
            if (selectedStudent != null) {
                DtoStudent studentToDelete = new DtoStudent(selectedStudent.getNationalId());
                System.out.println(studentToDelete);
                if (DAO.selectNationalId(studentToDelete)) {
                    int result = DAO.deleteStudent(studentToDelete);
                    System.out.print(result);
                    if (result > 0) {
                        System.out.println("Student deleted successfully");
                      
                        finalTableViewStudent[0].getItems().remove(selectedStudent);
                    } else {
                        System.out.println("No matching student found for deletion");
                    }
                } else {
                    System.out.println("Selected student not found in the database");
                }
            } else {
                System.out.println("No student selected for deletion");
            }
        } catch (SQLException ex) {
            Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    }
});
    } 
    public handler(Stage stage, homeBaseBase HB) {
        HB.getStudent().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                switches switches = new switches(stage, (Parent) HB);
                try {
                    switches.switchToStudent();
                } catch (IOException ex) {
                    Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        HB.getInstButton().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                switches switches = new switches(stage, (Parent) HB);
                try {
                    switches.switchToInstrucor();
                } catch (IOException ex) {
                    Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        HB.getTrack().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                switches switches = new switches(stage, (Parent) HB);
                try {
                    switches.switchToTrack();
                } catch (IOException ex) {
                    Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        HB.getBranch().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                switches switches = new switches(stage, (Parent) HB);
                try {
                    switches.switchToBranch();
                } catch (IOException ex) {
                    Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        HB.getSubject().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                switches switches = new switches(stage, (Parent) HB);
                try {
                    switches.switchToSubject();
                } catch (IOException ex) {
                    Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        HB.getCgpa().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                switches switches = new switches(stage, (Parent) HB);
                try {
                    switches.switchToreport();
                } catch (IOException ex) {
                    Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
    public handler(Stage stage,instructorBase IB){
        IB.getHomeButton().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                switches switches = new switches(stage, (Parent) IB);
                try {
                    switches.switchToHime();
                } catch (IOException ex) {
                    Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        IB.getInfo().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            
            public void handle(ActionEvent event) {
                System.out.println("pressed done");
                ArrayList<DtoInstructor> instructor=new ArrayList<>();
                try {
                    instructor=(ArrayList<DtoInstructor>)DAO.selectInstructor();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                System.out.println("instructor now in array list");
                if (instructor !=null){
                    System.out.println("to show in table");
                    finalInstructor[0]=instructor;
                    finalTableViewInstructor[0]=IB.getInstructorTable();
                    System.out.println("table view done");
                    finalColumnNationalIdInstructor[0]=IB.getNationalIdCol();
                    finalColumnYearOfExperince[0]=IB.getyearOfExpCol();
                    finalcolumnTrackNameIns[0]=IB.getTrackId();
                    finalColumnCirtifacteColumn[0]=IB.getCirtaficate();
                    finalColumnFirstNameInstructor[0]=IB.getNameCol();
                    finalcolumnSalaryInstructor[0]=IB.getSalaryCol();
                    finalColumnFirstNameInstructor[0].setCellValueFactory(cellData ->{
                           return new SimpleStringProperty(cellData.getValue().getFirstName());
                       });
                    finalColumnCirtifacteColumn[0].setCellValueFactory(cellData ->{
                        return new SimpleStringProperty(cellData.getValue().getCirtifate());
                    });                   
                    finalColumnNationalIdInstructor[0].setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNationalId()));
                    finalcolumnSalaryInstructor[0].setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getSalary()));
                    finalcolumnTrackNameIns[0].setCellValueFactory(cellData ->{ 
                        return new SimpleStringProperty(cellData.getValue().getTrackNameIns());
                    });
                    finalColumnYearOfExperince[0].setCellValueFactory(cellData ->new SimpleObjectProperty(cellData.getValue().getYearOfExperience()));
                    finalTableViewInstructor[0].getItems().clear();
                    finalTableViewInstructor[0].getItems().addAll(instructor);
                                                                               }
            }
        });
        IB.getInsert().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
            public void handle(ActionEvent event) {
                   DtoInstructor instructor = new DtoInstructor((int) IB.getnationalTextField(), IB.getFirstName(), IB.getLastName(), (Date.valueOf(IB.yearOfExper())), IB.getCirtficate(),IB.getTrackIdd());

                   DAO.addInstructor(instructor);
                   System.out.println("inserted a new student");
            }          
});
        IB.getDelete().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            DtoInstructor selectedInstructor = finalTableViewInstructor[0].getSelectionModel().getSelectedItem();
            if (selectedInstructor != null) {
                DtoInstructor selectedInstructorToD = new DtoInstructor(selectedInstructor.getNationalId());
                if (DAO.selectNationalIdInstructor(selectedInstructorToD)) {
                    int result = DAO.deleteInsructor(selectedInstructorToD);
                    if (result > 0) {
                        System.out.println("instructor deleted successfully");                      
                        finalTableViewStudent[0].getItems().remove(selectedInstructor);
                    } else {
                        System.out.println("No matching student found for deletion");
                    }
                } else {
                    System.out.println("Selected instructor not found in the database");
                }
            } else {
                System.out.println("No instructor selected for deletion");
            }
        } catch (SQLException ex) {
            Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
});
IB.getUpdate().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            DtoInstructor selectedInstructorToUpdate = finalTableViewInstructor[0].getSelectionModel().getSelectedItem();

            if (selectedInstructorToUpdate != null) {
                int result = DAO.update(selectedInstructorToUpdate);
                if (result > 0) {
 
                    System.out.println("Instructor updated successfully");
                } else {
                    System.out.println("Failed to update instructor");
                }
            } else {
                System.out.println("No instructor selected for update");
            }
        } catch (SQLException ex) {
            Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
});            }
    public handler(Stage stage,trackBase tB){
        tB.getHomeTrack().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                switches switches = new switches(stage, (Parent) tB);
                try {
                    switches.switchToHime();
                } catch (IOException ex) {
                    Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        tB.getInfotrack().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override            
            public void handle(ActionEvent event) {
                System.out.println("pressed done");
                ArrayList<DtoTrack> track=new ArrayList<>();
                try {
                    track=(ArrayList<DtoTrack>)DAO.selectTrack();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                System.out.println("instructor now in array list");
                if (track !=null){
                    System.out.println("to show in table");
                    finalTrack[0]=track;
                    finalTableViewTrack[0]=tB.getTableViewTrack();
                    System.out.println("table view done");
                    finalColumnTrackIdTrack[0]=tB.getTrackIdCol();
                    finalColumnTrackNameTrack[0]=tB.getTrackNameCol();
                    finalColumnTrackNameTrack[0].setCellValueFactory(cellData ->{ 
                        return new SimpleStringProperty(cellData.getValue().getTrackNameTrack());
                    });
                    finalColumnTrackIdTrack[0].setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getTrackId()));
                    finalTableViewTrack[0].getItems().clear();
                    finalTableViewTrack[0].getItems().addAll(track);                                                        }
            }
        });
        tB.getInsertButt().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
            public void handle(ActionEvent event) {
                   DtoTrack track = new DtoTrack(tB.getTrackName());
                   DAO.addTrack(track);
                   System.out.println("inserted a new student");
            }          
});
tB.getDeleteButt().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            DtoTrack selectedtrack= finalTableViewTrack[0].getSelectionModel().getSelectedItem();
            if (selectedtrack != null) {
                DtoTrack selectedTrackToD = new DtoTrack(selectedtrack.getTrackId());
                if (DAO.selectTrackId(selectedTrackToD)) {
                    int result = DAO.deleteTrack(selectedTrackToD);
                    if (result > 0) {
                        System.out.println("instructor deleted successfully");
                        finalTableViewTrack[0].getItems().remove(selectedtrack);
                    } else {
                        System.out.println("No matching student found for deletion");
                    }
                } else {
                    System.out.println("Selected track not found in the database");
                }
            } else {
                System.out.println("No track selected for deletion");
            }
        } catch (SQLException ex) {
            Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
});
    }

    public handler(Stage stage,BranchBase BS){
        BS.HomeButtonBranch().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                switches switches = new switches(stage, (Parent) BS);
                try {
                    switches.switchToHime();
                } catch (IOException ex) {
                    Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });    
    BS.InsertButtonBranch().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
            public void handle(ActionEvent event) {
                   DtoBranch branch = new DtoBranch(BS.getCityName(),BS.getAddressName());

                   DAO.addBranch(branch);
                   System.out.println("inserted a new student");
            }          
});
    BS.GetInfoBranch().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ArrayList<DtoBranch> branch=new ArrayList<>();
                try {
                    branch=(ArrayList<DtoBranch>)DAO.selectBranch();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                if (branch !=null){
                    System.out.println("to show in table");
                    finalBranch[0]=branch;
                    finalTableViewBranch[0]=BS.getBranchTable();
                    System.out.println("table view done");
                    finalColumnBranchId[0]=BS.getBranchId();
                    finalColumnBranchCity[0]=BS.getCityNameCol();
                    finalColumnBranchAddress[0]=BS.getAddressCol();
                    finalColumnBranchCity[0].setCellValueFactory(cellData ->{ 
                        return new SimpleStringProperty(cellData.getValue().getCity());
                    });
                    finalColumnBranchAddress[0].setCellValueFactory(cellData ->{ 
                        return new SimpleStringProperty(cellData.getValue().getAddress());
                    });
                    finalColumnBranchId[0].setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getBranchId()).asObject());
                    finalTableViewBranch[0].getItems().clear();
                    finalTableViewBranch[0].getItems().addAll(branch);
         }
            }
        });
    BS.deleteBranch().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            DtoBranch selectedBranch= finalTableViewBranch[0].getSelectionModel().getSelectedItem();
            if (selectedBranch != null) {
                DtoTrack selectedTrackToD = new DtoTrack(selectedBranch.getBranchId());
//from here need update after dao method
                if (DAO.selectBranchId(selectedBranch)) {
                    int result = DAO.deleteBranch(selectedBranch);
                    if (result > 0) {
                        System.out.println("instructor deleted successfully");
                        finalTableViewBranch[0].getItems().remove(selectedBranch);
                    } else {
                        System.out.println("No matching student found for deletion");
                    }
                } else {
                    System.out.println("Selected track not found in the database");
                }
            } else {
                System.out.println("No track selected for deletion");
            }
        } catch (SQLException ex) {
            Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
});
    }
public handler(Stage stage,SubjectBase SB){
    SB.getHome().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                switches switches = new switches(stage, (Parent) SB);
                try {
                    switches.switchToHime();
                } catch (IOException ex) {
                    Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    SB.getGetInfo().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ArrayList<DtoSubject> subject=new ArrayList<>();
                try {
                    subject=(ArrayList<DtoSubject>)DAO.selectSubjects();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                if (subject !=null){
                    System.out.println("to show in table");
                    finalSubjet[0]=subject;
                    finalTableViewSubject[0]=SB.getTableSubjectView();
                    System.out.println("table view done");
                    finalColumnSubjectId[0]=SB.getSubjectIdCol();
                    finalColumnSubjectName[0]=SB.getSubjectNameCol();
                    finalColumnSubjectName[0].setCellValueFactory(cellData ->{ 
                        return new SimpleStringProperty(cellData.getValue().getSubjectName());
                    });
                    finalColumnSubjectId[0].setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getSubjectCode()).asObject());
                    finalTableViewSubject[0].getItems().clear();
                    finalTableViewSubject[0].getItems().addAll(subject);
         }
            }
        });
    SB.getInsertSubject().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
            public void handle(ActionEvent event) {
                   DtoSubject subject = new DtoSubject(SB.getSubjectString());

                   DAO.addSubject(subject);
                   System.out.println("inserted a new student");
            }          
});
    SB.getDelete().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            DtoSubject selectedSubject= finalTableViewSubject[0].getSelectionModel().getSelectedItem();
            if (selectedSubject != null) {
                DtoSubject selectedSubjectToD = new DtoSubject(selectedSubject.getSubjectCode());
//from here need update after dao method
                if (DAO.selectSubjectId(selectedSubject)) {
                    int result = DAO.deleteSubject(selectedSubject);
                    if (result > 0) {
                        System.out.println("instructor deleted successfully");
                        finalTableViewSubject[0].getItems().remove(selectedSubject);
                    } else {
                        System.out.println("No matching student found for deletion");
                    }
                } else {
                    System.out.println("Selected track not found in the database");
                }
            } else {
                System.out.println("No track selected for deletion");
            }
        } catch (SQLException ex) {
            Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
});
}
public handler(Stage stage,ReportBase RB){
    RB.backToHome().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                switches switches = new switches(stage, (Parent) RB);
                try {
                    switches.switchToHime();
                } catch (IOException ex) {
                    Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    
    //need to handle 
    RB.getResult().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
                ArrayList<DtoSubject> subject=new ArrayList<>();
            ArrayList<DtoTrack> track=new ArrayList<>();
        
            subject=(ArrayList<DtoSubject>)DAO.selectSubjects();
            track=(ArrayList<DtoTrack>)DAO.selectTrack();
            if (subject !=null && track !=null){
                finalSubjet[0]=subject;
                finalTrackName[0]=track;
                finalTableViewTrackName[0]=RB.getTrackViewTable();
                finalTableViewSubject[0]=RB.getSubjectName();
                finalColumnSubjectName[0]=RB.getSubjectNameCol();
            
                finalColtrackName[0]=RB.getTrackName();
                 finalColumnSubjectName[0].setCellValueFactory(cellData ->{
                           return new SimpleStringProperty(cellData.getValue().getSubjectName());
                       });
                    finalColtrackName[0].setCellValueFactory(cellData ->{
                           return new SimpleStringProperty(cellData.getValue().getTrackNameTrack());
                       });
                    finalTableViewTrackName[0].getItems().clear();
                    finalTableViewTrackName[0].getItems().addAll(track);
                    finalTableViewSubject[0].getItems().clear();
                    finalTableViewSubject[0].getItems().addAll(subject); 
    
            }}          
    });
    RB.getSelect().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            DtoTrack selectedtrack= finalTableViewTrackName[0].getSelectionModel().getSelectedItem();
            DtoSubject seleSubject=finalTableViewSubject[0].getSelectionModel().getSelectedItem();
            System.out.println("hi");
            System.err.println(selectedtrack);
            if (selectedtrack != null && seleSubject != null) {
                System.out.println("hi");
                DtoTrack selectedTrackToD = new DtoTrack(selectedtrack.getTrackNameTrack());
                DtoSubject selectedDtoSubject=new DtoSubject(seleSubject.getSubjectName());
                if (DAO.selectTrackName(selectedTrackToD)>0&&DAO.selectSubName(selectedDtoSubject)>0){
                    int result = DAO.selectTrackName(selectedTrackToD);
                    System.out.println("   "+result);
                    int resultTwo=DAO.selectSubName(seleSubject);
                    System.out.println("   "+resultTwo);
                    System.out.println(DAO.calc_subject(1000,1));
                    RB.SubjectGpa(DAO.calc_subject(1000,1));
                }}} catch (SQLException ex) {
            Logger.getLogger(handler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
});
    
}
}
    




