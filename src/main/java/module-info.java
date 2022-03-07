module com.example.studentrecords {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentrecords to javafx.fxml;
    exports com.example.studentrecords;
}