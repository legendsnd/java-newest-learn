package reflect;

import reflect.entity.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testReflectMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class cls = Person.class;


        // 反射获取方法，非构造方法
        Method m = cls.getMethod("show");
        m.invoke(new Person(), null);

        Method staticm = Integer.class.getMethod("parseInt", String.class);
        System.out.println(staticm.invoke(null, "123"));

        Method privateM = cls.getDeclaredMethod("privateMethod");
        privateM.setAccessible(true);
        System.out.println(privateM.invoke(new Person(), null));

        Method[] allMethods = cls.getMethods();
        System.out.println("the method at 0 is:　" + allMethods[0]);
        System.out.println("use method at 0 and invoke: " + allMethods[0].invoke(new Person(), null));



        // 构造方法
        Constructor cons = cls.getConstructor(int.class, String.class);
        Person p = (Person) cons.newInstance(1000, "ppppp");
        System.out.println(p.getAge() + " " + p.getName());

        Constructor cons2 = cls.getConstructor(int.class);
        Person p2 = (Person) cons2.newInstance(10086);
        System.out.println(p2.getAge() + " " + p2.getName());



    }
}
