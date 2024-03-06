package learnUnamedInnerClass;

public class UnamedClass {
    public static void main(String[] args) {
        DemoInter demo = new DemoInter() {
            @Override
            public void printNum(int value) {
                System.out.println("unamed class");
                System.out.println(value);
            }
        };
        demo.printNum(100);

    }
}
