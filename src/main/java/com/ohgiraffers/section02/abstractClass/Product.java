package com.ohgiraffers.section02.abstractClass;

public abstract class Product {

    // 추상클래스는 필드를 가질 수 있다.

    private int nonStaticField;
    private static int staticField;

    // 추상클래스는 생성자를 가질 수 있으나, 직접적으로 인스턴스를 생성할 수 없다.

    public Product() {}

    // 추상클래스는 일반적인 메소드도 가질 수 있음

    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonstatic 메소드 호출 ");
    }
    public static void staticMethod() {
        System.out.println("Product 클래스의 static 메소드 호출 ");
    }

    /* 필기. 추가적으로 미완성 메소드(추상메소드)도 만들 수 있음 */

    public abstract void abstMethod();

}
