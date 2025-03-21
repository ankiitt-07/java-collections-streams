package job_roles;

public class ProductManager extends JobRole{
    public ProductManager(String name, int experience) {
        super(name, experience);
    }

    @Override
    public boolean isQualified(){
        return experience > 8;
    }
}