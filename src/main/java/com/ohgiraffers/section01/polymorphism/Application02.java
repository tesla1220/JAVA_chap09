package com.ohgiraffers.section01.polymorphism;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표 : 다형성을 적용해서 객체 배열을 만들어 인스턴스를 연속 처리해보자!! */

        동물[] anaimals = new 동물[5];
        anaimals[0] = new 토끼();
        anaimals[1] = new 호랑이();
        anaimals[2] = new 토끼();
        anaimals[3] = new 호랑이();
        anaimals[4] = new 토끼();

        /* 필기
        *   동물 클래스가 가지는 메소드를 오버라이딩한 메소드 호출 시 동적 바인딩 이용 */

        for(int i = 0; i < anaimals.length; i++) {
            anaimals[i].울기();
        }


        System.out.println();


        /* 필기
        *   각 클래스별 고유한 메소드(점프, 물어뜯기)를 동작시키기 위해서는
        *   down-casting 을 명시적으로 해야하는데
        *   ClassCastException을 방지하기 위해 instanceof 연산자를 이용해야 한다. */

        for (int i = 0; i < anaimals.length; i++) {

            // 동물들어 만약에 너가 토끼면 점프를 뛰고 호랑이면 물어라!!
            if(anaimals[i] instanceof 토끼 ) {
                ((토끼) anaimals[i]).점프();

            } else if (anaimals[i] instanceof 호랑이 ) {
                ((호랑이)anaimals[i]).물어뜯기();

            } else {
                System.out.println("토끼나 호랑이가 아닙니다");
            }


        }
    }

}
