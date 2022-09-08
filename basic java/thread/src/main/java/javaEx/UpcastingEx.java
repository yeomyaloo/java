package javaEx;

public class UpcastingEx {
    public static void main(String[] args) {
        Person p;
        Student s = new Student("얄야루");
        p = s; //업캐스팅

        System.out.println(s);
        System.out.println(p.name);
        System.out.println(p instanceof Person);
        System.out.println(s instanceof Student);
        System.out.println(p instanceof Student);
    }
}
