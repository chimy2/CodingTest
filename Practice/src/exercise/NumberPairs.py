import collections

def solution(X, Y):
    answer = ""
    count = collections.Counter(X) & collections.Counter(Y)
    if len(count) == 0: return "-1"
    for i in range(9, -1, -1):
        answer += str(i) * (count.get(str(i)) or 0)
    return "0" if answer[0] == "0" else answer
    # Counter를 이용하는 것보다 count로 바로 가져오는게 더빠르다
    # for i in range(9,-1,-1) :
    #     answer += (str(i) * min(X.count(str(i)), Y.count(str(i))))
    #
    # if answer == '' :
    #     return '-1'
    # elif len(answer) == answer.count('0'):
    #     return '0'
    # else :
    #     return answer