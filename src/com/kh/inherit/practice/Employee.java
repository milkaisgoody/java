package com.kh.inherit.practice;

import ex06.annotation.Required;

public class Employee extends Person{
    @Required
    private int salary;
    private String dept;

    public Employee(){}

    public Employee(String name, int age, double height, double weight, int salary, String dept){
        //부모의 생성자 호출 - 맨위에 적어주어야 함
        super(age, height, weight);
        setName(name);
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String information(){
        return super.information() + " 급여: " + salary + " 부서: " + dept + "\n";
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    
}
