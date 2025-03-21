package evaluation_types;

public class ExamBased extends EvaluationType {
    private int maxMarks;

    public ExamBased(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public String toString() {
        return "Exam Based [maxMarks=" + maxMarks + "]";
    }
}