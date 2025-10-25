class Square implements Shape {
    double x;
    public Square(double x) {
        this.x = x;
    }
    public double length() {
        System.out.println("正方形的周长为"+4*x);
        return 4*x;
    }
}
