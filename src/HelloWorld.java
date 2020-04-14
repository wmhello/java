public class HelloWorld {
    public  static final boolean IS_SHOW = true;
    public static void main(String[] args) {
        double x = 4;
        double y = Math.sqrt(x);
        double z = Math.pow(2, 4);

        System.out.println(y);
        System.out.println("2的4次方是" + z);
    }

    public static void test() {
        System.out.println(IS_SHOW);
    }

}
