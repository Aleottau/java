/**
 * POJO (Plain Old Java Object) de empleados
 */
public class Empleado {
    private static final double MINIMUM_WAGE = 908526;
    public String id;
    public String name;
    public String sex;
    public double salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        try {
            int x = Integer.parseInt(id);
            if (x > 100000)
                this.id = x + "";
            else
                this.id = (x + 100000) + "";

        } catch (Exception e) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex != "M" && sex != "F")
            this.sex = "I";
        else
            this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < MINIMUM_WAGE)
            this.salary = MINIMUM_WAGE;
        else
            this.salary = salary;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", name=" + name + ", sex=" + sex + ", salary=" + salary + "]";
    }
}