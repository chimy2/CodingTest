import re

def solution(my_string):
    return sum(int(i) for i in re.sub("\D+", " ", my_string).split())
    # return sum([int(i) for i in re.findall(r'[0-9]+', my_string)])
    # return sum(map(int,re.findall(r"[0-9]+",my_string)))