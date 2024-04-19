package chat05;

public class Java01_Thread {
    public static void main(String[] args) {
        //TODo 线程
        // Thread是线程类
        // currentThread() 用于获取当前正在运行的线程
        // getName() 用于获取线程的名称

        //线程对象必须为可运行状态才可以运行，其他状态是无法运行的


        // 创建线程
        // Thread t = new Thread();
        MyThread t = new MyThread();

        // TODo 启动线程
        t.start();
        t.stop();

        // main() 运行在main线程中
        System.out.println(Thread.currentThread().getName());
    }
}

// TDOo 声明自定义线程类
class MyThread extends Thread {
    // 重写运行指令

    public void run() {
        System.out.println("MyThread："+Thread.currentThread().getName());
    }
}
