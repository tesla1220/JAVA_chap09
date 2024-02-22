package com.ohgiraffers.section02.abstractClass;

public class SmartPhone extends Product {

    /* 필기
    *   SmartPhone 클래스는 Product 클래스를 상속받아서 구현
    *   extends 키워드로 클래스를 상속받을 때 두 개 이상의 클래스는 상속받지 못함
    *   ★★★★★★ 추상클래스가 가지는 추상메소드는 반드시 오버라이딩해야 함 (강제성) ★★★★★★ */

    public SmartPhone() {}


    @Override
    public void abstMethod() {

        System.out.println("Product 클래스의 추상메소드를 오버라이딩한 메소드 호출 ");
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 일반 메소드 호출됨 ");
    }
}
