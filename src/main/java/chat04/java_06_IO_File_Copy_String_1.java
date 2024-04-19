package chat04;

import java.io.*;

public class java_06_IO_File_Copy_String_1 {
    public static void main(String[] args) {
        //文件复制
        //数据源文件对象
        File srcfile = new File("D:\\cangqio\\java-top-speed\\data\\word.txt");

        //数据目的地文件对象
        File destfile = new File("D:\\cangqio\\java-top-speed\\data\\word.txt.copy");

        //字符输入流（管道对象）
        BufferedReader reader = null;
        //字符输出流（管道对象）
        PrintWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(srcfile));
            writer = new PrintWriter(destfile);

            //读取文件中的一行数据（字符串）
            String line = null;

            while ((line=reader.readLine()) != null) {
                System.out.println(line);
                writer.println(line);
            }
            //刷写数据
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(writer != null) {
                writer.close();
            }
        }

    }
}
