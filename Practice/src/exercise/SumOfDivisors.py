import math

def solution(n):
    answer = sum(i + n // i for i in range(1, int(math.sqrt(n)) + 1) if n % i == 0)
    return answer - (math.sqrt(n) if math.sqrt(n) == int(math.sqrt(n)) else 0)
    # sqrt = n ** 0.5
    # answer = sum(i + n // i for i in range(1, int(sqrt) + 1) if n % i == 0)
    # return answer - (sqrt if sqrt == int(sqrt) else 0)
