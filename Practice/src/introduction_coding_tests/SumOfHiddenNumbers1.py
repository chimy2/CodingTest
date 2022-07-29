def solution(my_string):
    return sum(int(i) for i in my_string if i in "0123456789")
    # return sum(int(i) for i in my_string if i.isdigit())