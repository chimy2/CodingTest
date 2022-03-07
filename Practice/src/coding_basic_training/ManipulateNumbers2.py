def solution(numLog):
    a = dict(zip([1, -1, -10, 10], ['w', 's', 'a', 'd']))
    return "".join([a.get(numLog[i] - numLog[i - 1]) for i in range(1, len(numLog))])
