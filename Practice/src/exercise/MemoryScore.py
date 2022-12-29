def solution(name, yearning, photo):
    return [sum(yearning[name.index(v)] for v in p if v in name) for p in photo]
