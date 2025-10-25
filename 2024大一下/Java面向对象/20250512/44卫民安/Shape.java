public interface Shape {
    /**
     * 计算图形面积（参数根据图形类型不同具有不同含义）
     * @param param 图形特征参数（正方形边长/圆半径）
     * @return 面积值
     */
    double area(double param);
}