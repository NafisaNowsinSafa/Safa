package cse213.safa.user6;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.*;
import java.awt.event.ActionEvent;

public class EnsureComplianceWithStandardController
{
    @javafx.fxml.FXML
    private TableColumn<EnsureComplianceWithStandardController,String> compliancereportstablecolumn;
    @javafx.fxml.FXML
    private TextField reviewindustrytextfild;

    @javafx.fxml.FXML
    public void initialize() {

        compliancereportstablecolumn.setCellValueFactory(new PropertyValueFactory<EnsureComplianceWithStandardController,String>("compliance"));

    }

    @javafx.fxml.FXML
    public void nextbuttononacction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitcompliancereportbuttononaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verifyproductcertificationsbuttononaction(ActionEvent actionEvent) {
    }
}