def solution(rank, attendance):
    answer = 0
    num = 1
    for i in range(3):
        while True:
            j = rank.index(num)
            num += 1
            if attendance[j]:
                answer += (10 ** (4 - 2 * i)) * j
                break
    return answer
    # arr = sorted([(x, i) for i, x in enumerate(rank) if attendance[i]])
    # return arr[0][1] * 10000 + arr[1][1] * 100 + arr[2][1]
