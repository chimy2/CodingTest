def solution(myString, pat):
    answer = 0
    for i in range(len(myString) + 1):
        if myString[i:].startswith(pat): answer += 1;
    return answer
