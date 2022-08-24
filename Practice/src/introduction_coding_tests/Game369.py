import re

def solution(order):
    return len(re.sub("[^369]", "", str(order)))
    # return sum(str(order).count(i) for i in ["3", "6", "9"])
