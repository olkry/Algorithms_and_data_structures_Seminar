public class App {

    public static void piramidSort(int[] arrey) {
        for (int i = arrey.length / 2 - 1; i >= 0; i--)
            hiapFy(arrey, arrey.length, i);

        for (int i = arrey.length - 1; i >= 0; i--) {
            int temp = arrey[0];
            arrey[0] = arrey[i];
            arrey[i] = temp;

            hiapFy(arrey, i, 0);
        }

    }

    private static void hiapFy(int[] arrey, int heapSize, int rootIndex) {
        int largest = rootIndex; 
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && arrey[leftChild] > arrey[largest]) {
            largest = leftChild;
        }
        if (rightChild < heapSize && arrey[rightChild] > arrey[largest]) {
            largest = rightChild;
        }
        if (largest != rootIndex) {
            int temp = arrey[rootIndex];
            arrey[rootIndex] = arrey[largest];
            arrey[largest] = temp;

            hiapFy(arrey, heapSize, largest);
        }

    }

    public static void main(String[] args) {
        int num = 10;
        int[] arrey = new int[num];
        for (int i = 0; i < num; i++) {
            arrey[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < num; i++) {
            System.out.printf("%d ", arrey[i]);
        }
        System.out.println();
        piramidSort(arrey);
        for (int i = 0; i < num; i++) {
            System.out.printf("%d ", arrey[i]);
        }
    }

}
