package cse213.safa;

import javafx.scene.control.ComboBox;

import java.awt.*;
import java.awt.event.ActionEvent;

public class AccessSupplierPortalController
{
    @javafx.fxml.FXML
    private TextField addresstextfild;
    @javafx.fxml.FXML
    private TextField usernametextfild;
    @javafx.fxml.FXML
    private TextField suppliiernametextfild;
    @javafx.fxml.FXML
    private TextField nametextfild;
    @javafx.fxml.FXML
    private ComboBox<String> supplieremailcombobox;
    @javafx.fxml.FXML
    private ComboBox<String> emailcombobox;
    @javafx.fxml.FXML
    private TextField passwordtextfild;
    @javafx.fxml.FXML
    private TextField IDtextfild;
    @javafx.fxml.FXML
    private TextField supplieridtextfild;
    @javafx.fxml.FXML
    private TextField suppliercontacttextfild;
    @javafx.fxml.FXML
    private TextField supplieraddresstextfild;
    @javafx.fxml.FXML
    private TextField contacttextfild;

    @javafx.fxml.FXML
    public void initialize() {
        supplieremailcombobox.getItems().addAll("nafisanowsin@gmail.com");
        emailcombobox.getItems().addAll("joti@gmail.com");
    }

    @javafx.fxml.FXML
    public void DownloadButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void NextButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void actionNextButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LogINButtonOnAction(ActionEvent actionEvent) {
    }
}