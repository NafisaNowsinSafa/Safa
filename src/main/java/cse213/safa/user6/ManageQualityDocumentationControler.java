package cse213.safa.user6;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.*;

public class ManageQualityDocumentationControler
{
    @javafx.fxml.FXML
    private TableColumn<ManageQualityDocumentationControler,String> pastinspectionrecordstablecolumn;
    @javafx.fxml.FXML
    private ComboBox<String> Qualitycertificationscombobox;
    @javafx.fxml.FXML
    private TextField Inspectionformstextfild;
    @javafx.fxml.FXML
    private TextField InspectorNametextfild;

    @javafx.fxml.FXML
    public void initialize() {
        Qualitycertificationscombobox.getItems().addAll("issued:14.09.2023","Expires:14.09.2026","Certificate nr:QCN/3918");
        pastinspectionrecordstablecolumn.setCellValueFactory(new PropertyValueFactory<ManageQualityDocumentationControler,String>("pastinspectionrecordstablecolumn"));

    }
}