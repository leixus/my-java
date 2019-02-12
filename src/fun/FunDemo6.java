package fun;

public class FunDemo6 {
    public static void main(String[] args) {
        /**
         * 函数的重载
         *
         * 1.同一个函数
         * 2.函数名相同
         * 3.参数个数不同, 参数类型不同
         *
         * 函数的重载和返回值无关
         * java是严谨的语言，如果出现函数的调用的不确定性，会编译失败
         *
         * */

        System.out.print("函数的重载");

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
