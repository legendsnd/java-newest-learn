package reflect;

import reflect.entity.Person;

public class testSuperClass {
    public static void main(String[] args) {
        Class c = Person.class;
        Class cs = c.getSuperclass();
        Class css = cs.getSuperclass();
        System.out.println(c);
        System.out.println(cs);
        System.out.println(css);

    }
}
