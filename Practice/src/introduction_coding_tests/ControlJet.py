import re

def solution(s):
    return sum([int(i) for i in re.sub("-?\d+ Z ?", "", s).split()])
