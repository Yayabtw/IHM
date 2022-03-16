module com.example.projet_1 {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        
    opens com.example.projet_1 to javafx.fxml;
    exports com.example.projet_1;
}