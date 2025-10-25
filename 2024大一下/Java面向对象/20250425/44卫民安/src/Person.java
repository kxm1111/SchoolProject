class student extends Person {
    private double score;
    public student() {
        System.out.println("子类无参");
    }
    public student(double score){
        this.score = score;
        System.out.println("子类有参");
    }

}
class Person {
    private String name;
    private int age;
    public Person() {
        System.out.println("父类无参");
    }
}