package job_roles;

public abstract class JobRole {
    protected String name;
    protected int experience;

    public JobRole(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract boolean isQualified();

    @Override
    public String toString() {
        return "JobRole [name=" + name + "]";
    }
}