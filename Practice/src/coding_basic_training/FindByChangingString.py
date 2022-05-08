def solution(myString, pat):
    return int(pat.replace("A", "a").replace("B", "A").replace("a", "B") in myString)
