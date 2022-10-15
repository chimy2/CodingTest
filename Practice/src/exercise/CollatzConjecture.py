def solution(num, count=0):
    if num == 1:
        return count
    elif count > 500:
        return -1
    else:
        return solution(num * 3 + 1 if num % 2 else num / 2, count + 1)
    # for i in range(500):
    #     if num == 1:
    #         return i
    #     num = num * 3 + 1 if num % 2 else num / 2
    # return -1
