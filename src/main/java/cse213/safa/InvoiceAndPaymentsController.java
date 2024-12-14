package cse213.safa;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.awt.*;
import java.awt.event.ActionEvent;

public class InvoiceAndPaymentsController
{
    @javafx.fxml.FXML
    private TextField customernametextfild;
    @javafx.fxml.FXML
    private TextField customeridtextfild;
    @javafx.fxml.FXML
    private TextField oderdetailstextfild;
    @javafx.fxml.FXML
    private RadioButton cardradiobutton;
    @javafx.fxml.FXML
    private RadioButton bkashradiobutton;
    @javafx.fxml.FXML
    private RadioButton nagadradiobutto;

    ToggleGroup tg;

    @javafx.fxml.FXML
    public void initialize() {
        tg = new ToggleGroup();
        cardradiobutton.setToggleGroup(tg);
        bkashradiobutton.setToggleGroup(tg);
        nagadradiobutto.setToggleGroup(tg);
    }

    @javafx.fxml.FXML
    public void paidButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void NewInvoiceButtonOnAcction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DeleteInvoiceButtonOnAction(ActionEvent actionEvent) {
    }
}