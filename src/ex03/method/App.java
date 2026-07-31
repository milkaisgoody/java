package ex03.method;

import ex03.method.obj.Basic;

public class App {
    public static void main(String[] args) {
        //Basic 객체 생성하기
        Basic basic = new Basic();
        // + info(name:String, age:int, height: double) : void
        // 이름, 나이, 키를 받아서 출력
        basic.info("이미자", 25, 159.3);
        // + getinfo(name:String, age:int, height: double) : String
        // 이름, 나이, 키를 받아서 한줄로 반환
        String basic_info = basic.getInfo("오미자", 22, 160.35);
        //반환 받은 값을 변수에 저장해서 출력
        System.out.println(basic_info);

        // +getBmi(키-m:double, 몸무게-kg:double) : double
        // 체중 / (신장)^2
        double bmi = basic.getBmi(1.63, 55.5);
    }

}
