package com.sist2;

/**
 * Created by cjw on 2016-02-05.
 */
public class A {
    int field1;
    void method(){

    }

    static int field2;
    static void method2(){

    }

    //인스턴스 멤버 클래스
    class B{
        void method(){
            field1=10;
            method();

            field2=10;
            method2();
        }
    }

    //정적 멤버 클래스
    static class C{
        void method(){
            field2=10;
            method2();
        }
    }


}




















