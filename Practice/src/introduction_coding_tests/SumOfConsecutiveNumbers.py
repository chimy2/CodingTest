def solution(num, total):
    return [i for i in range(int(total / num - (num - 1) / 2), int(total / num + num / 2 + 1))]
    # return [(total - (num * (num - 1) // 2)) // num + i for i in range(num)]
