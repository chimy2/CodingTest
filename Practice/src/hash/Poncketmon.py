def solution(nums):
    return min(len(set(nums)), int(len(nums) / 2))
    # return min(len(set(nums)), len(nums) / 2)
    # return min(len(set(nums)), len(nums) // 2)
