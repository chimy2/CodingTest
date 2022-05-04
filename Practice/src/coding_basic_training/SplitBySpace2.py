import re

def solution(my_string):
    return re.split(" +", my_string.strip())
    # return my_string.split()