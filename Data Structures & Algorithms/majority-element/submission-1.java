class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int n= nums.length;
        for(int i=0; i<n; i++){
                count.put(nums[i], count.getOrDefault(nums[i],0) +1);     
                if(count.get(nums[i])>n/2) return nums[i];
            }
                    return 0;

        }
    }
