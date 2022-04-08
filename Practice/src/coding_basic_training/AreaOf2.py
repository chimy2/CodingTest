def solution(arr):
    answer = []
    checked = False
    for i in arr:
        if i == 2: checked = True
        if checked: answer.append(i)
    while len(answer) > 0 and answer[-1] != 2:
        answer.pop()
    return answer if checked else [-1]
    # if 2 not in arr:
    #     return [-1]
    # return arr[arr.index(2) : len(arr) - arr[::-1].index(2)]
