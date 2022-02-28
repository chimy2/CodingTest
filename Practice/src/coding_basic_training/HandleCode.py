def solution(code):
    mode = 0
    answer = ''
    for i in range(len(code)) :
        if code[i] == "1" : mode += 1
        elif (mode + i) % 2 == 0 : answer += code[i]
    return answer if answer else "EMPTY"
    # return "".join(code.split("1"))[::2] or "EMPTY"