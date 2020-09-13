class Solution:
    def twoSum(self, nums, target):
        dict = {}

        for i in range(len(nums)):
            if target - nums[i] not in dict:
                dict[nums[i]] = i
            else:
                return [dict[target - nums[i]], i]

sol=Solution()
print(sol.twoSum([1,2,6],8))