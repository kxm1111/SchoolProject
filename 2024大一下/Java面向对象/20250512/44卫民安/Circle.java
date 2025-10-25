public class Circle implements Shape {
    @Override
    public double area(double radius) {
        return Math.PI * radius * radius;  // 面积公式：πr²[10](@ref)
    }
}