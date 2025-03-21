package job_roles;

public class SoftwareEngineer extends JobRole{
    public SoftwareEngineer(String name, int experience) {
        super(name, experience);
    }

    @Override
    public boolean isQualified(){
        return experience > 5;
    }
}