public class task002 {

      final static int[] buf = new int[1000];

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

      public static void main(String[] args) {
            int num = 10;
            int[] arrey = new int[num];
            for (int i = 0; i < num; i++) {
                  arrey[i] = (int)(Math.random() * 100);
            }
            for (int i = 0; i < num; i++) {
                  System.out.printf("%d ", arrey[i]);
            }
            System.out.println();
            mergeSort(arrey);
            for (int i = 0; i < num; i++) {
                  System.out.printf("%d ", arrey[i]);
            }
      }
}
