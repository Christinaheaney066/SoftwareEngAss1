package org.example;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class LecturerClass {
    private String lectName;
    private int lectAge;
    private DateTime lectDOB;
    private int lectId;
    private ArrayList<ModuleClass> lectModules;


    public LecturerClass(String lectName, int lectAge, DateTime lectDOB, int lectId ){
        this.lectName=lectName;
        this.lectAge=lectAge;
        this.lectDOB=lectDOB;
        this.lectId=lectId;
        this.lectModules= new ArrayList<>();
    }

    public void setLectName(String lectName){
        this.lectName = lectName;
    }
    public String getLectName(){
        return lectName;
    }

    public void setLectAge(int lectAge){
        this.lectAge = lectAge;
    }
    public int getLectAge(){
        return lectAge;
    }

    public void setLectDOB(DateTime lectDOB){
        this.lectDOB = lectDOB;
    }
    public DateTime getLectDOB(){
        return lectDOB;
    }

    public void setLectId(int lectId){this.lectId = lectId;}
    public int getLectId(){
        return lectId;
    }

    public void setLectModules(ArrayList<ModuleClass>lectModules){
        this.lectModules=lectModules;
    }
    public ArrayList<ModuleClass>getLectModules(){
        return lectModules;
    }

    public String getUsername(){
        return getLectName()+getLectAge();
    }

    @Override
    public String toString(){
        String lectstring = lectName + ","+ getUsername()+"," + lectAge + "," + lectDOB + "," + lectId + "," + lectModules ;
        return lectstring;
    }


}
