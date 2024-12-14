package cse213.safa;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.*;
import java.awt.event.ActionEvent;

public class ManageOrdersFromTheCompanyController
{
    @javafx.fxml.FXML
    private TableColumn<ManageOrdersFromTheCompanyController,String> Listofpurchaseorderstablecolumn;
    @javafx.fxml.FXML
    private DatePicker DeliveriesScheduleDatePicker;
    @javafx.fxml.FXML
    private TextField Selectedpurchasetaxtfild;
    @javafx.fxml.FXML
    private ComboBox<String> UpdateorderstatusCombobox;

    @javafx.fxml.FXML
    public void initialize() {
        UpdateorderstatusCombobox.getItems().addAll("Minimum amount", "Maximum amount", "Minimum quantity", "Maximum quantity");
        Listofpurchaseorderstablecolumn.setCellValueFactory(new PropertyValueFactory<ManageOrdersFromTheCompanyController,String>("Listofpurchaseorderstablecolumn"));
    }

    @javafx.fxml.FXML
    public void ViewDetailsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ConfirmReceiptOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ScheduleDeliveryOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UpdateStatusOnAction(ActionEvent actionEvent) {
    }
}