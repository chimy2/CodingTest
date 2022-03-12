def solution(l, r):
    answer = []
    for i in range(1, 64):
        a = int(bin(i)[2:]) * 5
        if r < a: break
        if l <= a: answer.append(a)
    return answer if answer else [-1]
