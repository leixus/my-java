package fun;

public class FunDemo3 {

    public static void main(String[] args) {
        draw(5, 6);
    }

    public static void draw(int x, int y) {
        for (int i = 0; i < y; i ++) {
            for (int j = 0; j < x; j ++) {
//                // 空心长方形
//                if ( i == 0 ) {
//                    System.out.print("*");
//                }
//                else if (i == y-1) {
//                    System.out.print("*");
//                }
//                else if (j == 0 || j == x-1) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
