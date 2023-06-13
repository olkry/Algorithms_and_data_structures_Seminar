public class Task003 {
    
    public static int cubs(int cubNumber, int cubSector) {
        return cubs(cubNumber, cubSector, 1);
    }

    public static int cubs(int cubNumber, int cubSector, int deepth) { // O(N^K) == O(cubSector^cubNumber)
        if (deepth == cubNumber + 1) {
            return 1;
        }
        int res = 0;
        for (int i = 0; i < cubSector; i++) {
            res += cubs(cubNumber, cubSector, deepth + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(cubs(4, 6));
    }


}
