import javax.xml.transform.TransformerException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 10; j++) {
                    if (Thread.currentThread().isInterrupted()) {
                        break;
                    }
                    System.out.print(j);
                }
            }
        });
        thread.start();
        for (int i = 0; i < 10; i++) {
            if (i == 10) {
                thread.interrupt();
            }
            System.out.print("M");
        }
        System.out.println("\nFinish");
    }
}
