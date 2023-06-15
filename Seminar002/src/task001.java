public class task001 {

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

      public static void main(String[] args) {
            int num = 10;
            int[] arrey = new int[num];
            for (int i = 0; i < num; i++) {
                  arrey[i] = (int)(Math.random() * 100);
            }

            shakeSort(arrey);
            for (int i = 0; i < num; i++) {
                  System.out.println(arrey[i]);
            }
            
      }
}
