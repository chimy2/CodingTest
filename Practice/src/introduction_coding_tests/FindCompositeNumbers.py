def solution(n):
    arr = [0] * (n + 1)
    for i in range(2, n):
        j = 2
        while i * j <= n:
            arr[i * j] = 1;
            j += 1
    return len([i for i in arr if i == 1])
    # output = 0
    # for i in range(4, n + 1):
    #     for j in range(2, int(i ** 0.5) + 1):
    #         if i % j == 0:
    #             output += 1
    #             break
    # return output

    # return len([i for i in range(2, n + 1) if not all(i % j for j in range(2, i))])

# def get_divisors(n):
#     return list(filter(lambda v: n % v ==0, range(1, n+1)))
#
# def solution(n):
#     return len(list(filter(lambda v: len(get_divisors(v)) >= 3, range(1, n+1))))