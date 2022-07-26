def solution(my_string):
    return "".join(my_string.translate(str.maketrans("aeiou","00000")).split("0"))
    # return "".join([i for i in my_string if not(i in "aeiou")])