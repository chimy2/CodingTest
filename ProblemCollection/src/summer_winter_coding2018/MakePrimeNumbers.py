def solution(nums):
    answer = 0
    for i in range(len(nums) - 2):
        for j in range(i + 1, len(nums) - 1):
            for k in range(j + 1, len(nums)):
                if isPrime(sum([nums[i], nums[j], nums[k]])): answer += 1
    return answer
    # import itertools
    # n_list = list(sum(i) for i in itertools.combinations(nums, 3))
    # n_doc = {}
    # for i in n_list:
    #     if i not in n_doc.keys():
    #         n_doc[i] = 1
    #     else:
    #         n_doc[i] += 1
    # n_set = set(n_doc.keys())
    # n_max = max(n_set)
    # for i in range(2, int(n_max**0.5 + 1)):
    #     n_set -= set(range(2*i, n_max+1, i))
    # answer = 0
    # for i in n_set:
    #     answer += n_doc[i]
    # return answer

def isPrime(a):
    for i in range(2, int(a ** 0.5) + 1):
        if not a % i: return False
    return True
