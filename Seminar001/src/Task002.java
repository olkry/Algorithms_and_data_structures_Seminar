public class Task002 {
    
    public static void simpleNums(int num) { // O(N * sqrt(N))
        for (int i = 2; i <= num; i++) { // O(N)
            boolean simple = true; // O(1)
            for (int j = 2; j * j <= i; j++) { //O(sqrt(N)) // Грубо говоря мы ищем из корня
                if (i % j == 0) {  // O(1)
                    simple = false;  // O(1)                  
                    break;  // O(1)
                }
            }
            if (simple) {  // O(1)
                System.out.printf("%d ", i);  // O(1)
            }
        }
    }

    public static void main(String[] args) {
        simpleNums(100);
    }
}
