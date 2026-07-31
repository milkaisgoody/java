package com.kh.object.practice;

public class NonstaticSample {
    // 필드
    //메서드 선언부
    // 접근제한자 반환타입 메서드명 (매개변수타입 변수이름) {}
    public void printLottoNumbers(){
        // 자바표준 출력
        // 콘솔창에 출력할 때 사용
        System.out.print("printLottoNumbers()가 호출되었습니다."); //줄바꿈 없이 출력
        System.out.println("로또번호를 생성합니다."); //출력후 줄바꿈
        System.out.printf(""); //형식을 이용한 출력
    }

    public void outputChar(int num, char c){


    }

    public char alphabette(){
        return 'a';
    }

    public String mySubstring(String str, int index1, int index2){
        return "";
    }

    //생성자
}
