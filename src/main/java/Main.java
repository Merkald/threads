public class Main {
    public static void main(String[] args) {
        int num = 10;
        MyThread t1 = new MyThread(num);
        t1.start();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < num; i++) {
                    System.out.println("Runable-" + i);
                }
            }
        };
        runnable.run();
    }
}
