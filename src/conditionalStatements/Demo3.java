package conditionalStatements;

public class Demo3 {
    public static void main(String[] args) {
        /**
         *
         *            * * * * *
         *             * * * *
         *              * * *
         *               * *
         *                *
         */

        for (int i = 1; i <= 5; i ++) {

            for (int y = 0; y < i; y ++) {
                System.out.print(" ");
            }

            for (int z = i; z <= 5; z ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
