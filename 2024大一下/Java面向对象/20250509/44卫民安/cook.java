class cook extends Employee {
    public cook() {

    }

    public cook(String id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        System.out.println("厨师炒菜多加点盐...");
    }
}
