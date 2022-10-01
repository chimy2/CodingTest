def solution(n):
    answer = 0
    arr = [True] * (n + 1)
    for i in range(2, n + 1):
        if arr[i]:
            answer += 1
            for j in range(i * i, n + 1, i):
                arr[j] = False
    return answer

    # num=set(range(2,n+1))
    # for i in range(2,n+1):
    #     if i in num:
    #         num-=set(range(2*i,n+1,i))
    # return len(num)
