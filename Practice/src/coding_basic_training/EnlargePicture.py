def solution(picture, k):
    answer = []
    for i in picture:
        s = "".join([j * k for j in i])
        for j in range(k):
            answer.append(s)
    return answer
