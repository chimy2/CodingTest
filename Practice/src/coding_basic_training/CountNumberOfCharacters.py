def solution(my_string):
    answer = [0] * 52
    for i in my_string:
        answer[ord(i) - 65 if ord(i) < 97 else ord(i) - 71] += 1
    return answer
