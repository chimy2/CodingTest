import collections

def solution(lottos, win_nums):
    rank = [6, 6, 5, 4, 3, 2, 1]
    win = 6 - len(collections.Counter(win_nums) - collections.Counter(lottos))
    return [rank[win + lottos.count(0)], rank[win]]
