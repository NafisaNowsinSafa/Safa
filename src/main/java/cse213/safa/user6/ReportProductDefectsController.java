package cse213.safa.user6;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.*;
import java.awt.event.ActionEvent;

public class ReportProductDefectsController
{
    @javafx.fxml.FXML
    private TextField productidtextfild;
    @javafx.fxml.FXML
    private TextField productnametextfild;
    @javafx.fxml.FXML
    private TableColumn<ReportProductDefectsController,String> commenttablecolumn;
    @javafx.fxml.FXML
    private TextField commenttextfild;
    @javafx.fxml.FXML
    private TableColumn<ReportProductDefectsController,String> defectreporttablecomumn;
    @javafx.fxml.FXML
    private TableColumn<ReportProductDefectsController,String> productidtablecolimn;

    @javafx.fxml.FXML
    public void initialize() {
        commenttablecolumn.setCellValueFactory(new PropertyValueFactory<ReportProductDefectsController,String>("commenttablecolumn"));
        defectreporttablecomumn.setCellValueFactory(new PropertyValueFactory<ReportProductDefectsController,String>("defectreporttablecomumn"));
        productidtablecolimn.setCellValueFactory(new PropertyValueFactory<ReportProductDefectsController,String>("productidtablecolimn"));
    }

    @javafx.fxml.FXML
    public void correctiveactionbuttononaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reportsubmitbuttononaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void savebuttononaction(ActionEvent actionEvent) {
    }
}