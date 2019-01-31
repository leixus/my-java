package fun;

public class FunDemo2 {
    public static void main(String[] args) {
//        System.out.print("*");
        myPrint();
    }

    /**
     *
     * 定义函数的格式
     *
     * 修饰符 返回值类型 函数名(参数类型: 形式参数1, 参数类型: 形式参数2,...... ) {
     *      执行语句;
     *      return 返回值;
     * }
     *
     *
     * */

    public static void myPrint() {
        System.out.print("Hello World!");
        // 返回值类型是void, return可以不写
        return ;
    }
}
