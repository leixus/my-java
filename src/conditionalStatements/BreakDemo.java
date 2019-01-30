package conditionalStatements;

public class BreakDemo {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i ++) {
//
//            for (int j = 0; j < 5; j ++) {
//                System.out.println("x= " + i);
//                break;
//            }
//        }

        wc1:for (int i = 0; i < 5; i ++) {

            wc2:for (int j = 0; j < 5; j ++) {
                System.out.println("x= " + i);
                break wc1;
            }
        }
    }
}
