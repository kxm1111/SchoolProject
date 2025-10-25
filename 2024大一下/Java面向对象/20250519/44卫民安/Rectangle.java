class Rectangle implements Shape {
    double length;
    double width;
    public Rectangle() {}
    public  Rectangle(double length,double width) {
        this.lenth = length;
        this.width = width;
    }
    public double length() {
        double x = (length + width)*2;
        System.out.println("长方形的周长为" + x);
        return x;
    }
}
