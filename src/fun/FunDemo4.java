package fun;

public class FunDemo4 {
    public static void main(String[] args) {
        /*
        * 约会我最甜
        * 批发式的想你
        * 群发式的想你
        *
        * 根据考试成绩获取学生对应的等级
        * */

        char level = getLevel(95);

        System.out.print(level);

    }

    public static char getLevel(int num) {
        char level;

        if (num > 90 && num < 100)
            level = 'A';
        else
            level = 'B';

        return level;
    }
}
