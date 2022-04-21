def solution(num_list):
    return sum([len(bin(i)[2:]) - 1 for i in num_list])
