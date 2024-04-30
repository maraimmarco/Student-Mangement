package casestudy;

import java.sql.Date;
import java.time.LocalDate;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class FXMLDocumentBase extends Pane {

    protected final TableView studentTable;
    protected final TableColumn nationalDColumn;
    protected final TableColumn firstNameColumn;
    protected final TableColumn lastNameColumn;
    protected final TableColumn trackNameclumn;
    protected final TableColumn DataofBirthTable;
    protected final Text Student_iD_txt;
    protected final Text text;
    protected final Text text0;
    protected final Text text1;
    protected final Text text2;
    protected final Text text3;
    protected final Text text4;
    protected final TextField phoneTxtField;
    protected final TextField NationalTxtField;
    protected final TextField firstNameTxtFeild;
    protected final TextField userNameTxtField;
    protected final TextField TrackNameTxtField;
    protected final DatePicker DateOfBirthTxtField;
    protected final TextField lastNameTxtField;
    protected final Button SelectStudentTable;
    protected final Button InsertStudentTable;
    protected final Button DeleteStudentTable;
    protected final Button homeButton;
    protected final Text StuendtTxt;

    public FXMLDocumentBase() {

        studentTable = new TableView();
        nationalDColumn = new TableColumn();
        firstNameColumn = new TableColumn();
        lastNameColumn = new TableColumn();
        trackNameclumn = new TableColumn();
        DataofBirthTable = new TableColumn();
        Student_iD_txt = new Text();
        text = new Text();
        text0 = new Text();
        text1 = new Text();
        text2 = new Text();
        text3 = new Text();
        text4 = new Text();
        phoneTxtField = new TextField();
        NationalTxtField = new TextField();
        firstNameTxtFeild = new TextField();
        userNameTxtField = new TextField();
        TrackNameTxtField = new TextField();
        DateOfBirthTxtField = new DatePicker();
        lastNameTxtField = new TextField();
        SelectStudentTable = new Button();
        InsertStudentTable = new Button();
        DeleteStudentTable = new Button();
        homeButton = new Button();
        StuendtTxt = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(429.0);
        setPrefWidth(600.0);

        studentTable.setLayoutX(96.0);
        studentTable.setPrefHeight(205.0);
        studentTable.setPrefWidth(482.0);

        nationalDColumn.setPrefWidth(75.0);
        nationalDColumn.setText("National ID");

        firstNameColumn.setPrefWidth(75.0);
        firstNameColumn.setText("First Name");

        lastNameColumn.setPrefWidth(75.0);
        lastNameColumn.setText("Last Name");

        trackNameclumn.setPrefWidth(75.0);
        trackNameclumn.setText("Track Name");

        DataofBirthTable.setPrefWidth(86.0);
        DataofBirthTable.setText("Date of birth");

        Student_iD_txt.setLayoutX(8.0);
        Student_iD_txt.setLayoutY(242.0);
        Student_iD_txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        Student_iD_txt.setStrokeWidth(0.0);
        Student_iD_txt.setText("National ID");
        Student_iD_txt.setWrappingWidth(70.13671875);
        Student_iD_txt.setFont(new Font(13.0));

        text.setLayoutX(5.0);
        text.setLayoutY(310.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Phone");

        text0.setLayoutX(292.0);
        text0.setLayoutY(281.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("User Name");

        text1.setLayoutX(287.0);
        text1.setLayoutY(241.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("First Name");
        text1.setWrappingWidth(75.55989164113998);

        text2.setLayoutX(5.0);
        text2.setLayoutY(282.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Last Name");
        text2.setWrappingWidth(75.55989164113998);

        text3.setLayoutY(346.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Track Name");
        text3.setWrappingWidth(99.99999403953552);

        text4.setLayoutX(287.0);
        text4.setLayoutY(317.0);
        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Date Of Birth");

        phoneTxtField.setLayoutX(122.0);
        phoneTxtField.setLayoutY(292.0);
        phoneTxtField.setPrefHeight(26.0);
        phoneTxtField.setPrefWidth(118.0);

        NationalTxtField.setLayoutX(127.0);
        NationalTxtField.setLayoutY(210.0);
        NationalTxtField.setPrefHeight(26.0);
        NationalTxtField.setPrefWidth(107.0);

        firstNameTxtFeild.setLayoutX(391.0);
        firstNameTxtFeild.setLayoutY(215.0);

        userNameTxtField.setLayoutX(391.0);
        userNameTxtField.setLayoutY(251.0);

        TrackNameTxtField.setLayoutX(110.0);
        TrackNameTxtField.setLayoutY(336.0);

        DateOfBirthTxtField.setLayoutX(385.0);
        DateOfBirthTxtField.setLayoutY(299.0);

        lastNameTxtField.setLayoutX(122.0);
        lastNameTxtField.setLayoutY(251.0);
        lastNameTxtField.setPrefHeight(26.0);
        lastNameTxtField.setPrefWidth(118.0);

        SelectStudentTable.setLayoutX(29.0);
        SelectStudentTable.setLayoutY(375.0);
        SelectStudentTable.setMnemonicParsing(false);
        SelectStudentTable.setText("show Table");

        InsertStudentTable.setLayoutX(181.0);
        InsertStudentTable.setLayoutY(375.0);
        InsertStudentTable.setMnemonicParsing(false);
        InsertStudentTable.setText("Insert");

        DeleteStudentTable.setLayoutX(273.0);
        DeleteStudentTable.setLayoutY(375.0);
        DeleteStudentTable.setMnemonicParsing(false);
        DeleteStudentTable.setText("Delete");

        homeButton.setLayoutX(358.0);
        homeButton.setLayoutY(375.0);
        homeButton.setMnemonicParsing(false);
        homeButton.setText("home");

        StuendtTxt.setLayoutY(36.0);
        StuendtTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        StuendtTxt.setStrokeWidth(0.0);
        StuendtTxt.setText("Student");
        StuendtTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        StuendtTxt.setWrappingWidth(99.99999403953552);
        StuendtTxt.setFont(new Font(23.0));

        studentTable.getColumns().add(nationalDColumn);
        studentTable.getColumns().add(firstNameColumn);
        studentTable.getColumns().add(lastNameColumn);
        studentTable.getColumns().add(trackNameclumn);
        studentTable.getColumns().add(DataofBirthTable);
        getChildren().add(studentTable);
        getChildren().add(Student_iD_txt);
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(text1);
        getChildren().add(text2);
        getChildren().add(text3);
        getChildren().add(text4);
        getChildren().add(phoneTxtField);
        getChildren().add(NationalTxtField);
        getChildren().add(firstNameTxtFeild);
        getChildren().add(userNameTxtField);
        getChildren().add(TrackNameTxtField);
        getChildren().add(DateOfBirthTxtField);
        getChildren().add(lastNameTxtField);
        getChildren().add(SelectStudentTable);
        getChildren().add(InsertStudentTable);
        getChildren().add(DeleteStudentTable);
        getChildren().add(homeButton);
        getChildren().add(StuendtTxt);

    }
    public Button getInsert(){
        return InsertStudentTable;
    }
    public Button getdelete(){
        return DeleteStudentTable;
    }

    public Button getSelectStudent(){
        return SelectStudentTable;
    }
    public Button getHome(){
        return homeButton;
    }
    public String getLastName(){
        return lastNameTxtField.getText();
    }
    public String getFirstName(){
        return firstNameTxtFeild.getText();
    }
    public String getPhone(){
        return phoneTxtField.getText();
    }
    public String getUserName(){
        return userNameTxtField.getText();
    }
    public LocalDate getDateOfBirthTxtField() {
        return  DateOfBirthTxtField.getValue();
    }
  
    public TableView getTableView(){
        return studentTable;
    }
    public TableColumn getNationalCol(){
        return nationalDColumn;
    }
    public TableColumn getFirstNameCol(){
        return firstNameColumn;
    }
    public TableColumn getLastNameCol(){
        return lastNameColumn;
    }
    public TableColumn getTrackNameCol(){
        return trackNameclumn;
    }
    public TableColumn getDateOfBirthCol(){
        return DataofBirthTable;
    }

    /*public int getNationalId(){
        return Integer.parseInt(NationalTxtField.getText());
    }*/
    public int getNationalId(){
    String nationalIdText = NationalTxtField.getText().trim();
    
    if (nationalIdText.isEmpty()) {
        // Handle the case when the field is empty
        return -1; // or throw an exception or handle it in your specific way
    }

    try {
        return Integer.parseInt(nationalIdText);
    } catch (NumberFormatException e) {
        // Handle the case when the input is not a valid integer
        return -1; // or throw an exception or handle it in your specific way
    }
}
    
public int getTrackID(){
    String trackIdText =TrackNameTxtField.getText().trim();
    if(trackIdText.isEmpty()){
        return -1;
    } try {
        return Integer.parseInt(trackIdText);
    } catch (NumberFormatException e) {
        // Handle the case when the input is not a valid integer
        return -1; // or throw an exception or handle it in your specific way
    }
}
/*public int getTrackIdd(){
        String TrackId = TrackIdTextField.getText().trim();
    
    if (TrackId.isEmpty()) {
        // Handle the case when the field is empty
        return -1; 
    }

    try {
        return Integer.parseInt(TrackId);
    } catch (NumberFormatException e) {
        // Handle the case when the input is not a valid integer
        return -1; // or throw an exception or handle it in your specific way
    }
    }*/

    /*public int getTrackId(){
        return Integer.parseInt(TrackNameTxtField.getText());
    }*/

}


