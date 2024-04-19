package chat04;

import java.io.*;

public class java_05_IO_File_Copy_String {
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
        try {
            in = new FileInputStream(srcfile);
            out = new FileOutputStream(destfile);

//            //打开阀门，流转数据（输入）
            int data = -1;
//            //打开阀门，流转数据（输出）

            StringBuilder ss = new StringBuilder();

            while ((data=in.read()) != -1) {
//                System.out.println(data+1);
//                out.write(data+1);
                ss.append((char)data);
            }
            ss.append(" zhangsan");
            System.out.println(ss);
            //可以将字符串转换成字节数组，再将数组中的每一个字节写入到文件到


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
