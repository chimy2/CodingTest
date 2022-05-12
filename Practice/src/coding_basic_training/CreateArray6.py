def solution(arr):
    answer = []
    for i, v in enumerate(arr):
        if not answer or v != answer[-1]:
            answer.append(v)
        else:
            answer.pop()
    return answer if answer else [-1]
