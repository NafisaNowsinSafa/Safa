module cse213.safa {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens cse213.safa to javafx.fxml;
    exports cse213.safa;
}