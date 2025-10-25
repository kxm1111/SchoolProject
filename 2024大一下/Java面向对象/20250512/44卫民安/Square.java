public class Square implements Shape {
    @Override
    public double area(double side) {
        return side * side;  // 面积公式：边长平方[3](@ref)
    }
}