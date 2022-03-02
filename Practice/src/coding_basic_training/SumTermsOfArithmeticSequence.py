def solution(a, d, included):
    return sum([a + d * i for i in range(len(included)) if included[i]])
    # enumerate 함수 이용
    # for index, currentValue in enumerate(iterable object) 이렇게 사용 가능
    # return sum(a + i * d for i, f in enumerate(included) if f)