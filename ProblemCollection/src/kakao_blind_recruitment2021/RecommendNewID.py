import re

def solution(new_id):
    answer = re.sub("[^\w\-.]", "", new_id.lower())
    answer = re.sub("\.{2,}", ".", answer)
    answer = re.sub("^\.|\.$", "", answer)
    if not len(answer):
        answer = "aaa"
    elif len(answer) < 3:
        answer += answer[-1] * (3 - len(answer))
    elif len(answer) > 15:
        answer = answer[0:14 if answer[14] == '.' else 15]
    return answer
