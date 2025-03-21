package resume;

import job_roles.JobRole;
import java.util.List;

public class ResumeUtil {
    public static void startScreening(List<Resume<? extends JobRole>> candidates) {
        for (Resume<?> c : candidates) {
            if (c.getJobRole().isQualified()){
                System.out.println(c.getJobRole().getName() + " is qualified");
                continue;
            }
            System.out.println(c.getJobRole().getName() + " is unqualified");
        }
    }
}