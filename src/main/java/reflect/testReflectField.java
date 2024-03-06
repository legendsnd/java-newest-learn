package reflect;

import reflect.entity.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class testReflectField {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException {

        Person p = new Person();
        p.setName("zhl1");
        // 获取Class对象的两种方式
        Class clsP1 = Person.class;
        Class clsP2 = p.getClass();

        // 从class对象获取字段属性, 可以得到字段名称，字段类型，字段可访问性
        Field nameField = clsP1.getDeclaredField("name");
        System.out.println("nameField: " + nameField);
        System.out.println("nameField getName: " + nameField.getName());
        System.out.println("nameField getType: " + nameField.getType());
        System.out.println("nameField getModifiers: " + nameField.getModifiers());
        int modifier = nameField.getModifiers();
        System.out.println("name field is private field? " + Modifier.isPrivate(modifier));

        // 从字段属性，反射获得字段值, 或者设置字段值
        nameField.setAccessible(true);
        System.out.println("namefield value of p object: " + nameField.get(p));

        nameField.set(p, "zhlsetByReflect");
        System.out.println("namefield value of p object after set: " + nameField.get(p));



    }
}

