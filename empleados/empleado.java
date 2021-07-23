public class empleado {
    private String id;
    private String name;
    private double salary;
    //pojo ( plain old java object).
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    @Override
    public String toString() {
        return "empleado [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

   
    
    
    
}
