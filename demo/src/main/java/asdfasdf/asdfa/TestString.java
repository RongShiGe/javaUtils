package asdfasdf.asdfa;

import java.util.HashMap;
import java.util.Map;

public class TestString {
    public static void main(String[] args) {
        Map map = new HashMap();
        String hello1 = "hello";
        String hello2 = "hello";
        String hello3 = new String(hello2);
        String hello4 = new String("hello");

        String world = "world";
        String helloworld1 = "helloworld";
        String helloworld2 = hello1 + world;

        System.out.println(hello1==hello2);//true
        System.out.println(hello1==hello3);//false
        System.out.println(hello3==hello4);//false
        System.out.println(System.identityHashCode(hello1));//245257410
        System.out.println(System.identityHashCode(hello3));//1705736037
        System.out.println(System.identityHashCode(hello4));//455659002

        System.out.println(hello1.equals(hello2));//true

        System.out.println(helloworld1==helloworld2);//false
        System.out.println(helloworld1.equals(helloworld2));//true

        System.out.println(helloworld1.hashCode());//-1524582912
        System.out.println(helloworld2.hashCode());//-1524582912

        System.out.println(System.identityHashCode(helloworld1));//250421012
        System.out.println(System.identityHashCode(helloworld2));//1915318863
    }
}
