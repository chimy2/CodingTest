def solution(s):
    answer = ""
    for arr in s.split():
        for i, v in enumerate(arr):
            if i % 2 == 0:
                answer += v.upper()
            else:
                answer += v.lower()
        answer += " "
    return answer[:-1]
    # return " ".join(map(lambda x: "".join([a.lower() if i % 2 else a.upper() for i, a in enumerate(x)]), s.split(" ")))
