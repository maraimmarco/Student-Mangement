package casestudy;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class ReportBase extends Pane {

    protected final Rectangle rectangle;
    protected final ImageView imageView;
    protected final Text text;
    protected final Button HomeButtonReport;
    protected final Text resultOfGPASUB;
    protected final Text SubjectAvgtextResult;
    protected final Text text0;
    protected final Button ResultButton;
    protected final TableView TrackView;
    protected final TableColumn TrackCol;
    protected final TableView SubjectView;
    protected final TableColumn SubjectCol;
    protected final Button selectButtonReport;

    public ReportBase() {

        rectangle = new Rectangle();
        imageView = new ImageView();
        text = new Text();
        HomeButtonReport = new Button();
        resultOfGPASUB = new Text();
        SubjectAvgtextResult = new Text();
        text0 = new Text();
        ResultButton = new Button();
        TrackView = new TableView();
        TrackCol = new TableColumn();
        SubjectView = new TableView();
        SubjectCol = new TableColumn();
        selectButtonReport = new Button();

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


        text.setLayoutX(45.0);
        text.setLayoutY(226.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Report");
        text.setFont(new Font(30.0));

        HomeButtonReport.setLayoutX(63.0);
        HomeButtonReport.setLayoutY(347.0);
        HomeButtonReport.setMnemonicParsing(false);
        HomeButtonReport.setText("Home");

        resultOfGPASUB.setLayoutX(380.0);
        resultOfGPASUB.setLayoutY(251.0);
        resultOfGPASUB.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        resultOfGPASUB.setStrokeWidth(0.0);
        resultOfGPASUB.setWrappingWidth(89.44337368011475);

        SubjectAvgtextResult.setLayoutX(385.0);
        SubjectAvgtextResult.setLayoutY(368.0);
        SubjectAvgtextResult.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        SubjectAvgtextResult.setStrokeWidth(0.0);
        SubjectAvgtextResult.setWrappingWidth(78.98307228088379);

        text0.setLayoutX(210.0);
        text0.setLayoutY(371.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Subject Avg");
        text0.setFont(new Font(20.0));

        ResultButton.setLayoutX(331.0);
        ResultButton.setLayoutY(76.0);
        ResultButton.setMnemonicParsing(false);
        ResultButton.setText("SHOW TABLES");

        TrackView.setLayoutX(210.0);
        TrackView.setLayoutY(151.0);
        TrackView.setPrefHeight(165.0);
        TrackView.setPrefWidth(100.0);

        TrackCol.setPrefWidth(75.0);
        TrackCol.setText("Track Name");

        SubjectView.setLayoutX(380.0);
        SubjectView.setLayoutY(151.0);
        SubjectView.setPrefHeight(165.0);
        SubjectView.setPrefWidth(89.0);

        SubjectCol.setPrefWidth(75.0);
        SubjectCol.setText("Subject Name");

        selectButtonReport.setLayoutX(532.0);
        selectButtonReport.setLayoutY(198.0);
        selectButtonReport.setMnemonicParsing(false);
        selectButtonReport.setText("Select");

        getChildren().add(rectangle);
        getChildren().add(imageView);
        getChildren().add(text);
        getChildren().add(HomeButtonReport);
        getChildren().add(resultOfGPASUB);
        getChildren().add(SubjectAvgtextResult);
        getChildren().add(text0);
        getChildren().add(ResultButton);
        TrackView.getColumns().add(TrackCol);
        getChildren().add(TrackView);
        SubjectView.getColumns().add(SubjectCol);
        getChildren().add(SubjectView);
        getChildren().add(selectButtonReport);

    }
    public Button backToHome(){
        return HomeButtonReport;
    }
    public Button getResult(){
        return ResultButton;
    }
    public Button getSelect(){
        return selectButtonReport;
    }
    public TableView getTrackViewTable(){
        return TrackView;
    }
    public TableColumn getTrackName(){
        return TrackCol;
    }
    public TableView getSubjectName(){
        return SubjectView;
    }

    public TableColumn getSubjectNameCol(){
        return SubjectCol;
    }

    public void SubjectGpa(double Gpa){
        SubjectAvgtextResult.setText(Double.toString(Gpa));
    }
    
    }

