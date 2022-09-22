import datetime

def solution(a, b):
    return datetime.date(2016, a, b).strftime("%A").upper()[:3]
