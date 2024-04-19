package chat04;

import java.io.*;

public class java_04_IO_File_Copy_Buffer {
    public static void main(String[] args) {
        //文件复制
        //数据源文件对象
        File srcfile = new File("D:\\cangqio\\java-top-speed\\data\\word.txt");

        //数据目的地文件对象
        File destfile = new File("D:\\cangqio\\java-top-speed\\data\\word.txt.copy");

        //文件输入流（管道对象）
        FileInputStream in = null;
        //文件输出流（管道对象）
        FileOutputStream out = null;

        //缓冲输入流（管道对象）
        BufferedInputStream buffIn = null;
        //缓冲输出流（管道对象）
        BufferedOutputStream buffOut = null;

        //缓冲区（水桶）
        byte[] cache = new byte[1024];

        try {
            in = new FileInputStream(srcfile);
            out = new FileOutputStream(destfile);

            buffIn = new BufferedInputStream(in);
            buffOut = new BufferedOutputStream(out);

//            //打开阀门，流转数据（输入）
            int data = -1;
//            int data = in.read();
//            //打开阀门，流转数据（输出）
//            out.write(data);

            //问题1：代码重复性比较强
            //问题2：多读数据

//            data = in.read();
//            out.write(data);
//
//            data = in.read();
//            out.write(data);
//
//            data = in.read();
//            out.write(data);
//
//            //如果文件数据已经全部读取完毕后，那么再去读取数据，读取的结果就是-1，表示无效数据（结尾）
//            data = in.read();
//            if(data != -1) {
//                out.write(data);
//            }
//            //System.out.println(data);

            while ((data=buffIn.read(cache)) != -1) {
                buffOut.write(cache,0,data);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(buffIn != null) {
                try {
                    buffIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(buffOut != null) {
                try {
                    buffOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
