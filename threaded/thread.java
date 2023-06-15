package threaded;

import java.nio.channels.ScatteringByteChannel;

class thread extends Thread {
    private static int count = 1;
    private static final Object lock = new Object();

    private int threadId;

    public thread(int threadId) {
        this.threadId = threadId;
    }

    public void run() {
        while (count <= 100) {
            synchronized (lock) {
                if (count % 2 == threadId) {
                    System.out.println("Thread " + threadId + ": " + count);
                    count++;
                }
            }
        }
    }
    public static void main(String[] args) {
        thread thread1 = new thread(0);
        thread thread2 = new thread(1);

        thread1.start();
        thread2.start();
    }
}


