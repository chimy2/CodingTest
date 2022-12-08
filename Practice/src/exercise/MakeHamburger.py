def solution(ingredient):
    answer = 0
    j = 0
    for i in range(len(ingredient)):
        if j >= 3 and ingredient[i] == 1 and ingredient[j - 3] == 1 and ingredient[j - 2] == 2 and ingredient[
            j - 1] == 3:
            answer += 1
            j -= 3
        else:
            ingredient[j] = ingredient[i]
            j += 1
    return answer
