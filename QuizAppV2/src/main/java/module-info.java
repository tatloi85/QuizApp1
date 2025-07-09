module com.ntl.quizappv2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;


    opens com.ntl.quizappv2 to javafx.fxml;
    exports com.ntl.quizappv2;
}
