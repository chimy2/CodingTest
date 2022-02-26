def solution(n):
    return n*(n+1)*(n+2)/6 if n % 2 == 0 else (int(n/2)+1)**2
    # return sum(x ** (2 - x % 2) for x in range(n + 1) if n % 2 == x % 2)