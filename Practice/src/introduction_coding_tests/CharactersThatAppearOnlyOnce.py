def solution(s):
    return "".join(sorted(i for i in s if s.index(i) == s.rindex(i)))
    # return "".join(sorted([ch for ch in set(s) if s.count(ch) == 1]))
