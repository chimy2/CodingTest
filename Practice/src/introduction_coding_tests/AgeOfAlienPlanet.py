def solution(age):
    answer = ''
    s = "abcdefghij"
    while age > 0:
        answer = s[age % 10] + age
        age = age // 10
        print(age)
    return answer
