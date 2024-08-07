class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int pSum = 0;
        int res = 0;

        for(int a : nums){
            pSum += a;

            int rem = pSum % k;

            if(rem < 0) rem += k;

            if(map.containsKey(rem)) res += map.get(rem);

            map.put(rem, map.getOrDefault(rem, 0)+1);
        } 
        return res;
    }
}
