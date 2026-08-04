package com.kh.practice2.model.vo;

//추상메서드를 하나라도 가지면 추상클래스가 되어야함
//추상화 : 불필요한 세부사항을 제거하고 핵심적인 공통기능을 추출하여 단순화하는 과정
//중복제거 - 재사용 - 수정이 발생할 경우 한곳만 수정
public abstract class Animal {
    private String name;
    private String kinds;

    protected Animal(){}
    protected Animal(String name, String kind){
        this.name = name;

        //이름이 다르면 this안써도 됨
        kinds = kind;
    }

    //Override : 부모 메서드를 자식이 재정의
    //모든 클래스는 Object 객체의 자식
    //print문에 객체를 넣으면 toString메서드의 결과가 출력됨
    @Override
    public String toString(){
        // String str = "저의 이름은 %s이고, 종류는 %s입니다.".formatted(name, kinds);
        String str = "저의 이름은 " + name +
            "이고, 종류는 " + kinds + "입니다. ";

         return str;
    }

    //추상 메서드 - 코드블럭이 없다
    //자식에게 기능구현을 위임
    public abstract void speak();
}
