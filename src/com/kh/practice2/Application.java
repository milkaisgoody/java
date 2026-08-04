package com.kh.practice2;

import java.util.Random;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class Application {
    public static void main(String[] args) {
        //  Dog dog = new Dog();

         //패키지가 다르면 import
        //추상클래스는 생성이 불가능하다. -> 구현이되면 그때 사용가능
         //new Animal();

         //1. Animal 타입의 객체 배열 생성 [방의개수]
         Animal animals [] = new Animal[5];
         
         //2. 각 인덱스에 무작위로 dog, cat을 생성해서 넣기
         //객체생성
         Dog dog1 = new Dog("멍멍이", "dog",15);
         //부모타입으로 자동형변환
         //다형성 : 여러가지 형태를 가질 수 있는 성질
         //자식 객체가 재정의한 메서드가 실행되어지므로 다양한 기능을 구현할 수 있다.
         animals[0] = dog1;

         animals[1] = new Cat("야옹이", "cat", "서울", "노랑");
         animals[2] = new Dog("레오", "dog", 8);
         animals[3] = new Cat("나비", "cat", "제주도", "검정");
         animals[4] = new Dog("우연이", "dog", 25);

         //3. 배열의 요소를 순회하며 toString를 출력
         //타입 변수명 : 배열/리스트
         for(Animal a : animals){
            // System.out.println(a.toString());
             //객체를 출력하면 객체의 toString메서드가 호출됨
             //System.out.println(a);
             //System.out.println("==================");
             a.speak();
         }

         /*for(int i = 0; i < animals.length; i++){
            int random_num = new Random().nextInt(2);

            if(random_num == 0){
                animals[i] = new Dog("강아", "시츄", 1);
            }else{
                animals[i] = new Cat("고양", "페르시안", "집", "흰색");
            }

            animals[i].speak();
         }*/

    }
}
