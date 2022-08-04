def solution(polynomial):
    answer = ''
    x = 0
    d = 0
    for s in polynomial.split(" + "):
        if s.endswith("x"):
            x += 1 if s[:-1] == "" else int(s[:-1])
        else:
            d += int(s)
    if x > 0 and d > 0:
        answer = (str(x) if x > 1 else "") + "x + " + str(d)
    elif x > 0:
        answer = (str(x) if x > 1 else "") + "x"
    else:
        answer = str(d)
    return answer
