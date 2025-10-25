public class Outer {
    private int age = 99;
    public  static String a = "黑马";
    public  class Inner {
        private String name;
        private int age = 88;
        public void test() {
            System.out.println(age);
            System.out.println(a);
            int age = 77;
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(Outer.this.age);
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }
}
