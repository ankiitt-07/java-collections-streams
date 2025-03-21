package course_types;

import evaluation_types.ExamBased;

public class ExamCourse extends CourseType<ExamBased> {
    private ExamBased evaluationType;

    public ExamCourse(ExamBased evaluationType) {
        super(evaluationType);
    }
}