import java.util.ArrayList;

public class ModuleClass {
    private String moduleName;
    private String moduleId;
    private String lecturer;
    private ArrayList<StudentClass> students;
    private ArrayList<CourseProgramClass> courses;


    public ModuleClass(String moduleName, String moduleId,String lecturer, ArrayList students, ArrayList courses){
        this.moduleName= moduleName;
        this.moduleId= moduleId;
        this.lecturer= lecturer;
        this.students= new ArrayList<>();
        this.courses= new ArrayList<>();

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

    public void setCourses(ArrayList<CourseProgramClass> courses){
        this.courses=courses;
    }
    public ArrayList<CourseProgramClass> getCourses(){
        return courses;
    }

    public void setStudents(ArrayList<StudentClass> students){
        this.students=students;
    }

    public ArrayList<StudentClass>getStudents(){
        return students;
    }
}
