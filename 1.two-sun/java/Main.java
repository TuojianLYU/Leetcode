import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        int[] nums={5,7,9,11,13};
        int target = 12;
        int[] ans;
        ans=twoSum(nums, target);
        System.out.println(ans[0]+","+ans[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sub=target-nums[i];
            if(map.containsKey(sub)){
                return new int[]{i,map.get(sub)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    
}