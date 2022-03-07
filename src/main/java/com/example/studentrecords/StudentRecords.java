package com.example.studentrecords;

public class StudentRecords {
    private String sid;
    private float assignments;
    private float midterm;
    private float finalExam;
    private float finalMark;
    private String letterGrade;


    public StudentRecords(String sid, float assignments, float midterm, float finalExam) {
        this.sid = sid;
        this.assignments = assignments;
        this.midterm = midterm;
        this.finalExam = finalExam;
        this.finalMark = (float)(assignments*0.2) + (float)(midterm*0.3) + (float)(finalExam*0.5);
        if (this.finalMark <= 100 && this.finalMark >= 80) {
            this.letterGrade = "A";
        } else if (this.finalMark <= 79 && this.finalMark >= 70) {
            this.letterGrade = "B";
        } else if (this.finalMark <= 69 && this.finalMark >= 60) {
            this.letterGrade = "C";
        } else if (this.finalMark <= 59 && this.finalMark >= 50) {
            this.letterGrade = "D";
        } else if (this.finalMark <= 49 && this.finalMark >= 0) {
            this.letterGrade = "F";
        } else {
            this.letterGrade = "Invalid";
        }
    }

    public String getSid() {
        return sid;
    }

    public float getAssignments() {
        return assignments;
    }

    public float getMidterm() {
        return midterm;
    }

    public float getFinalExam() {
        return finalExam;
    }

    public float getFinalMark() {
        return finalMark;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

}
