package org.example;

import java.util.ArrayList;

public class ModuleClass {
    private String moduleName;
    private String moduleId;
    private String lecturer;
    private ArrayList<String> students;
    private ArrayList<String> courses;


    public ModuleClass(String moduleName, String moduleId,String lecturer, ArrayList students){
        this.moduleName= moduleName;
        this.moduleId= moduleId;
        this.lecturer= lecturer;
        this.students= new ArrayList<>();

    }
    public void setModuleName(String moduleName){
        this.moduleName= moduleName;
    }
    public String getModuleName(){
        return moduleName;
    }

    public void setModuleId(String moduleId){
        this.moduleId= moduleId;
    }
    public String getModuleId(){
        return moduleId;
    }

    public void setLecturer(String lecturer){
        this.lecturer= lecturer;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setCourses(ArrayList<String> courses){
        this.courses=courses;
    }
    public ArrayList<String> getCourses(){
        return courses;
    }

    public void setStudents(ArrayList<String> students){
        this.students=students;
    }

    public ArrayList<String>getStudents(){
        return students;
    }

    @Override
    public String toString(){
        String Modulestring = moduleName + "," + moduleId + "," + lecturer + "," + courses;
        return Modulestring;
    }
}
