# import collections

def solution(participant, completion):
    d = dict()
    for i in range(len(participant)):
        d[participant[i]] = d.get(participant[i], 0) + 1
        if (i < len(completion)):
            d[completion[i]] = d.get(completion[i], 0) - 1
    for k, v in d.items():
        if v == 1: return k
    # return  list((collections.Counter(participant) - collections.Counter(completion)))[0]