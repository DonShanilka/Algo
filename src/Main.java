import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] ar = {0, 5, 1, 3, 8, 2, 6, 9, 4, 7};

        for (int j = 0; j < ar.length; j++) {   // for loop dheka thiyenawanam eliye ekata kiyanawa outerloop eka
            for (int i = 0; i < ar.length - 1; i++) {   // mekata kiyanawa inner loop eka // athule thiyena nisa
                if (ar[i] > ar[i + 1]) {
                    int temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));

/*=====================================================================================================================================================================================*/

        for (int j = 0; j < ar.length; j++) {
            int count = 0;
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    int temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                    count++;
                }
            }
            if (count == 0){
                break; // Meken wenne sort wenna tiyena Count eka 0 nam meka break wenawa
            }
        }


    }
}