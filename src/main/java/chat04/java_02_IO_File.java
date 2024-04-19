package chat04;

import java.io.File;
import java.io.IOException;

public class java_02_IO_File {
    public static void main(String[] args) throws IOException {
        //TODo Java - IO 文件流

        //TODo File: 文件类型（文件，文件夹），属于java.io
        //创建文件对象,使用文件路径关联系统文件
        String filePath = "D:\\cangqio\\java-top-speed\\data\\newfile";
        File file = new File(filePath);
        System.out.println(file);

        //文件对象的操作
        //TODo 判断当前文件对象是否为文件
//        System.out.println(file.isFile());
//        //TODO 判断当前文件对象是否为文件夹
//        System.out.println(file.isDirectory());
//        //TODo 判断文件对象是否存在关联
//        System.out.println(file.exists());

        if(file.exists()) {
            //文件对象存在的情况
            System.out.println("文件对象存在");
            if(file.isFile()) {
                System.out.println("文件对象关联的是一个文件");
                System.out.println(file.getName());
                System.out.println(file.length());
                System.out.println(file.lastModified());
                System.out.println(file.getAbsoluteFile());
            } else if(file.isDirectory()) {
                System.out.println("文件对象关联的是一个文件夹");
                System.out.println(file.getName());
                System.out.println(file.lastModified());
                System.out.println(file.getAbsoluteFile());
                String[] list = file.list();
                for (String s : list) {
                    System.out.println("文件夹中的文件"+s);
                }
                File[] files = file.listFiles();
                for (File file1 : files) {
                    System.out.println("文件夹中的文件对象"+file1);
                }
            }
        } else {
            //文件对象不存在的情况
            System.out.println("文件对象不存在，没有关联成功");
            //创建多级文件目录
            //file.mkdirs();
            //创建新文件
            file.createNewFile();
        }
    }
}
