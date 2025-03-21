package course_types;

import evaluation_types.AssignmentBased;
import evaluation_types.EvaluationType;

public class AssignmentCourse extends CourseType<AssignmentBased> {
    protected EvaluationType evaluationType;

    public AssignmentCourse(AssignmentBased evaluationType) {
        super(evaluationType);
    }
}