class Circle implements Shape{
    double r;
    public Circle() {}
    public Circle(double r) {
        this.r = r;
    }

    public double length() {
        double x = 2*Math.PI*r;
        System.out.println("圆形的周长为"+x);
        return x;
    }
}
