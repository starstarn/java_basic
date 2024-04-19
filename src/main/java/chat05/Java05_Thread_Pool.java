package chat05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Java05_Thread_Pool {
    public static void main(String[] args) throws Exception {
        //TODo 线程 - 线程池
        // 所谓的线程池，其实就是线程对象的容器
        // 可以根据需要，在启动时，创建一个或者多个线程对象
        // Java中有4种比较常见的线程池

        // 1. 创建固定数据的线程对象
        //  ExecutorService是线程服务对象
        // ExecutorService executorService = Executors.newFixedThreadPool(3);

        // 2. 根据需求动态创建线程
        // ExecutorService executorService = Executors.newCachedThreadPool();

        // 3. 单一线程
        // ExecutorService executorService = Executors.newSingleThreadExecutor();

        // 4. 定时调度线程
        ExecutorService executorService = Executors.newScheduledThreadPool(3);

        for(int i = 0; i < 5; i ++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

        System.out.println("main线程执行");
    }
}

