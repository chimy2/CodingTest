# from itertools import combinations

def solution(number):
    answer = 0
    for i in range(len(number) - 2):
        for j in range(i + 1, len(number) - 1):
            for k in range(j + 1, len(number)):
                if number[i] + number[j] + number[k] == 0: answer += 1
    return answer
    # return sum(1 for c in list(combinations(number,3)) if not sum(c))
