package com.javaex.problem04;

public class CConverter {
    
    public static double rate;
    
    public static void setRate(double r){
        CConverter.rate = r;
    }
    
    public static double toDoller(double won){
        return won / rate;
    }

    public static double toKWR(double dollar){
        return dollar * rate;
    }
    

}


// static을 쓰면 자식클래스에서 따로 변수 설정이 필요없고 부모클래스의 이름이 변수역할을 한다.

// 변수가 다수 필요할때는 static을 풀고 자식클래스에서 변수를 설정해 주어야한다.