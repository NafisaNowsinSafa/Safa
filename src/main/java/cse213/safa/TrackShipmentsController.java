package cse213.safa;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import java.awt.*;

public class TrackShipmentsController
{
    @javafx.fxml.FXML
    private TextField productidtextfild;
    @javafx.fxml.FXML
    private ComboBox<String>shipmrnttimecombobox;
    @javafx.fxml.FXML
    private DatePicker shipmentdatedatepicker;
    @javafx.fxml.FXML
    private TextField productnametextfild;
    @javafx.fxml.FXML
    private TextField locationtextfild;
    @javafx.fxml.FXML
    private DatePicker datedatepicker;

    @javafx.fxml.FXML
    public void initialize() {
        shipmrnttimecombobox.getItems().addAll("06:00am-07:00am", "08:00am-09:00am", "10:00am-11:00");

    }
}