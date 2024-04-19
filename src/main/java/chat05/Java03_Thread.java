package chat05;

public class Java03_Thread {
    public static void main(String[] args) throws Exception {
        //TODo 线程 - 休眠
        //休眠三秒
        while (true) {
            Thread.sleep(3000);
            System.out.println("main线程执行完毕");
        }

    }
}

