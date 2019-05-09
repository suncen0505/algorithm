class Solution {
    public int majorityElement(int[] nums) {
        int count=nums.length/2;
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(int i=0;i<map.keySet().toArray().length;i++){
            if(map.get(map.keySet().toArray()[i])>count){
                return (int) map.keySet().toArray()[i];
            }
        }
        return 0;
    }
}