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

public  class trackBase extends Pane {

    protected final Rectangle rectangle;
    protected final TableView TrackColView;
    protected final TableColumn trackIdCol;
    protected final TableColumn trackNameCol;
    protected final Text text;
    protected final Text text0;
    protected final TextField TrackNameTextField;
    protected final Button BackToHomeButt;
    protected final Button InsertTrackButt;
    protected final Button tarckSelectedButt;
    protected final Button DeleteTrackButt;
    protected final ImageView imageView;
    

    public trackBase() {

        rectangle = new Rectangle();
        TrackColView = new TableView();
        trackIdCol = new TableColumn();
        trackNameCol = new TableColumn();
        text = new Text();
        text0 = new Text();
        TrackNameTextField = new TextField();
        BackToHomeButt = new Button();
        InsertTrackButt = new Button();
        tarckSelectedButt = new Button();
        DeleteTrackButt = new Button();
        imageView = new ImageView();

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

        TrackColView.setLayoutX(241.0);
        TrackColView.setLayoutY(31.0);
        TrackColView.setPrefHeight(144.0);
        TrackColView.setPrefWidth(200.0);

        trackIdCol.setPrefWidth(75.0);
        trackIdCol.setText("Track Id");

        trackNameCol.setPrefWidth(75.0);
        trackNameCol.setText("Track Name");

        text.setLayoutX(33.0);
        text.setLayoutY(154.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Track");
        text.setFont(new Font(30.0));

        text0.setLayoutX(225.0);
        text0.setLayoutY(261.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Track Name");
        text0.setWrappingWidth(115.18066383898258);
        text0.setFont(new Font(18.0));

        TrackNameTextField.setLayoutX(351.0);
        TrackNameTextField.setLayoutY(253.0);

        BackToHomeButt.setLayoutX(37.0);
        BackToHomeButt.setLayoutY(314.0);
        BackToHomeButt.setMnemonicParsing(false);
        BackToHomeButt.setText("Home");

        InsertTrackButt.setLayoutX(37.0);
        InsertTrackButt.setLayoutY(226.0);
        InsertTrackButt.setMnemonicParsing(false);
        InsertTrackButt.setText("Insert");

        tarckSelectedButt.setLayoutX(33.0);
        tarckSelectedButt.setLayoutY(184.0);
        tarckSelectedButt.setMnemonicParsing(false);
        tarckSelectedButt.setText("Get Info");

        DeleteTrackButt.setLayoutX(37.0);
        DeleteTrackButt.setLayoutY(272.0);
        DeleteTrackButt.setMnemonicParsing(false);
        DeleteTrackButt.setText("Delete");

        imageView.setImage(new Image(getClass().getResource("/images/folder/icons8-student-100.png").toExternalForm()));


        getChildren().add(rectangle);
        TrackColView.getColumns().add(trackIdCol);
        TrackColView.getColumns().add(trackNameCol);
        getChildren().add(TrackColView);
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(TrackNameTextField);
        getChildren().add(BackToHomeButt);
        getChildren().add(InsertTrackButt);
        getChildren().add(tarckSelectedButt);
        getChildren().add(DeleteTrackButt);
        getChildren().add(imageView);

    }
    public String getTrackName(){
        return TrackNameTextField.getText();
    }
    
    public TableView getTableViewTrack(){
        return TrackColView;
    }
    public TableColumn getTrackIdCol(){
        return trackIdCol;
    }
    public TableColumn getTrackNameCol(){
        return trackNameCol;
    }
    public Button getHomeTrack(){
        return BackToHomeButt;
    }
    public Button getInsertButt(){
        return InsertTrackButt;
    }
    public Button getDeleteButt(){
        return DeleteTrackButt;
    }
    public Button getInfotrack(){
        return tarckSelectedButt;
    }

}

