package cse213.safa;

import javafx.scene.control.ComboBox;

import java.awt.*;
import java.awt.event.ActionEvent;

public class ManageProductQualityControler
{

    @javafx.fxml.FXML
    private Label productCertificationlable;
    @javafx.fxml.FXML
    private TextField reporttitletextfild;
    @javafx.fxml.FXML
    private TextField Compliancetextfild;
    @javafx.fxml.FXML
    private ComboBox<String> ProductCertificationComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        ProductCertificationComboBox.getItems().addAll("Certificate No:QMS 0715020022","Date of Issue:2023-05-16","Expiry Date:2024-12-14",
        "Certification period:3 years (1st Year)" );

    }

    @javafx.fxml.FXML
    public void AddReportButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DeleteReportButtonOnAction(ActionEvent actionEvent) {
    }

}