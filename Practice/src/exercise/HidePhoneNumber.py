# import re

def solution(phone_number):
    return "*" * (len(phone_number) - 4) + phone_number[-4:]
    # p = re.compile(r'\d(?=\d{4})')
    # return p.sub("*", s, count=0)
