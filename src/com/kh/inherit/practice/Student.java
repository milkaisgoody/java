package com.kh.inherit.practice;

public class Student extends Person{
    private int grade;
    private String major;

    public Student(){}

    public Student(String name, int age, double height, double weight, int grade, String major){
        super(age, height, weight);
        setName(name);
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String toString() {
        
        return super.toString() + """
                학년 : %d
                전공 : %s
                """.formatted(grade, major);
    }

    @Override
    public String information(){
        return super.information() + " 학년: " + grade + " 전공: " + major + "\n";
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    
}
