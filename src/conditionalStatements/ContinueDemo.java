package conditionalStatements;

public class ContinueDemo {
    public static void main(String[] args) {
//        System.out.println("*");

        for (int i = 0; i < 5; i ++) {
            if (i == 3) {
                continue;
            }
            System.out.println("*X = " + i);
        }
    }
}
