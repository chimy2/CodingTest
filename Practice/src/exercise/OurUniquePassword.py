def solution(s, skip, index):
    c = [i for i in "abcdefghijklmnopqrstuvwxyz" if i not in skip]
    return "".join(c[(c.index(i) + index) % len(c)] for i in s)
