package com.example.studentrecords;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import static com.example.studentrecords.DataSource.getAllMarks;

public class StudentRecordsController implements Initializable {

    @FXML private TableColumn<StudentRecords, Float> assignments;
    @FXML private TableColumn<StudentRecords, Float> finalExam;
    @FXML private TableColumn<StudentRecords, Float> finalMark;
    @FXML private TableColumn<StudentRecords, String> letterGrade;
    @FXML private TableColumn<StudentRecords, Float> midterm;
    @FXML private TableColumn<StudentRecords, String> sid;
    @FXML private TableView<StudentRecords> table;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        table.setItems(getAllMarks());
        sid.setCellValueFactory(new PropertyValueFactory<StudentRecords, String>("sid"));
        assignments.setCellValueFactory(new PropertyValueFactory<StudentRecords, Float>("assignments"));
        midterm.setCellValueFactory(new PropertyValueFactory<StudentRecords, Float>("midterm"));
        finalExam.setCellValueFactory(new PropertyValueFactory<StudentRecords, Float>("finalExam"));
        finalMark.setCellValueFactory(new PropertyValueFactory<StudentRecords, Float>("finalMark"));
        letterGrade.setCellValueFactory(new PropertyValueFactory<StudentRecords, String>("letterGrade"));
    }
}


