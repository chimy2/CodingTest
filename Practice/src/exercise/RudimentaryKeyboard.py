def solution(keymap, targets):
    answer = []
    tap = {}
    for keys in keymap:
        for i, k in enumerate(keys):
            tap[k] = min(tap.get(k, 101), i + 1)
    for target in targets:
        sum = 0
        for t in target:
            n = tap.get(t, -1)
            if n == -1:
                sum = n
                break
            sum += n
        answer.append(sum)
    return answer
