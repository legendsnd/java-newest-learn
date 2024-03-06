package classLearn.entity;

public class outerClass {
    public static class innerClass {
        public void show() {
            System.out.println("inner class");
        }
    }
    public class innerNonStaticClass {
        private int value;
        public innerNonStaticClass() {
            value = 100;
            System.out.println("inner non-static class constructor");
        }
        public innerNonStaticClass(int value) {
            this.value = value;
            System.out.println("construct value of " + value);
        }

        public void show() {
            System.out.println("inner non-static class");
        }
    }
}
