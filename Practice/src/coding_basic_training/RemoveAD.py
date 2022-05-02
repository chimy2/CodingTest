def solution(strArr):
    return list(filter(lambda v: v.find("ad") < 0, strArr))
