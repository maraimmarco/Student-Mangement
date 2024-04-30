package casestudy;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class homeBaseBase extends Pane {

    protected final Rectangle rectangle;
    protected final ImageView imageView;
    protected final Button studentButton;
    protected final Button trackButtton;
    protected final Button subjectButton;
    protected final Button instructorButton;
    protected final Button branchButton;
    protected final Button CGPAButton;
    protected final Text text;

    public homeBaseBase() {

        rectangle = new Rectangle();
        imageView = new ImageView();
        studentButton = new Button();
        trackButtton = new Button();
        subjectButton = new Button();
        instructorButton = new Button();
        branchButton = new Button();
        CGPAButton = new Button();
        text = new Text();

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
        rectangle.setLayoutX(-2.0);
        rectangle.setStroke(javafx.scene.paint.Color.valueOf("#1f93ff"));
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(200.0);

        imageView.setLayoutX(-3.0);
        imageView.setImage(new Image(getClass().getResource("/images/folder/icons8-student-100.png").toExternalForm()));

        studentButton.setLayoutX(35.0);
        studentButton.setLayoutY(118.0);
        studentButton.setMnemonicParsing(false);
        studentButton.setText("Student");

        trackButtton.setLayoutX(35.0);
        trackButtton.setLayoutY(244.0);
        trackButtton.setMnemonicParsing(false);
        trackButtton.setText("Track");

        subjectButton.setLayoutX(35.0);
        subjectButton.setLayoutY(200.0);
        subjectButton.setMnemonicParsing(false);
        subjectButton.setText("Subject");

        instructorButton.setLayoutX(35.0);
        instructorButton.setLayoutY(159.0);
        instructorButton.setMnemonicParsing(false);
        instructorButton.setText("Instructor");

        branchButton.setLayoutX(36.0);
        branchButton.setLayoutY(286.0);
        branchButton.setMnemonicParsing(false);
        branchButton.setText("Branch");

        CGPAButton.setLayoutX(34.0);
        CGPAButton.setLayoutY(332.0);
        CGPAButton.setMnemonicParsing(false);
        CGPAButton.setText("Report");

        text.setFill(javafx.scene.paint.Color.valueOf("#4e5db5"));
        text.setLayoutX(309.0);
        text.setLayoutY(111.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("WELCOME");
        text.setFont(new Font(30.0));

        getChildren().add(rectangle);
        getChildren().add(imageView);
        getChildren().add(studentButton);
        getChildren().add(trackButtton);
        getChildren().add(subjectButton);
        getChildren().add(instructorButton);
        getChildren().add(branchButton);
        getChildren().add(CGPAButton);
        getChildren().add(text);

    }
    public Button getStudent(){
        return studentButton;
    }
    public Button getCgpa(){
        return CGPAButton;
    }
    public Button getTrack(){
        return trackButtton;
    }
    public Button getBranch(){
        return branchButton;
    }
    public Button getInstButton(){
        return instructorButton;
    }
    public Button getSubject(){
        return subjectButton;
    }
}
