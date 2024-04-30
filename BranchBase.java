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

public  class BranchBase extends Pane {

    protected final Rectangle rectangle;
    protected final ImageView imageView;
    protected final Text text;
    protected final Button BackToHomeButtBranch;
    protected final Button insertBranch;
    protected final Button branchGetInfo;
    protected final Button deleteBranch;
    protected final TableView BranchTableView;
    protected final TableColumn BranchIdcolOne;
    protected final TableColumn cityNameCol;
    protected final TableColumn AddressColOne;
    protected final Text text0;
    protected final TextField cityNameTextField;
    protected final Text text1;
    protected final TextField addressnameTextField;

    public BranchBase() {

        rectangle = new Rectangle();
        imageView = new ImageView();
        text = new Text();
        BackToHomeButtBranch = new Button();
        insertBranch = new Button();
        branchGetInfo = new Button();
        deleteBranch = new Button();
        BranchTableView = new TableView();
        BranchIdcolOne = new TableColumn();
        cityNameCol = new TableColumn();
        AddressColOne = new TableColumn();
        text0 = new Text();
        cityNameTextField = new TextField();
        text1 = new Text();
        addressnameTextField = new TextField();

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

        text.setLayoutX(15.0);
        text.setLayoutY(137.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Branch");
        text.setFont(new Font(23.0));

        BackToHomeButtBranch.setLayoutX(47.0);
        BackToHomeButtBranch.setLayoutY(324.0);
        BackToHomeButtBranch.setMnemonicParsing(false);
        BackToHomeButtBranch.setText("Home");

        insertBranch.setLayoutX(47.0);
        insertBranch.setLayoutY(236.0);
        insertBranch.setMnemonicParsing(false);
        insertBranch.setText("Insert");

        branchGetInfo.setLayoutX(43.0);
        branchGetInfo.setLayoutY(194.0);
        branchGetInfo.setMnemonicParsing(false);
        branchGetInfo.setText("Get Info");

        deleteBranch.setLayoutX(47.0);
        deleteBranch.setLayoutY(282.0);
        deleteBranch.setMnemonicParsing(false);
        deleteBranch.setText("Delete");

        BranchTableView.setLayoutX(240.0);
        BranchTableView.setLayoutY(32.0);
        BranchTableView.setPrefHeight(161.0);
        BranchTableView.setPrefWidth(327.0);

        BranchIdcolOne.setPrefWidth(92.0);
        BranchIdcolOne.setText("Branch ID");

        cityNameCol.setPrefWidth(123.0);
        cityNameCol.setText("City");

        AddressColOne.setPrefWidth(113.0);
        AddressColOne.setText("Address");

        text0.setLayoutX(240.0);
        text0.setLayoutY(242.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("City Name");
        text0.setWrappingWidth(82.21288394927979);
        text0.setFont(new Font(15.0));

        cityNameTextField.setLayoutX(333.0);
        cityNameTextField.setLayoutY(211.0);
        cityNameTextField.setPrefHeight(0.0);
        cityNameTextField.setPrefWidth(142.0);

        text1.setLayoutX(240.0);
        text1.setLayoutY(288.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Address");
        text1.setWrappingWidth(82.21288394927979);
        text1.setFont(new Font(15.0));

        addressnameTextField.setLayoutX(333.0);
        addressnameTextField.setLayoutY(259.0);
        addressnameTextField.setPrefHeight(0.0);
        addressnameTextField.setPrefWidth(142.0);

        getChildren().add(rectangle);
        getChildren().add(imageView);
        getChildren().add(text);
        getChildren().add(BackToHomeButtBranch);
        getChildren().add(insertBranch);
        getChildren().add(branchGetInfo);
        getChildren().add(deleteBranch);
        BranchTableView.getColumns().add(BranchIdcolOne);
        BranchTableView.getColumns().add(cityNameCol);
        BranchTableView.getColumns().add(AddressColOne);
        getChildren().add(BranchTableView);
        getChildren().add(text0);
        getChildren().add(cityNameTextField);
        getChildren().add(text1);
        getChildren().add(addressnameTextField);

    }
    public Button HomeButtonBranch(){
        return BackToHomeButtBranch;
    }
    public Button InsertButtonBranch(){
        return insertBranch;
    }
    public Button deleteBranch(){
        return deleteBranch;
    }
    public Button GetInfoBranch(){
        return branchGetInfo;
    }
    public String getCityName(){
        return cityNameTextField.getText();
    }
    public String getAddressName(){
        return addressnameTextField.getText();
    }
    public TableView getBranchTable(){
        return BranchTableView;
    }
   public TableColumn getBranchId(){
       return BranchIdcolOne; 
   } 
   public TableColumn getCityNameCol(){
       return cityNameCol;
   }
   public TableColumn getAddressCol(){
       return AddressColOne;
   }
}
