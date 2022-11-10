def solution(numbers, hand):
    answer = ''
    l = 10
    r = 12
    for i in numbers:
        if i == 0: i = 11
        countL = abs(int((l - i) / 3)) + abs(l - i) % 3
        countR = abs(int((r - i) / 3)) + abs(r - i) % 3
        if i % 3 == 1 or i % 3 == 2 and (countL < countR or countL == countR and hand == "left"):
            answer += 'L'
            l = i
        else:
            answer += 'R'
            r = i
    return answer
