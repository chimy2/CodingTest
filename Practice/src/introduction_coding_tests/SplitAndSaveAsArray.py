def solution(my_str, n):
    return [my_str[i * n:(i + 1) * n] for i in range(int((len(my_str) + n - 1) / n))]
    # return [my_str[i: i + n] for i in range(0, len(my_str), n)]
