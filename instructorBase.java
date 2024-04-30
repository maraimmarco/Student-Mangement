package casestudy;

import java.time.LocalDate;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class instructorBase extends Pane {

    protected final TableView instructorTableView;
    protected final TableColumn NationalInstructorCol;
    protected final TableColumn instructorNameCol;
    protected final TableColumn instructorYearOfExpCol;
    protected final TableColumn instructorCirtaficateCol;
    protected final TableColumn instructorSalaryCol;
    protected final TableColumn instrucorTrackIdCol;
    protected final Button updateInstructor;
    protected final Button deleteInstructor;
    protected final Button homepageInstructor;
    protected final Button selectInstructor;
    protected final Button insterInstructor;
    protected final Text text;
    protected final Text text0;
    protected final TextField NationalIdInstTxtField;
    protected final Text text1;
    protected final TextField instructorFirstNameField;
    protected final Text text2;
    protected final TextField instructorLastNameField;
    protected final Text instructorCirtaficateField;
    protected final TextField instructorCirtifcateField;
    protected final DatePicker instructorYOFExpField;
    protected final Text text3;
    protected final Text text4;
    protected final TextField TrackIdTextField;

    public instructorBase() {

        instructorTableView = new TableView();
        NationalInstructorCol = new TableColumn();
        instructorNameCol = new TableColumn();
        instructorYearOfExpCol = new TableColumn();
        instructorCirtaficateCol = new TableColumn();
        instructorSalaryCol = new TableColumn();
        instrucorTrackIdCol = new TableColumn();
        updateInstructor = new Button();
        deleteInstructor = new Button();
        homepageInstructor = new Button();
        selectInstructor = new Button();
        insterInstructor = new Button();
        text = new Text();
        text0 = new Text();
        NationalIdInstTxtField = new TextField();
        text1 = new Text();
        instructorFirstNameField = new TextField();
        text2 = new Text();
        instructorLastNameField = new TextField();
        instructorCirtaficateField = new Text();
        instructorCirtifcateField = new TextField();
        instructorYOFExpField = new DatePicker();
        text3 = new Text();
        text4 = new Text();
        TrackIdTextField = new TextField();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        instructorTableView.setLayoutX(43.0);
        instructorTableView.setLayoutY(61.0);
        instructorTableView.setPrefHeight(200.0);
        instructorTableView.setPrefWidth(515.0);

        NationalInstructorCol.setPrefWidth(90.0);
        NationalInstructorCol.setText("National Id");

        instructorNameCol.setPrefWidth(67.0);
        instructorNameCol.setText(" Name");

        instructorYearOfExpCol.setPrefWidth(109.0);
        instructorYearOfExpCol.setText("year Of Experince");

        instructorCirtaficateCol.setMinWidth(0.0);
        instructorCirtaficateCol.setPrefWidth(85.0);
        instructorCirtaficateCol.setText("CIRTAFICATE");

        instructorSalaryCol.setPrefWidth(62.0);
        instructorSalaryCol.setText("Salary");

        instrucorTrackIdCol.setPrefWidth(91.0);
        instrucorTrackIdCol.setText("Track ID");

        updateInstructor.setLayoutX(435.0);
        updateInstructor.setLayoutY(361.0);
        updateInstructor.setMnemonicParsing(false);
        updateInstructor.setText("Update");

        deleteInstructor.setLayoutX(374.0);
        deleteInstructor.setLayoutY(361.0);
        deleteInstructor.setMnemonicParsing(false);
        deleteInstructor.setText("Delete");

        homepageInstructor.setLayoutX(510.0);
        homepageInstructor.setLayoutY(361.0);
        homepageInstructor.setMnemonicParsing(false);
        homepageInstructor.setText("Home");

        selectInstructor.setLayoutX(245.0);
        selectInstructor.setLayoutY(361.0);
        selectInstructor.setMnemonicParsing(false);
        selectInstructor.setText("get Info");

        insterInstructor.setLayoutX(314.0);
        insterInstructor.setLayoutY(361.0);
        insterInstructor.setMnemonicParsing(false);
        insterInstructor.setText("Insert");

        text.setLayoutX(249.0);
        text.setLayoutY(43.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Instructor");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setFont(new Font(27.0));

        text0.setLayoutX(2.0);
        text0.setLayoutY(291.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("National Id");

        NationalIdInstTxtField.setLayoutX(82.0);
        NationalIdInstTxtField.setLayoutY(261.0);
        NationalIdInstTxtField.setPrefHeight(26.0);
        NationalIdInstTxtField.setPrefWidth(102.0);

        text1.setLayoutY(327.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("First Name ");

        instructorFirstNameField.setLayoutX(82.0);
        instructorFirstNameField.setLayoutY(297.0);
        instructorFirstNameField.setPrefHeight(26.0);
        instructorFirstNameField.setPrefWidth(102.0);

        text2.setLayoutX(217.0);
        text2.setLayoutY(291.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Last Name");

        instructorLastNameField.setLayoutX(293.0);
        instructorLastNameField.setLayoutY(266.0);
        instructorLastNameField.setPrefHeight(9.0);
        instructorLastNameField.setPrefWidth(142.0);

        instructorCirtaficateField.setLayoutX(218.0);
        instructorCirtaficateField.setLayoutY(326.0);
        instructorCirtaficateField.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        instructorCirtaficateField.setStrokeWidth(0.0);
        instructorCirtaficateField.setText("Cirtaficate");

        instructorCirtifcateField.setLayoutX(293.0);
        instructorCirtifcateField.setLayoutY(297.0);
        instructorCirtifcateField.setPrefHeight(16.0);
        instructorCirtifcateField.setPrefWidth(142.0);

        instructorYOFExpField.setLayoutX(446.0);
        instructorYOFExpField.setLayoutY(302.0);
        instructorYOFExpField.setPrefHeight(26.0);
        instructorYOFExpField.setPrefWidth(129.0);

        text3.setLayoutX(457.0);
        text3.setLayoutY(291.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Year Of Experince");

        text4.setLayoutX(2.0);
        text4.setLayoutY(358.0);
        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Track ID");

        TrackIdTextField.setLayoutX(66.0);
        TrackIdTextField.setLayoutY(341.0);

        instructorTableView.getColumns().add(NationalInstructorCol);
        instructorTableView.getColumns().add(instructorNameCol);
        instructorTableView.getColumns().add(instructorYearOfExpCol);
        instructorTableView.getColumns().add(instructorCirtaficateCol);
        instructorTableView.getColumns().add(instructorSalaryCol);
        instructorTableView.getColumns().add(instrucorTrackIdCol);
        getChildren().add(instructorTableView);
        getChildren().add(updateInstructor);
        getChildren().add(deleteInstructor);
        getChildren().add(homepageInstructor);
        getChildren().add(selectInstructor);
        getChildren().add(insterInstructor);
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(NationalIdInstTxtField);
        getChildren().add(text1);
        getChildren().add(instructorFirstNameField);
        getChildren().add(text2);
        getChildren().add(instructorLastNameField);
        getChildren().add(instructorCirtaficateField);
        getChildren().add(instructorCirtifcateField);
        getChildren().add(instructorYOFExpField);
        getChildren().add(text3);
        getChildren().add(text4);
        getChildren().add(TrackIdTextField);

    }
    public Button getInfo(){
        return selectInstructor;
    }
    public Button getInsert(){
        return insterInstructor;
    }
    public Button getDelete(){
        return deleteInstructor;
    }
    public Button getUpdate(){
        return updateInstructor;
    }
    public Button getHomeButton(){
        return homepageInstructor;
    }
    public TableView getInstructorTable(){
        return instructorTableView;
    }
    public TableColumn getNationalIdCol(){
        return NationalInstructorCol;
    }
    public TableColumn getNameCol(){
        return instructorNameCol;
    }
    public TableColumn getyearOfExpCol(){
        return instructorYearOfExpCol;
    }
    public TableColumn getCirtaficate(){
        return instructorCirtaficateCol;
    }
    public TableColumn getSalaryCol(){
        return instructorSalaryCol;
    }
    public TableColumn getTrackId(){
        return instrucorTrackIdCol;
    }
    public int getnationalTextField(){
        String nationalIdText = NationalIdInstTxtField.getText().trim();
    
    if (nationalIdText.isEmpty()) {
        // Handle the case when the field is empty
        return -1; 
    }

    try {
        return Integer.parseInt(nationalIdText);
    } catch (NumberFormatException e) {
        // Handle the case when the input is not a valid integer
        return -1; // or throw an exception or handle it in your specific way
    }
    }
    public String getFirstName(){
        return instructorFirstNameField.getText();
    }
    public String getLastName(){
        return instructorLastNameField.getText();
    }
    public String getCirtficate(){
        return instructorCirtifcateField.getText();
    }
    public LocalDate yearOfExper(){
        return instructorYOFExpField.getValue();
    }
    public int getTrackIdd(){
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
    }
}
