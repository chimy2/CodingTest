def solution(sizes):
    w = 0
    h = 0
    for x, y in sizes:
        w = max(w, min(x, y))
        h = max(h, x, y)
    return w * h
    # return max(max(x) for x in sizes) * max(min(x) for x in sizes)
