import course_types.AssignmentCourse;
import course_types.CourseType;
import course_types.ExamCourse;
import evaluation_types.AssignmentBased;
import evaluation_types.ExamBased;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creating an Exam-based course
        ExamBased examEval = new ExamBased(120);
        ExamCourse examCourseType = new ExamCourse(examEval);
        Course<ExamCourse> calculus = new Course<>("MATH101", examCourseType);

        // Creating an Assignment-based course
        AssignmentBased assignmentEval = new AssignmentBased(50);
        AssignmentCourse assignmentCourseType = new AssignmentCourse(assignmentEval);
        Course<AssignmentCourse> programming = new Course<>("CS101", assignmentCourseType);

        // Adding both courses to a common list
        ArrayList<Course<?>> courses = new ArrayList<>();
        courses.add(calculus);
        courses.add(programming);

        // Printing all courses
        for (Course<?> course : courses) {
            System.out.println(course);
        }

        // Adding course types (ExamCourse and AssignmentCourse) to another list
        ArrayList<CourseType<?>> courseTypes = new ArrayList<>();
        courseTypes.add(examCourseType);
        courseTypes.add(assignmentCourseType);

        // Printing all course types
        for (CourseType<?> courseType : courseTypes) {
            System.out.println(courseType);
        }
    }
}

