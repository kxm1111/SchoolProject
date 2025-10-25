public class Test {
    public static void main(String[] args) {
        String rs = test("test"); // 自动推断T为String
        Dog d = test(new Dog());  // 自动推断T为Dog
    }

    public static <T> T test(T t) {
        return t;
    }
}
class Dog {}