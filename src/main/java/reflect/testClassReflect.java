package reflect;

import reflect.entity.Person;
import reflect.entity.inter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class testClassReflect {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class cls = Person.class;
        System.out.println("name of class Person is " + cls.getName());
        System.out.println("simple name of class Person is " + cls.getSimpleName());
        System.out.println("super class of Person is " + cls.getSuperclass());
        Method[] methods = cls.getMethods();

        System.out.println("------------------------\nmethods of class Person are: ");
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("------------------------\ncons of class Person are: ");


        Constructor[] constructors = cls.getConstructors();

        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("------------------------\ninterfaces of class Person are: ");


        Class[] interfaces = cls.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        // 如果通过接口获取类对象，那么只能使用接口中的方法；通过反射获取类对象，可以使用类中的所有方法
        inter p = new Person();
        p.printNum(100);
        Class pCls = p.getClass();
        System.out.println(pCls);
        Method methodGetName = pCls.getDeclaredMethod("getName", null);
        System.out.println(methodGetName.invoke(p, null));


    }
}
