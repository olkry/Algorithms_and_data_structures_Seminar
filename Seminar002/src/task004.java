public class task004 {
      
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

      public static Integer binarySearch(int[] arrey, int value) {
            int left = 0, right = arrey.length-1;
            while (right-left>1) {
                  int mid = (left+right)/2;
                  if (arrey[mid]>value) {
                        right = mid;
                  } else {
                        left=mid;
                        
                  }
            }
            if (arrey[left]==value) {
                  return left;
            }
            if (arrey[right] ==value) {
                  return right;
            }
            return null;

      }

      public static void main(String[] args) {
            int num = 10000;
            int[] arrey = new int[num];
            int[] arrey2 = new int[num];
            for (int i = 0; i < num; i++) {
                  arrey[i] = (int)(Math.random() * 1000000);
                  arrey2[i] = arrey[i];
            }
            
            
            mergeSort(arrey2);
            System.out.println(arrey[255]);
            System.out.println(binarySearch(arrey2, arrey[255]));
           
      }
}
