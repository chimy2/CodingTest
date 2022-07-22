def solution(box, n):
    a, b, c = box[0], box[1], box[2]
    return int(a / n) * int(b / n) * int(c / n)
