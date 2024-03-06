package classLearn;

public class testExtends {
    public static void main(String[] args) {
        Teacher.greet("zhangsan");
        Teacher.greet();
    }
}
class Person{
    public static void greet(){
        System.out.println("hello");
    }
}
class Teacher extends  Person{
    public static void greet(String name){
        System.out.println("hello teacher" + name);
    }
}
