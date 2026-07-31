// 패키지
// 클래스의 일부이며 클래스를 식별하는 용도
// 상위 패키지, 하위 패키지로 구분
// 패키지 선언은 최상단에 위치하며 패키지가 잘못 작성된 경우 오류 발생
package com.kh.object;

// 자동완성시 임포트문이 자동으로 완성되지만 코드를 따라친 경우 안나옴
import com.kh.object.practice.NonstaticSample;

// 클래스의 선언부
public class App {
    // 프로그램의 시작
    public static void main(String[] args) {
        // 1. 객체 생성 : 클래스 (설계도)를 통해 객체를 생성
        // 타입 변수명 = new 타입();
        // new 연산자를 통해 생성자를 실행하여 객체를 생성하고 변수에 담아준다
        // 클래스 -> 인스턴스 (메모리에 올라가서 사용가능 상태)
        // 임포트하는 방법
        // 1. 빠른수정 -> 임포트, 2. 단축키(alt+shift+o), 3. 직접 작성
        NonstaticSample sample = new NonstaticSample();
       
        // 변수명에 .을 찍으면 객체가 가지고 있는 속성, 메서드에 접근 가능
        // 리소스 찾기 (ctrl+p)
        sample.printLottoNumbers();
    }
}
