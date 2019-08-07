package com.weconex;

public class Hello extends World implements heihei {

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        Person p1 = new Person();
        p1.setName("张飞");
        p1.setAge("214");
        p1.setHobby("打架");
        test();
    }

    public static void test() {
        Person p1 = new Person();
        p1.setName("张飞");
        p1.setAge("214");
        p1.setHobby("打架");
        System.out.println(p1);
    }
}
