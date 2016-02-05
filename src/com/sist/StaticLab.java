package com.sist;

import java.lang.Math;
/**
 * Created by cjw on 2016-02-05.
 */

class StaticSample{
    public int a;            //non-static 멤버는 객체마다 별도 존재 ==> 인스턴스 멤버 선언.
    public static int b;    //static(정적) 멤버는 객체가 생기기 전에도 사용 가능. 멤버는 클래스당 하나 생성 ==> 클래스 멤버라 함.정적 멤버 선언.(공용적인 데이터)
                              //==>클래스에 고정된 필드와 메소드(정적 필드,정적 메소드) , 객체 내부에 존재하지 않고, 클래스에 소속된 멤버임.
    public void c(){
        b=20;
    }
    public void d(){                //인스턴스 메소드(인스턴스 필드로 작업해야 할 메소드)
        b=30;
    }
    public static void e(){         //정적 메소드 선언(인스턴스 필드로 작업하지 않는 메소드)
        b=5;                //static 메소드는 오직 static 멤버만 접근 가능함.(객체가 생성되지 않은 상황에서도
       // a=1;                    //                                                static 메소드 실행될수 있으므로.)
    }

    /*
    static 활용==> 전역변수와 전역함수 만들때 사용.
                    클래스 내부에 구현해야 함. ==> 다른 모든 클래스에서 사용할 수 있음.
     */
}

public class StaticLab {
    public static void main(String[] args){
        StaticSample staticSample1, staticSample2;
        staticSample1=new StaticSample();
        staticSample1.a=5;
        staticSample1.c();
        //static 멤버 접근 -- 객체의 멤버로도 접근 가능.(바람직하지 않음)
        staticSample1.b=50;
        System.out.println(staticSample1.b);

        staticSample2=new StaticSample();
        staticSample2.a=8;
        staticSample2.d();
        //static 멤버 접근 -- 객체의 멤버로도 접근 가능.(바람직하지 않음)
        staticSample2.e();
        System.out.println(staticSample1.b);



        //static 멤버 접근 -- 클래스 이름으로 접근 가능.
        StaticSample.b=10;
        StaticSample staticSample3;
        staticSample3=new StaticSample();
        System.out.println(staticSample3.b);

        staticSample3.e();
        System.out.println(staticSample3.b);

        //static 멤버 접근 -- 클래스 이름으로 접근 가능.
        StaticSample.e();
        System.out.println(staticSample3.b);
    }
}























