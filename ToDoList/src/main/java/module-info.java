module com.anduscheusan.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anduscheusan.todolist to javafx.fxml;
    exports com.anduscheusan.todolist;
}