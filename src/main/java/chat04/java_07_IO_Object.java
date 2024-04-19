package chat04;

import java.io.*;

public class java_07_IO_Object {
    public static void main(String[] args) {
        //文件复制-序列化&反序列化
        //数据文件对象
        File datafile = new File("D:\\cangqio\\java-top-speed\\data\\obj.dat");

        //对象输出流（管道对象）
        ObjectOutputStream objectOutput = null;
        FileOutputStream out = null;

        //TODo 对象输入流
        ObjectInputStream objectIn = null;
        FileInputStream in = null;
        try {
            out = new FileOutputStream(datafile);
            objectOutput = new ObjectOutputStream(out);

            //Java中只有增加了特殊的标记的类，才能在写文件中进行序列化操作
            //这里的标记就是一个接口

            User user = new User();
            objectOutput.writeObject(user);
            objectOutput.flush();

            //从文件中读取数据转换成对象
            in = new FileInputStream(datafile);
            objectIn = new ObjectInputStream(in);
            Object o = objectIn.readObject();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if(objectOutput != null) {
                try {
                    objectOutput.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
class User implements Serializable{

}