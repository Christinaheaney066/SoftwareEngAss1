import org.example.CourseProgramClass;
import org.example.LecturerClass;
import org.example.ModuleClass;
import org.example.StudentClass;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestMain {

    ArrayList<String> modules = new ArrayList<>();
    ArrayList<String> courses = new ArrayList <>();
    ArrayList<String> students = new ArrayList<>();

    @Test
    public void testStudentClass(){

        DateTime start = DateTime.parse("01/01/2022",  DateTimeFormat.forPattern("dd/MM/yyyy"));
        DateTime end = DateTime.parse("01/01/2024",  DateTimeFormat.forPattern("dd/MM/yyyy"));
        //setting the date and time


        StudentClass s1 = new StudentClass("Christina Heaney", 21, DateTime.parse("09/05/2001" , DateTimeFormat.forPattern("dd/MM/yyyy")), 19903432);
        ModuleClass m1 = new ModuleClass("CyberSecurity", "CT1234", "Maria Henehan", students );
        CourseProgramClass c1 = new CourseProgramClass("Computer Science", DateTime.parse("01/01/2022" , DateTimeFormat.forPattern("dd/MM/yyyy")), DateTime.parse("01/01/2024", DateTimeFormat.forPattern("dd/MM/yyyy")));
        modules.add("CyberSecurity");
        students.add("Christina Heaney");
        courses.add("Computer Science");
        //creating and adding the students modules and courses to be tested


        Assertions.assertEquals("Christina Heaney", s1.getName());
        Assertions.assertEquals(21, s1.getAge());
        Assertions.assertEquals(DateTime.parse("09/05/2001",DateTimeFormat.forPattern("dd/MM/yyyy")), s1.getDOB());
        Assertions.assertEquals(19903432, s1.getId());
        Assertions.assertEquals("Christina Heaney21", s1.getUsername());
        s1.setCourses(courses);
        s1.setModules(modules);
        Assertions.assertEquals(courses, s1.getCourses());
        Assertions.assertEquals(modules, s1.getModules());
        //testing array modules and courses, along with all objects in student class


    }

    @Test
    public void testLecturerClass(){


        LecturerClass l1 = new LecturerClass("Maeve Mckeown", 55, DateTime.parse("10/08/1967", DateTimeFormat.forPattern("dd/MM/yyyy")), 19441006);
        ModuleClass m1 = new ModuleClass("CyberSecurity", "CT1234", "Maria Henehan", students);

        modules.add("CyberSecurity");

        Assertions.assertEquals("Maeve Mckeown", l1.getLectName());
        Assertions.assertEquals(55, l1.getLectAge());
        Assertions.assertEquals(DateTime.parse("10/08/1967", DateTimeFormat.forPattern("dd/MM/yyyy")), l1.getLectDOB());
        Assertions.assertEquals(19441006, l1.getLectId());
        Assertions.assertEquals("Maeve Mckeown55", l1.getUsername());
        //testing name, age, dob, id, and username
    }
    @Test
    public void testModuleClass(){
        StudentClass s1 = new StudentClass("Christina Heaney", 21, DateTime.parse("09/05/2001", DateTimeFormat.forPattern("dd/MM/yyyy")), 19903432);
        LecturerClass l1 = new LecturerClass("Maeve Mckeown", 55, DateTime.parse("10/08/1967" , DateTimeFormat.forPattern("dd/MM/yyyy")), 19441006);
        ModuleClass m1 = new ModuleClass("CyberSecurity", "CT1234", "Maria Henehan", students);

        Assertions.assertEquals("CyberSecurity", m1.getModuleName());
        Assertions.assertEquals("CT1234", m1.getModuleId());
        Assertions.assertEquals("Maria Henehan", m1.getLecturer());
        Assertions.assertEquals(students, m1.getStudents());
        //testing students array, the name, id and lecturer

    }

    @Test
    public void testCourseClass(){
        StudentClass s1 = new StudentClass("Christina Heaney", 21, DateTime.parse("09/05/2001", DateTimeFormat.forPattern("dd/MM/yyyy")), 19903432);
        ModuleClass m1 = new ModuleClass("CyberSecurity", "CT1234", "Maria Henehan", students );
        CourseProgramClass c1 = new CourseProgramClass("Computer Science", DateTime.parse("01/01/2022", DateTimeFormat.forPattern("dd/MM/yyyy")), DateTime.parse("01/01/2024" , DateTimeFormat.forPattern("dd/MM/yyyy")));

        Assertions.assertEquals("Computer Science", c1.getCourseName());
        Assertions.assertEquals(DateTime.parse("01/01/2022",  DateTimeFormat.forPattern("dd/MM/yyyy")), c1.getAcademicStart());
        Assertions.assertEquals(DateTime.parse("01/01/2024", DateTimeFormat.forPattern("dd/MM/yyyy") ), c1.getAcademicEnd());

    }
}
