abstract class Employee {
    private String id;
    private String name;
    private double salary;
    public Employee() {

    }
    public Employee(String id,String name,double salary) {
        this.id  = id;
        this.id = name;
        this.salary = salary;
    }
    abstract public void work();
}
