import re

def solution(babbling):
    return sum(1 for s in babbling if bool(re.search("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$", s)))
    # answer = 0
    # for babb in babbling:
    #     for bab in ["aya", "ye", "woo", "ma"]:
    #         if bab * 2 not in babb:
    #             babb=babb.replace(bab,' ')
    #     if len(babb.strip()) == 0:
    #         answer+=1
    # return answer