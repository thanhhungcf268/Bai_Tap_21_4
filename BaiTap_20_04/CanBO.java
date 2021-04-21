package BaiTap_20_04;
public class CanBO {
    private String name,age,homTown;

    public CanBO(String name, String age, String homTown) {
        this.name = name;
        this.age = age;
        this.homTown = homTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHomTown() {
        return homTown;
    }

    public void setHomTown(String homTown) {
        this.homTown = homTown;
    }

    @Override
    public String toString() {
        return " , name : " + name +
                " age : " + age +
                " , homTown : " + homTown ;
    }
}
