public class j0324 {
    public static void main(String[] args) {
//  题目1
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

//  题目2
        int[] array1 = {100, 50, 90, 60, 80, 70};
        int sum = 0;
        for (int num : array1) {
            sum += num;
        }
        System.out.println("数组元素和为：" + sum);

//  题目3
        int[] array2 = {100, 50, 90, 60, 80, 70};
        int min = array2[0];
        for (int num : array2) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("数组最小值为：" + min);

//  题目4
        int[] array3 = {100, 50, 90, 60, 80, 70};
        int max = array3[0];
        for (int num : array3) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("数组最大值为：" + max);

//  题目5
        int[] array4 = {100, 50, 90, 60, 80, 70};
        if (array4.length <= 2) {
            System.out.println("数组长度不足，无法计算平均值");
            return;
        }
        int sum1 = 0;
        int max1 = array4[0];
        int min1 = array4[0];
        for (int num : array4) {
            sum1 += num;
            max1 = Math.max(max1, num);
            min1 = Math.min(min1, num);
        }
        int adjustedSum = sum1 - max1 - min1;
        int average = adjustedSum / (array4.length - 2);
        System.out.println("去掉最大值和最小值后的平均值为：" + average);





























    }

}
