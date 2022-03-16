def solution(a, b, c, d):
    answer = 0
    arr = [a, b, c, d]
    arr.sort()
    a, b, c, d = arr
    if a == d:
        answer = 1111 * a
    elif a == c:
        answer = (10 * a + d) ** 2
    elif b == d:
        answer = (10 * d + a) ** 2
    elif a == b and c == d:
        answer = (a + c) * abs(a - c)
    elif a == b:
        answer = c * d
    elif b == c:
        answer = a * d
    elif c == d:
        answer = a * b
    else:
        answer = min(a, b, c, d)
    return answer
