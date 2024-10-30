module org.example.projetoSus {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.projetoSus to javafx.fxml;
    exports org.example.projetoSus;
}