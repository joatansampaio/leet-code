

class Solution:
    def twoSum(nums, target):
        for i in range(0, len(nums)):
            for j in range(i+1, len(nums)):
                if(nums[i] + nums[j] == target):
                    return [i, j]
    
    def twoSumAlternative(nums, target):
        seen = {}
        for i in range(0, len(nums)):
            diff = target - nums[i]
            if(diff in seen):
                return [seen[diff], i]
            seen[nums[i]] = i

    
    print(twoSum([2,7,11,15], 9))
    print(twoSum([3,2,4], 6))

    print(twoSumAlternative([2,7,11,15], 9))
    print(twoSumAlternative([3,2,4], 6))