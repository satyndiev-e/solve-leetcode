public class p605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // {1, 0, 0, 0, 1} n = 1
        // {0, 1, 0, 1, 0, 0, 0, 1} n = 1

        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                boolean left = i == 0 || (flowerbed[i - 1] == 0);
                boolean right = i == (flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if(left && right) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n < 1;
    }
}
