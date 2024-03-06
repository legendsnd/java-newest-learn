package classLearn;

import classLearn.entity.outerClass;

public class InnerStaticClassTest {

    public static void main(String[] args) {
        outerClass.innerClass in = new outerClass.innerClass();
        in.show();

        outerClass.innerNonStaticClass innerNon = new outerClass().new innerNonStaticClass(100);
        innerNon.show();

    }
}
