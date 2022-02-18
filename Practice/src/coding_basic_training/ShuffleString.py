def solution(str1, str2):
    answer = ''
    for i in range(0, len(str1)):
        answer += str1[i] + str2[i]
    # 리스트 컴프리헨션 버전
    # answer = ''.join([str1[i] + str2[i] for i in range(len(str1))])
    return answer

