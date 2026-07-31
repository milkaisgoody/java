package ex03.method.obj;

import java.util.Arrays;

public class Basic {
    private String 이름;
    private int 나이;
    private double 키;
    private double 몸무게;

    // 반환이 있는 메서드
    //반환이 없는 메서드 (void)
    //정적메서드 / 정적 필드 (static)
    // 객체를 생성하지 않고 클래스 이름으로 바로 불러와서 사용할 수 있는 메서드/필드


    public void info(String 이름, int 나이, double 키) {
        // 숫자를 나타내는 타입
        // 정수형 - int
        // 실수형 - double

        System.out.println("""
                이름 : %s
                나이 : %d
                키 : %f
                """.formatted(이름, 나이, 키));
    }

    public String getInfo(String 이름, int 나이, double 키) {
        return "이름: %s, 나이 : %d, 키 : %.2f".formatted(이름, 나이, 키); 
    }

    public static double getBmi(double 키, double 몸무게){
        double bmi = 0.0;
        //신체질량지수 (BMI)
        //bmi = 체중 / (신장*신장)
        // 당신의 키, 몸무게는, bmi, 정상입니다.
        if(키 >= 100){
            키 = 키 / 100;
        }

        bmi = 몸무게 / (키*키);
        
        return bmi;
    }

    // 형변환 
    // 정수 cm/kg
    public String getBmiStr(int 키, int 몸무게){
        String bmiStr = "";
        double bmi = 0.0;
        //신체질량지수 (BMI)
        //bmi = 체중 / (신장*신장)
        // 당신의 키, 몸무게는, bmi, 정상입니다.
        // if(키 >= 100){
        //     키 = 키 / 100;
        // }
        // bmi = 몸무게 / (키*키);

        //실수 -> 문자
        //+bmiToStr(bmi:double):string
        // 18.5미만 저체중, 22.95이하 정상, 24.9이하 비만 전단계, 나머지 비만

   
        bmi = 키 / ((double)키/100 * (double)키/100);

        String res = bmiToStr(bmi);

        
        bmiStr = """
                키 : %dcm, 몸무게: %dkg, bmi:%f, %s입니다.
                """.formatted(키, 몸무게, bmi, res); 

        return bmiStr;
    }

    /**
     * bmi를 매개변수로 받아서 문자로 변환
     * @param bmi
     */

    public static String bmiToStr(double bmi){
        //변수를 초기화하지 않으면 사용 불가능
        String str; 
        str = "";

        if(bmi < 18.5){
            str = "저체중";
        }else if(bmi <= 22.9){
            str = "정상";
        }else if(bmi <= 24.9){
            str = "비만 전단계";
        }else{
            str = "비만";
        }

        return str;
    }

    // static 키워드 : 프로그램 시작과 동시에 메모리에 올라간다
    //생성하지 않고 사용할 수 있다.
    // static이 붙어있는 애들끼리 호출할 수 있다.
    // public static void main(String[] args) {
    //     double bmi = getBmi(1.63, 55.5);
    //     System.out.println(bmi);

    //     String bmiStr = getBmiStr(163, 55);
    //     System.out.println(bmiStr);

    //     // 정수의 연산 결과는 정수
    //     // 타입변환 (형변환) - 명시적 형변환/자동 형변환
    //     // (타입)을 앞에 붙여준다.
    //     long l = 100; //자동형변환
    //     System.out.println((double)100/3);
    // }

    // +getLotto() - 1-46까지의 임의의 숫자를 뽑아서 배열에 담아 반환
    public static int[] ex01(){
        // 배열 -> 컬렉션프레임워크 (List, Set , Map)
        //1. 타입이 같은 데이터를 여러개 보관
        //2. 길이(개수)가 정해져있다.

        //배열을 만들때 값을 넣고 배열을 만드는 방법
        int[] lotto = {1, 2, 3, 4, 5, 6};
        // 방의 개수를 지정해서 배열을 만드는 방법
        int[] lotto1 = new int[6];
        lotto1[0] = 1;

        // 배열의 선언과 초기화
        String str[] = {"이미지", "오미자"};

        // 배열을 선언
        // 배열은 타입의 기본값으로 초기화
        String str1[] = new String[2];
        // 배열을 초기화
        str1[0] = "이미자";

        //반복문을 이용해서 배열에 접근해서 값을 출력
        //초기값, 비교, 증강값
        // 배열의 길이 : 배열의변수이름.length
        for(int i=0; i<str1.length;i++){
            System.out.println("str1: " + str1[i]);
        }
        
        //향상된 for문
        String lottoStr = "";
        for(int num:lotto1){
            //System.out.print(num + ", ");
            lottoStr += num + ", ";
        }

        System.out.println("lotto : " + lottoStr);
        System.out.println(lottoStr.substring(0, lottoStr.length()-2));

        System.out.println();
        System.out.println("hello".length());
        System.err.println("hello".substring(2));
        // 시작인덱스 포함, 끝인덱스 불포함
        System.out.println("hello".substring(0, 3));
        //해당문자열의 위치를 반환
        //해당문자열이 없으면 -1을 반환
        System.out.println("hello".indexOf("l"));
        if("hello".indexOf("1") > -1){
            System.out.println("문자가 포함되어 있어요.");
        }
        //앞뒤의 공백을 모두 제거 
        System.out.println("  abc123  ".trim());
        System.out.println("hello".replace("l", "o"));
        System.out.println("abc".equals("abc"));

        String a = "abc";
        String b = "abc";

        System.out.println("a==b : " + (a == b));
        System.out.println("a==b : " + a.equals(b));
        
        String aa = new String("abc");
        String bb = new String("abc");

        System.out.println("aa==bb : " + (aa == bb));
        //문자열의 값을 비교할때는 equals메서드를 이용해야함
        System.out.println("aa==bb : " + aa.equals(b));

        //타입의 기본값
        //필드를 초기화 하지 않은 경우 타입의 기본값
        //배열의 값을 초기화 하지 않은 경우 타입의 기본값
        //참조타입의 기본값 = null
        String name = null;
        //예외를 처리하지 않으면 프로그램이 비정상적으로 종료 -> try/catch
        // System.out.println(name.length()); // -> nullPotinException
        if(name != null){
            System.out.println("name : " + name);
        }else{
            System.out.println("name은 null입니다. ");
        }

        String res = "Y";
        //문자열이 Y이면 계속 실행
        if(res != null && res.equals("Y")){

        }
        // 리터럴이 먼저 오는 경우, null체크 할 필요가 없다
        // 대소문자를 구분하지 않고 비교

        if("y".equalsIgnoreCase(res)){
            System.out.println("Y비교 - 대소문자를 가리지 않아요!");
        }

        return lotto;
    }

    // 1-46까지 임의의 숫자를 뽑아서 배열에 담아서 반환
    public static int[] getLotto(){
        //1. 정수 6개를 저장할 수 있는 배열을 만들고 반환
        int []lotto = new int[6];

        //배열의 값을 초기화하지 않으면 타입의 기본값 0, 0.0
        System.out.println(Arrays.toString(lotto));
        //반복문을 이용해서 배열에 임의의 수를 생성해서 반환하기
        // i = 0부터 5까지 1씩 증가하면서 코드블럭을 실행
        for(int i = 0; i < lotto.length; i++){
            lotto[i] = (int)(Math.random()*45) + 1;
            // 임의의 번호를 뽑아서 변수에 저장
            // 배열을 돌면서 중복된 값이 있는지 확인

            for(int j = 0; j < i; j++){
                //j는 0부터 i보다 작을때까지
                if(lotto[i] == lotto[j]){
                    // System.out.println(Arrays.toString(lotto));
                    // System.out.println("중복되었어요");
                    i--;
                    break;
                }
            }

        }
        // 배열의 요소의 값을 출력
        System.out.println(Arrays.toString(lotto));
        

        return lotto;
    }
    public static void printMenu(){
        System.out.println("""
                메뉴
                1. BMI계산기
                2. 로또생성기

                메뉴를 선택해주세요.
                종료하시려면 9를 눌러주세요.
                """);
    }

    public static void main(String[] args) {
        // ex01();
        // Basic.getLotto();

        printMenu();
    }

}
