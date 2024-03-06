package reflect.entity;

import reflect.entity.inter;

public class Person extends Object implements inter {
    private int age;
    private String name;
    public Person() {
        this.age = 18;
        this.name = "zhangsan";
    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Person(int age){
        this.age = age;
        this.name = "zhangsan";
    }
    public void show() {
        System.out.println("name: " + name + ", age: " + age);
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private void privateMethod() {
        System.out.println("private method");
    }

    public void printNum(int value) {
        System.out.println("value is " + value);
    }
}
