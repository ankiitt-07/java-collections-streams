package evaluation_types;

public class AssignmentBased extends EvaluationType {
    private int totalAssignments;

    public AssignmentBased(int totalAssignments) {
        this.totalAssignments = totalAssignments;
    }

    public int getTotalAssignments() {
        return totalAssignments;
    }

    public void setTotalAssignments(int totalAssignments) {
        this.totalAssignments = totalAssignments;
    }
    public String toString() {
        return "Assignment based on " + totalAssignments;
    }

}