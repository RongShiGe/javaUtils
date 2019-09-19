package asdfasdf.asdfa;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = student2;
        System.out.println(student1.equals(student2));
        System.out.println(student1 ==student2);
        System.out.println(student3.equals(student2));
        System.out.println(student3 == student2);
    }

}
