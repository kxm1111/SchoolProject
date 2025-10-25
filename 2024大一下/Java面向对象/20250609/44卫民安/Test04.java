public class Test04 {
public static void func(int a) {
    throw new MyException("呵呵!");
}
    public static void main(String[] args) {
        try {
            func(20);
        }catch (MyException myException) {
            myException.print
        }
    }
}
