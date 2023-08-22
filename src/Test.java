public class Test {
    ProgressBar bar = new ProgressBar(10);

    public void test() throws InterruptedException {
        for (int i = 1; i < 11; i++) {
            Thread.sleep(500);
            bar.step();
        }
    }
}
