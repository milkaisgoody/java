package ex09.file;

public class SwitchEx {

    public static void main(String[] args) {
        // 조건문 분기문
        //if, 삼항 연산자
    
        //변수값을 바꿔가면서 실행


        int grade = 2;
        switch(grade){
            //변수 값이 일치하면 실행
            case 1 :
                System.out.println("1학년");
                //계속해서 다음 문장을 실행
                //if문과 다른점
                break;
            case 2 :
                System.out.println("2학년");
            default :
                System.out.println("기본");
                break;
        }

        int 요일 = 0;
        switch(요일){
            case 0 :
                System.out.println("일요일");
                break;
            case 1 :
                System.out.println("월요일");
                break;
            case 2 :
                System.out.println("화요일");
                break;
            default :
                break;
        }
        
    }
}
