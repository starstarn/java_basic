package chat03;

import java.util.ArrayList;

public class java_07_Collection {
    public static void main(String[] args) {
        //Collection
        ArrayList<Person7> list = new ArrayList();
//        Person7 user = new User7();
//        user.testUser();
//        user.testPerson();
        Person7 person = new Person7();
        User7 user = new User7();

        list.add(person);
        // list.add(user);

//        list.remove(0);
//
//        //从集合中获取的对象类型为Object
//        Object o = list.get(0);
//        //如果想要执行对象的方法，那么需要进行强制类型转换
//        if(o instanceof Person7) {
//            Person7 p = (Person7)o;
//            p.testPerson();
//        }

        Person7 person7 = list.get(0);
        person7.testPerson();
    }
}
class Person7 {
    public void testPerson() {
        System.out.println("person...");
    }
}

class User7{
    public void testUser() {
        System.out.println("user...");
    }
}
