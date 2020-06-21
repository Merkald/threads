public class MyThread extends Thread {
    int num;

    public MyThread(int num) {
        this.num = num;
    }

    public void run() {
        for (int i=0; i<num; i++) {
            System.out.println("Thread-" + i);
        }

    }
}
