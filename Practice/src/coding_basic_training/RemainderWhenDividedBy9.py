def solution(number):
    return sum(int(i) for i in number) % 9
    # return sum(map(int, number)) % 9
