def solution(today, terms, privacies):
    answer = []
    term = dict(map(lambda a: a.split(), terms))
    day = [12 * 28, 28, 1]
    now = sum(day[i] * int(v) for i, v in enumerate(today.split(".")))
    for i, v in enumerate(privacies):
        date, type = v.split()
        if sum(day[i] * int(v) for i, v in enumerate(date.split("."))) + day[1] * int(term[type]) <= now:
            answer.append(i + 1)
    return answer
