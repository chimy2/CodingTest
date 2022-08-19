def solution(i, j, k):
    return len("".join(str(num) for num in range(i, j + 1)).split(str(k))) - 1
    # return sum([str(i).count(str(k)) for i in range(i, j + 1)])
