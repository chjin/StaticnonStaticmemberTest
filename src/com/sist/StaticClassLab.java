package com.sist;

/**
 * Created by cjw on 2016-02-05.
 */
public class StaticClassLab {
    //인스턴스 멤버 클래스
    class B {

    }
    //정적 멤버 클래스
    static class C{

    }

    //인스턴스 필드
    B field1=new B();
    C field2=new C();

    //정적 필드 초기화
    static C field3=new C();

    //인스턴스 메소드
    void method1(){
        B var1=new B();
        C var2=new C();
    }

    //정적 메소드
    static void method2(){
        C var1=new C();
    }

}













