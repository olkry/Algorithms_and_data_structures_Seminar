public class Task001 {

    public static int sum(int num) { // O(1)+O(N)*O(1)+O(1) = O(1+N+1) = O(N)
        int res = 0; // O(1)
        for (int i = 1; i <= num; i++) { // O(N)
            res += i; // O(1)
        }
        return res; // O(1)
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
