# from collections import Counter
import re

def solution(s):
    return len(re.findall("p", s, re.I)) == len(re.findall("y", s, re.I))
    # return Counter(s.lower())["p"] == Counter(s.lower())["y"]
