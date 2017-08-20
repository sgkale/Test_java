package to_string;

public class details {

    private String name;
    private String division;
    private int age;

    details(String name,String division,int age)
    {
        this.name=name;
        this.division=division;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Name= "+name+" Division= "+division+" Age="+age;
    }
}
