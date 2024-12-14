package cse213.safa.user6;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.*;
import java.awt.event.ActionEvent;

public class InspectIncomingProducts
{
    @javafx.fxml.FXML
    private Label Inspectiontextfild;
    @javafx.fxml.FXML
    private TableColumn<InspectIncomingProducts,String> Listofproductsawaitinginspectiontableview;
    @javafx.fxml.FXML
    private Label Inspectionresultstextfild;

    @javafx.fxml.FXML
    public void initialize() {
        Listofproductsawaitinginspectiontableview.setCellValueFactory(new PropertyValueFactory<InspectIncomingProducts,String>("Listofproductsawaitinginspectiontableview"));
    }

    @javafx.fxml.FXML
    public void ReceiveProductOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewSpecificationsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void PerformInspectionOnAction(ActionEvent actionEvent) {
    }
}