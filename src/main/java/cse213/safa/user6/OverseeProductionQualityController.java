package cse213.safa.user6;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.*;
import java.awt.event.ActionEvent;

public class OverseeProductionQualityController
{
    @javafx.fxml.FXML
    private TableColumn<OverseeProductionQualityController,String> listofproductionbatchestablecolumn;
    @javafx.fxml.FXML
    private TableColumn<OverseeProductionQualityController,String> listofauditsforafactory;
    @javafx.fxml.FXML
    private TextField batchnumbertextfild;
    @javafx.fxml.FXML
    private TableColumn<OverseeProductionQualityController,String> evaluationresulttablecolumn;
    @javafx.fxml.FXML
    private TextField productqualitytextfild;
    @javafx.fxml.FXML
    private TableColumn<OverseeProductionQualityController,String> productqualitytablecolumn;
    @javafx.fxml.FXML
    private TextField evaluationresulttextfild;

    @javafx.fxml.FXML
    public void initialize() {
        listofproductionbatchestablecolumn.setCellValueFactory(new PropertyValueFactory<OverseeProductionQualityController,String>("listofproductionbatchestablecolumn"));
        listofauditsforafactory.setCellValueFactory(new PropertyValueFactory<OverseeProductionQualityController,String>("listofauditsforafactory"));
        evaluationresulttablecolumn.setCellValueFactory(new PropertyValueFactory<OverseeProductionQualityController,String>("evaluationresulttablecolumn"));
        productqualitytablecolumn.setCellValueFactory(new PropertyValueFactory<OverseeProductionQualityController,String>("productqualitytablecolumn"));


    }

    @javafx.fxml.FXML
    public void submitfeedbackbuttononaction(ActionEvent actionEvent) {
    }
}