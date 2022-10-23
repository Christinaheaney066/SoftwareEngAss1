package org.example;

import org.joda.time.DateTime;
import java.util.ArrayList;


public class StudentClass {
    private String name;
    private int age;
    private DateTime DOB;
    private int id;
    private ArrayList<CourseProgramClass> courses;
    private ArrayList<ModuleClass> modules;

    public StudentClass(String name, int age, DateTime DOB, int id){
        this.name=name;
        this.age=age;
        this.DOB=DOB;
        this.id=id;
        this.courses=new ArrayList<>();
        this.modules=new ArrayList<>();
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setDOB(DateTime DOB){
        this.DOB = DOB;
    }
    public DateTime getDOB(){
        return DOB;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setCourses(ArrayList<CourseProgramClass> courses){
        this.courses=courses;
    }
    public ArrayList<CourseProgramClass> getCourses(){
        return courses;
    }

    public void setModules(ArrayList<ModuleClass> modules){
        this.modules=modules;
    }
    public ArrayList<ModuleClass> getModules(){
        return modules;
    }

    public String getUsername(){
        return getName()+getAge();
    }

    @Override
    public String toString(){
        String Studentstring = name + ","+ getUsername()+"," + age + "," + DOB + "," + id + "," + modules + "," + courses;
        return Studentstring;
    }


}
