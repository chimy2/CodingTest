def solution(myString):
    answer = myString.replace("x", " ").split()
    answer.sort()
    return answer
    # return sorted(myString.replace("x", " ").split())
    # return sorted(ch for ch in myString.split('x') if ch)