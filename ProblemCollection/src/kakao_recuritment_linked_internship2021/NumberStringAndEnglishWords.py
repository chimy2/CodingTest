def solution(s):
    words = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    for i, v in enumerate(words):
        s = s.replace(v, str(i))
    return int(s)
