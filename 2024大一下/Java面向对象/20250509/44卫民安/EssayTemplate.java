abstract class EssayTemplate {
    // 模板方法（final防止子类覆盖整体结构）
    public final void writeEssay() {
        writeTitle();
        writeFirstParagraph();
        writeBody();    // 抽象方法留给子类实现
        writeLastParagraph();
    }

    // 固定部分的具体实现
    private void writeTitle() {
        System.out.println("《我的爸爸》");
    }

    private void writeFirstParagraph() {
        System.out.println("我有一个世界上最特别的爸爸，他是我生命中最重要的人。");
    }

    private void writeLastParagraph() {
        System.out.println("这就是我的爸爸，虽然平凡，但在我心中永远是最伟大的！");
    }

    // 抽象方法：正文部分由子类实现
    protected abstract void writeBody();
}