package arrays;

public class GetSort {
    public static void main(String[] args) {

        /**
         *
         * 排序
         *      一个一个的比，大的不动，小的下去
         *
         * */

//        int[] arr = {78,45,4111,5,2,5,663,55,66};

        int[] arr = {-78,-45,-4111,-5,-2,-5,-663,-55,-66};

        int max = getMax(arr);

        System.out.println(max);


    }

//    public static int getMax(int[] arr) {
//
//        int max = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max)
//                max = arr[i];
//        }
//
//        return max;
//
//    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
