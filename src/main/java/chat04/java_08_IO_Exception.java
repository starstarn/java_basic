//package chat04;
//
//import java.io.*;
//
//public class java_08_IO_Exception {
//    public static void main(String[] args) {
//
//        //TODo IO
//        // FileNotFoundException, IOException
//        FileInputStream in = null;
//        // ClassNotFoundException,NotSerializableException
//        ObjectInputStream objIn = null;
//        ObjectOutputStream objOut = null;
//
//        try {
//            in = new FileInputStream("xxx");
//
//            in.read();
//            objOut.writeObject();
//            objIn.readObject();
//        } catch (Exception e) {
//
//        } finally {
//            if(in!=null) {
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }
//}
//
