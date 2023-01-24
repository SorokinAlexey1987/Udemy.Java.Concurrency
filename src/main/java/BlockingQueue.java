import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    Queue<Runnable> queue = new LinkedList<>();

    public void add(Runnable task) {
        queue.add(task);
    }

    public Runnable take() {
        return queue.poll();
    }
}
