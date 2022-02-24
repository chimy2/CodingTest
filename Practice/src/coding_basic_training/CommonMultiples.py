def solution(number, n, m):
    return 0 if number % n != 0 else 1 if number % m == 0 else 0
    # return 1 if number % n == 0 and number % m == 0 else 0
    # return int(bool(number % n == 0) & bool(number % m == 0))
    # return int(number % n == 0 and number % m == 0)