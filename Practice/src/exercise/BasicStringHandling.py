import re

def solution(s):
    return bool(re.match("^\d{4}$|^\d{6}$", s))
    # return bool(re.match("^(\d{4}|\d{6})$", s))
    # return s.isdigit() and len(s) in [4,6]
