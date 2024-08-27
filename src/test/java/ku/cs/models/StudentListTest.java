package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList list = new StudentList();

    @BeforeEach
    void init(){
        list.addNewStudent("6610404535","Brandon",40);
        list.addNewStudent("6610404567","Peter",83);
        list.addNewStudent("6610404687","Jason",42);
    }

    @Test
    void testFindStudent() {
        Student student = new Student("6610404535","Brandon");
        Student student_from_list = list.findStudentById("6610404535");

        String expected = "Brandon";
        String actual = student_from_list.getName();
        assertEquals(expected, actual);
    }

    @Test
    void testGiveScoreToID(){
        list.giveScoreToId("6610404687",25);
        Student student = list.findStudentById("6610404687");
        assertEquals(67,student.getScore());
    }

    @Test
    void testViewGradeOfID(){
        String grade = list.viewGradeOfId("6610404567");
        assertEquals("A",grade);
    }

}