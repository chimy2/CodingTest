def solution(price):
    n = 10 ** 5
    if price >= n * 5:
        return int(price * 0.8)
    elif price >= n * 3:
        return int(price * 0.9)
    elif price >= n:
        return int(price * 0.95)
    return price
