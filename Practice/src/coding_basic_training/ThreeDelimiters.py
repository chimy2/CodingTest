def solution(myStr):
    answer = []
    l = 0
    r = 0
    while r <= len(myStr):
        if r == len(myStr):
            if l < r:
                answer.append((myStr[l:r]))
            break;
        if myStr[r] == 'a' or myStr[r] == 'b' or myStr[r] == 'c':
            if l < r:
                answer.append(myStr[l:r])
            l = r + 1
        r += 1
    return answer if answer else ["EMPTY"]
    # answer = myStr.replace("a", " ").replace("b", " ").replace("c", " ").split()
    # return answer if answer else ["EMPTY"]
