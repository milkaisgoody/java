package com.kh.inherit;

//import java.util.Scanner;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Person;
import com.kh.inherit.practice.Student;
import com.kh.util.InputUtil;

public class Application {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        //3명의 학생 정보를 기록할 수 있는 배열을 생성
        Student []students = new Student[3];

        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥", 21,187.3, 80.0, 2, "경영학과");
        students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for(Student s : students){
            System.out.print(s.information());
        }


        Employee employees[] = new Employee[10];

        int i = 0;
        while (true) {
            //키보드로부터 사원의 정보를 입력받아 배열에 저장합니다.

            String name = InputUtil.getString("이름 : ");
            int age = InputUtil.getInt("나이 : ");
            double height = InputUtil.getDouble("신장 : ");
            double weight = InputUtil.getDouble("몸무게 : ");
            int salary = InputUtil.getInt("급여 : ");
            String dept = InputUtil.getString("부서 : ");
            employees[i] = new Employee(name, age, height, weight, salary, dept);
            
            String res = InputUtil.getString("계속 사원을 등록 하시겠습니까? (Y/N)");
            //y가 아니면 반복문 탈출
            if(!res.equalsIgnoreCase("Y")){
                break;
            }

            i++;
        }

        for(int j = 0; j < i; j++){
            System.out.println(employees[j].information());
        }

        
        
        /*String name;
        int age;
        double height, weight;
        int grade;
        String major;
        int i = 0;
        String q;

        while(true){
            System.out.println("사원의 정보를 입력하세요.\n");
            name = sc.next();
            age = sc.nextInt();
            height = sc.nextDouble();
            weight = sc.nextDouble();
            grade = sc.nextInt();
            major = sc.next();

            if(i > 10){
                break;
            }

            employees[i] = new Employee(name, age, height, weight, grade, major);
           
            i++;

            System.out.println("계속 추가하시겠습니까? (y/n)");
            q = sc.next();
            if(q.equals("n")){
                break;
            }
        }

       for(int j = 0; j < i; j++){
            System.out.println(employees[j].information());
       }*/
    
    }
}
