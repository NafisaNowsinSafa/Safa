package cse213.safa;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.*;

public class ProvideProductSamplesController
{
    @javafx.fxml.FXML
    private TextField deliveryupdatetextfild;
    @javafx.fxml.FXML
    private TextField feedbacktextfild;
    @javafx.fxml.FXML
    private TextField productnametextfild;
    @javafx.fxml.FXML
    private TextField requesterdetailstextfild;
    @javafx.fxml.FXML
    private TableColumn<ProvideProductSamplesController,String> productsamplescolumn;
    @javafx.fxml.FXML
    private TableColumn<ProvideProductSamplesController,String> newproductscolimn;
    @javafx.fxml.FXML
    private TextField requesterdetailstextfild1;
    @javafx.fxml.FXML
    private TextField requesterdetailstextfild11;

    @javafx.fxml.FXML
    public void initialize() {
        productsamplescolumn.setCellValueFactory(new PropertyValueFactory<ProvideProductSamplesController,String>("productsamples"));
        newproductscolimn.setCellValueFactory(new PropertyValueFactory<ProvideProductSamplesController,String>("newproductscolimn"));
    }
}