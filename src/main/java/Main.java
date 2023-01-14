public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Thread thread = new MyThread();
        thread.start();
        System.out.println("\nFinish");
    }
}
