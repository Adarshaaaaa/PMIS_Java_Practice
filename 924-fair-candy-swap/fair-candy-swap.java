class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
       int aliceSum=0;
       int bobSum=0;
       for(int x: aliceSizes){aliceSum +=x;}
       Set<Integer> bobSet = new HashSet<>();
       for(int y: bobSizes) {
        bobSum +=y; 
       bobSet.add(y);}
       int diffbob=(aliceSum-bobSum)/2;
       for(int z:aliceSizes ){
        int traget= z-diffbob;
        if (bobSet.contains(traget)) {
                return new int[]{z, traget};
            }
       }
       return new int[2];
    } 

}