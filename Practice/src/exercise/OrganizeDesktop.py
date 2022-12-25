def solution(wallpaper):
    answer = [51, 51, 0, 0]
    for i, v in enumerate(wallpaper):
        l = v.find('#')
        r = v.rfind('#') + 1
        answer[1] = min(answer[1], l if l > -1 else 51)
        answer[3] = min(answer[3], r)
        if l + r > -1:
            answer[0] = min(answer[0], i)
            answer[2] = max(answer[2], i + 1)
    return answer
