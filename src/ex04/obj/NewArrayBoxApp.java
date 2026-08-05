package ex04.obj;

public class NewArrayBoxApp {
    public static void main(String[] args) {
        NewArrayBox<String> box = new NewArrayBox<>();
        box.add("str");
        
        NewArrayBox<Student> box1 = new NewArrayBox<>();
        
        //기본타입은 Object로 형변환이 불가능함 int는 담지못함
        NewArrayBox<Integer> box2 = new NewArrayBox<>();
    }
}
