import re

def solution(spell, dic):
    reg = "".join(sorted(spell))
    for i in dic:
        s = "".join(sorted(re.findall(r'[' + reg + ']', i)))
        if len(spell) == len(reg) and reg == s:
            return 1
    return 2
