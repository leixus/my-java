package arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        /**
         *
         * 数组第二步
         *
         * 内存在划分
         *
         * 1.寄存器
         * 2.本地方法区
         * 3.方法去
         * 4.栈内存
         *      存储的都是局部变量
         *      而且变量所属的作用域一旦结束，该变量就自动释放
         *
         * 5.堆内存
         *      存储是数组和对象（其实数组就是对象） 凡是new建立在堆中
         *    特点：
         *          每一个实体都有首地址值
         *          堆内存中的每一个变量都有默认初始化值，根据类型的不同而不同，整数是0，小数是0.0，或者0.0f，boolean是false，char是'\u0000'
         *          垃圾回收机制
         *
         *
         * 引用类型
         *
         */

        int age = 3;

        /**
         *
         * 局部代码块
         *
         * 限定局部变量的生命周期
         *
         * */
        {
            // char name = "lei";
            int dose = 8;
        }

        System.out.print("数组2");
    }
}
