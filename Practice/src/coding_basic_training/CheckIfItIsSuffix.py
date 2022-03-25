def solution(my_string, is_suffix):
    return 1 if my_string.endswith(is_suffix) else 0
    # return int(my_string[-len(is_suffix):] == is_suffix)
