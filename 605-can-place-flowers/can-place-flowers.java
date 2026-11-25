class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        for (int i = 0; i < length; ++i) {
            int leftNeighbor = (i == 0) ? 0 : flowerbed[i - 1];

            int rightNeighbor = (i == length - 1) ? 0 : flowerbed[i + 1];
            if (leftNeighbor + flowerbed[i] + rightNeighbor == 0) {
                flowerbed[i] = 1;
                --n;
            }
        }
        return n <= 0;
    }
}
