package chat05;

public class Java02_Thread {
    public static void main(String[] args) throws Exception {
        //TODo 线程 - 执行方式（串行，并发执行）
        //串行执行：多个线程连接成串，然后按照顺序执行
        //并发执行：多个线程是独立的，谁抢到了CPU执行权，谁就能执行

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();

        //将线程连接成串
        t1.join();

        t2.start();

        //将线程连接成串
        t2.join();

        System.out.println("main线程执行完毕");

    }
}

// TDOo 第一个线程
class MyThread1 extends Thread {
    // 重写运行指令

    public void run() {
        System.out.println("MyThread-1："+Thread.currentThread().getName());
    }
}
// TDOo 第二个线程
class MyThread2 extends Thread {
    // 重写运行指令

    public void run() {
        System.out.println("MyThread-2："+Thread.currentThread().getName());
    }
}
