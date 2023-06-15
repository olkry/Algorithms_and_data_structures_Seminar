import java.util.Date;


public class task003 {

      public static void shakeSort(int[] arrey) {
            for (int i = 0; i < arrey.length / 2; i++) {
                  for (int j = i; j < arrey.length - i -1; j++) {
                        if (arrey[j] > arrey[j + 1]) {
                              int temp = arrey[j];
                              arrey[j] = arrey[j + 1];
                              arrey[j + 1] = temp;
                        }

                  }
                  for (int j = arrey.length - i - 1; j > i; j--) {
                        if (arrey[j - 1] > arrey[j]) {
                              int temp = arrey[j - 1];
                              arrey[j - 1] = arrey[j];
                              arrey[j] = temp;
                        }
                  }
            }
      }
      
      final static int[] buf = new int[100000];

      public static void mergeSort(int[] arrey) {
            mergeSort(arrey, 0, arrey.length - 1);

      }

      private static void mergeSort(int[] arrey, int left, int right) {
            if (right == left) {
                  return;
            }
            int mid = (right + left) / 2;

            mergeSort(arrey, left, mid);
            mergeSort(arrey, mid + 1, right);

            int i = left, j = mid + 1, k = left;
            while (i <= mid && j <= right) {
                  if (arrey[i] < arrey[j]) {
                        buf[k] = arrey[i];
                        i++;
                  } else {
                        buf[k] = arrey[j];
                        j++;
                  }
                  k++;
            }

            while (i <= mid) {
                  buf[k] = arrey[i];
                  i++;
                  k++;
            }
            while (j <= right) {
                  buf[k] = arrey[j];
                  j++;
                  k++;
            }

            for (int q = left; q <= right; q++) {
                  arrey[q] = buf[q];
            }
      }

      /**
       * @param args
       */
      public static void main(String[] args) {
            int num = 100000;
            int[] arrey = new int[num];
            int[] arrey2 = new int[num];
            for (int i = 0; i < num; i++) {
                  arrey[i] = (int)(Math.random() * 100);
                  arrey2[i] = arrey[i];
            }
            
            Date start = new Date();
            shakeSort(arrey);
            Date end = new Date();
            long time1 = end.getTime() - start.getTime();



            start = new Date();
            mergeSort(arrey2);
            end = new Date();
            long time2 = end.getTime() - start.getTime();

            System.out.printf("time1=%d, time2=%d%n", time1, time2);
      }



}
