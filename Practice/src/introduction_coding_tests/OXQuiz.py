def solution(quiz):
    answer = []
    for q in quiz:
        x, oper, y, _, z = q.split(" ")
        temp = int(x) + int(y) * (1 if oper == "+" else -1)
        if temp == int(z):
            answer.append("O")
        else:
            answer.append("X")
    return answer
