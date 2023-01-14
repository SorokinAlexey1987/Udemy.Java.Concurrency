import javax.xml.transform.TransformerException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int j = 0; j < 10; j++) {
                        if (Thread.currentThread().isInterrupted()) {
                            break;
                        }
                        System.out.print(j);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            if (i == 10) {
                thread.interrupt();
            }
            System.out.print("M");
        }
        System.out.println("\nFinish");
    }
}
