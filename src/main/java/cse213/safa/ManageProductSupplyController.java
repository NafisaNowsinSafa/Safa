package cse213.safa;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;

public class ManageProductSupplyController
{
    @javafx.fxml.FXML
    private TableColumn<ManageProductSupplyController,String> supplyupdatestablecolumn;
    @javafx.fxml.FXML
    private TableColumn<ManageProductSupplyController,String> futuredemandtablecolumn;
    @javafx.fxml.FXML
    private TableColumn<ManageProductSupplyController,String> supplyquantitestablecolumn;

    @FXML
    public void initialize() {
        supplyupdatestablecolumn.setCellValueFactory(new PropertyValueFactory<ManageProductSupplyController,String>("supplyupdatestablecolumn"));
        futuredemandtablecolumn.setCellValueFactory(new PropertyValueFactory<ManageProductSupplyController,String>("futuredemandtablecolumn"));
        supplyquantitestablecolumn.setCellValueFactory(new PropertyValueFactory<ManageProductSupplyController,String>("supplyquantitestablecolumn"));
    }

    @javafx.fxml.FXML
    public void ProductlocationButtonOnAction(ActionEvent actionEvent) {
    }
}