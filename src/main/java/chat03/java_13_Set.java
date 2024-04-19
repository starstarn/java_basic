package chat03;

import java.util.HashMap;
import java.util.HashSet;

public class java_13_Set {
    public static void main(String[] args) {
        //HashSet
        //HashSet底层数据结构为 数组+链表
        HashSet set = new HashSet();

        User13 user1 = new User13();
        user1.id = 1001;
        user1.name = "zhangsan";
        System.out.println(user1.hashCode());

        User13 user2 = new User13();
        user2.id = 1001;
        user2.name = "wangwu";
        System.out.println(user2.hashCode());

        User13 user3 = new User13();
        user3.id = 1002;
        user3.name = "lisi";

        set.add(user1);
        set.add(user2);
        set.add(user3);

        System.out.println(set);
    }
}

class User13 {
    public int id;
    public String name;

    @Override
    //类似于内存地址
    public int hashCode() {
        return id;
    }

    @Override
    //判断两个对象的属性是否完全相同
    public boolean equals(Object obj) {
        if(obj instanceof User13) {
            User13 otherUser = (User13)obj;
            if(otherUser.id == this.id) {
                if(otherUser.name.equals(this.name)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "User["+id+","+name+"]";
    }
}
