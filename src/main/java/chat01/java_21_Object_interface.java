package chat01;

public class java_21_Object_interface {
    public static void main(String[] args) {
        //接口
        //所谓的接口,可以简单理解为规则
        //基本语法:interface 接口名称 {规则属性,规则的行为}
        //接口其实是抽象的
        //规则的属性必须为固定值,而且不能修改
        //属性和行为的访问权限必须为公共的
        //属性应该是静态的
        //行为应该是抽象的
        //接口和类是两个层面的东西
        //接口可以继承其他接口
        //类的对象需要遵循接口,在java中,这个遵循,称之为实现(implements),类需要实现接口,而且可以实现多个接口

        Computer c = new Computer();
        Light l = new Light();
        c.usb1 = l;
        Light l1 = new Light();
        c.usb2 = l1;
        c.powerSupply();
        //电脑提供能源
        //电灯接收能源
        //电灯接收能源
    }
}
interface USBInterface {

}
interface USBSupply extends USBInterface{
    public void powerSupply();
}
interface USBReceive extends USBInterface{
    public void powerReceive();
}
class Computer implements USBSupply {
    public USBReceive usb1;
    public USBReceive usb2;

    public void powerSupply() {
        System.out.println("电脑提供能源");
        usb1.powerReceive();
        usb2.powerReceive();
    }
}
class Light implements USBReceive {
    public void powerReceive() {
        System.out.println("电灯接收能源");
    }
}