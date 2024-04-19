package chat03;

import java.util.concurrent.ArrayBlockingQueue;

public class java_14_Queue {
    public static void main(String[] args) throws Exception{
        // Queue 队列
        // ArrayBlockingQueue: Array + Blocking(阻塞，堵住) + Queue
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);

        //add()如果增加不了，直接发生错误
//        queue.add("zhangsan");
//        queue.add("lisi");
//        queue.add("wangwu");
//        queue.add("zhaoliu"); //发生错误，Queue full

//        queue.put("zhangsan");
//        System.out.println("第一个");
//        queue.put("lisi");
//        System.out.println("第二个");
//        queue.put("wangwu");
//        System.out.println("第三个");
//        queue.put("zhaoliu");
//        System.out.println("第四个");

        boolean zhangsan = queue.offer("zhangsan");
        System.out.println(zhangsan);
        boolean lisi = queue.offer("lisi");
        System.out.println(lisi);
        boolean wangwu = queue.offer("wangwu");
        System.out.println(wangwu);
        boolean zhaoliu = queue.offer("zhaoliu");
        System.out.println(zhaoliu);

//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());

//        System.out.println(queue.take());
//        System.out.println(queue.take());
//        System.out.println(queue.take());
//        System.out.println(queue.take());

        queue.size();
        queue.isEmpty();
        queue.clear();
        queue.contains("zhangsan");


        System.out.println(queue);
    }
}
