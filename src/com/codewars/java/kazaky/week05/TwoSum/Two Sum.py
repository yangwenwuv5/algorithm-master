from typing import List
class solution(object):
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        for i in range(n):
            for j in range(i + 1, n):
                if nums[i] + nums[j] == target:
                    return [i, j]     
        return []

list = [1, 2, 3, 4, 5]
a = solution()
list_result = a.twoSum(list,5)
print(list_result)