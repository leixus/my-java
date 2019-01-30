package dataType;

public class Demo2 {
    public static void main(String[] args) {
        int b = 400;
        byte a = 3;
        // 强制转换byte
        // b = (byte)(a + b);

        // 强制转换int
        b = (int)(a + b);
        System.out.println(b);
    }
}
