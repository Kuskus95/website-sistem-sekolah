package schoolmanagement.java.utils;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class RecursiveGrade extends RecursiveTreeObject<RecursiveGrade> {
    private StringProperty courseName;
    private StringProperty grade;

    public RecursiveGrade(String courseName, String grade) {
        this.courseName = new SimpleStringProperty(courseName);
        this.grade = new SimpleStringProperty(grade);
    }

    public StringProperty courseNameProperty() {
        return courseName;
    }

    public StringProperty gradeProperty() {
        return grade;
    }
}
