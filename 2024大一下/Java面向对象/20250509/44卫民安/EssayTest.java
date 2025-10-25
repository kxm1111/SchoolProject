public class EssayTest {
    public static void main(String[] args) {
        System.out.println("====== 小学生作文 ======");
        EssayTemplate pupil = new PupilStudent();
        pupil.writeEssay();

        System.out.println("\n====== 中学生作文 ======");
        EssayTemplate middleStudent = new MiddleSchoolStudent();
        middleStudent.writeEssay();
    }
}