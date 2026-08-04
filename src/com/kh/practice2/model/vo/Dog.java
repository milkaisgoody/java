package com.kh.practice2.model.vo;

//vo/dto : 필드와 setter, getter 메서드를 가진다.
//데이터를 담는 그릇과 같은 역할
//자식이 부모를 지정 extends 키워드를 이용
//자식은 부모가 가진 모든 필드와 메서드를 상속
//미구현된 메서드가 있다면 구현해야함
//-> 아니면 추상클래스가 되어야함
public class Dog extends Animal{
    public static final String PLACE = "애견카페";
    private int weight;

    //접근제한자를 안쓸경우 Default 접근제한자가 됨 - 같은 패키지에서 접근 가능
    public Dog(){}
    public Dog(String name, String kinds, int weight){
        super(name, kinds);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    @Override
    public void speak(){
        String str = "";
        str += super.toString() + "몸무게는 " + weight + "kg 입니다.\n";

        System.out.println(str);
    }
}
