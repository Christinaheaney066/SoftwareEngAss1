package org.example;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class CourseProgramClass {

    private DateTime academicStart;
    private DateTime academicEnd;
    private String courseName;
    private ArrayList<String> modules;
    private ArrayList<String> students;


    public CourseProgramClass(String courseName,DateTime academicStart, DateTime academicEnd) {
        this.courseName = courseName;
        this.academicStart = academicStart;
        this.academicEnd = academicEnd;
        this.modules = modules;
        this.students = students;
    }

    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public String getCourseName(){
        return courseName;
    }

    public void setAcademicEnd(DateTime academicEnd){
        this.academicEnd=academicEnd;
    }
    public DateTime getAcademicEnd(){
        return academicEnd;
    }

    public void setAcademicStart(DateTime academicStart){
        this.academicStart=academicStart;
    }
    public DateTime getAcademicStart(){
        return academicStart;
    }

    public void setModules(ArrayList<String> modules){
        this.modules=modules;
    }
    public ArrayList<String>getModules(){
        return modules;
    }

    public void setStudents(ArrayList<String> students){
        this.students=students;
    }
    public ArrayList<String>getStudents(){
        return students;
    }

    @Override
    public String toString(){
        String coursestring = courseName+ "," +academicEnd+ ","+ academicStart+ "," + modules + "," + students;
        return coursestring;
    }
}
