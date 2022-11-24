def solution(id_list, report, k):
    report = [i.split() for i in set(report)]
    reported = dict()
    for x, y in report:
        if not reported.get(y):
            reported[y] = set()
        reported[y].add(x)
    for x, y in reported.copy().items():
        if len(y) < k:
            del reported[x]
    return [sum(1 for i in reported.values() if id in i) for id in id_list]
    # answer = []
    # a = list(set(report))
    # dictionary2 = {name : 0 for name in id_list}
    # dictionary = {name : [] for name in id_list}
    # for i in a:
    #     dictionary[i.split()[1]].append(i.split()[0])
    #
    # for i in dictionary:
    #     if len(dictionary[i]) >= k:
    #         for j in dictionary[i]:
    #             dictionary2[j] += 1
    #
    # for i in dictionary2:
    #     answer.append(dictionary2[i])
    #
    # return answer
