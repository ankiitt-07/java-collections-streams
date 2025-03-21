package job_roles;

public class DataScientist extends JobRole{
    public DataScientist(String name, int experience) {
        super(name, experience);
    }

    @Override
    public boolean isQualified(){
        return experience > 3;
    }
}
