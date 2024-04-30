package casestudy;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class SubjectBase extends Pane {

    protected final Rectangle rectangle;
    protected final ImageView imageView;
    protected final Text text;
    protected final Button BackToHomeButtSubject;
    protected final Button InsertSubjectButt;
    protected final Button GetInfoSubject;
    protected final Button DeleteSubjectButt;
    protected final TableView subjectTableView;
    protected final TableColumn subjectIDcol;
    protected final TableColumn SubjectNameCol;
    protected final Text text0;
    protected final TextField SubjectNameTextField;

    public SubjectBase() {

        rectangle = new Rectangle();
        imageView = new ImageView();
        text = new Text();
        BackToHomeButtSubject = new Button();
        InsertSubjectButt = new Button();
        GetInfoSubject = new Button();
        DeleteSubjectButt = new Button();
        subjectTableView = new TableView();
        subjectIDcol = new TableColumn();
        SubjectNameCol = new TableColumn();
        text0 = new Text();
        SubjectNameTextField = new TextField();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#1f93ff69"));
        rectangle.setHeight(400.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(200.0);

        imageView.setImage(new Image(getClass().getResource("/images/folder/icons8-student-100.png").toExternalForm()));

        text.setLayoutX(43.0);
        text.setLayoutY(164.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Subject");
        text.setFont(new Font(30.0));

        BackToHomeButtSubject.setLayoutX(47.0);
        BackToHomeButtSubject.setLayoutY(324.0);
        BackToHomeButtSubject.setMnemonicParsing(false);
        BackToHomeButtSubject.setText("Home");

        InsertSubjectButt.setLayoutX(47.0);
        InsertSubjectButt.setLayoutY(236.0);
        InsertSubjectButt.setMnemonicParsing(false);
        InsertSubjectButt.setText("Insert");

        GetInfoSubject.setLayoutX(43.0);
        GetInfoSubject.setLayoutY(194.0);
        GetInfoSubject.setMnemonicParsing(false);
        GetInfoSubject.setText("Get Info");

        DeleteSubjectButt.setLayoutX(47.0);
        DeleteSubjectButt.setLayoutY(282.0);
        DeleteSubjectButt.setMnemonicParsing(false);
        DeleteSubjectButt.setText("Delete");

        subjectTableView.setLayoutX(275.0);
        subjectTableView.setLayoutY(50.0);
        subjectTableView.setPrefHeight(144.0);
        subjectTableView.setPrefWidth(200.0);

        subjectIDcol.setPrefWidth(96.0);
        subjectIDcol.setText("Subject ID");

        SubjectNameCol.setPrefWidth(103.0);
        SubjectNameCol.setText("Subject Name");

        text0.setLayoutX(235.0);
        text0.setLayoutY(283.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Subject Name");
        text0.setWrappingWidth(115.18066383898258);
        text0.setFont(new Font(18.0));

        SubjectNameTextField.setLayoutX(351.0);
        SubjectNameTextField.setLayoutY(255.0);

        getChildren().add(rectangle);
        getChildren().add(imageView);
        getChildren().add(text);
        getChildren().add(BackToHomeButtSubject);
        getChildren().add(InsertSubjectButt);
        getChildren().add(GetInfoSubject);
        getChildren().add(DeleteSubjectButt);
        subjectTableView.getColumns().add(subjectIDcol);
        subjectTableView.getColumns().add(SubjectNameCol);
        getChildren().add(subjectTableView);
        getChildren().add(text0);
        getChildren().add(SubjectNameTextField);

    }
    public Button getGetInfo(){
        return GetInfoSubject;
    }
    public Button getInsertSubject(){
        return InsertSubjectButt;
    }
    public Button getDelete(){
        return DeleteSubjectButt;
    }
    public Button getHome(){
        return BackToHomeButtSubject;
    }
    public String getSubjectString(){
        return SubjectNameTextField.getText();
    }
    public TableView getTableSubjectView(){
        return subjectTableView;
    }
    public TableColumn getSubjectIdCol(){
        return subjectIDcol;
    }
    public TableColumn getSubjectNameCol(){
        return SubjectNameCol;
    }
}
