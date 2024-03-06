package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.function.Consumer;

public class dynamicProxy {
    public static void main(String[] args) {
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("hello")){
                    System.out.println("hello method is called");
                }
                else if (method.getName().equals("bye")){
                    System.out.println("bye method is called");
                }
                else if (method.getName().equals("hahah")){
                    System.out.println("hahah method is called");
                }

                return null;
            }
        };
        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(),
                new Class[]{Hello.class},
                invocationHandler
        );
        hello.hello();

        hello.bye();

        hello.hahah();


    }
}
interface Hello{
    void hello();
    void bye();
    void hahah();
}
