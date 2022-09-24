def solution(arr, divisor):
    answer = list(filter(lambda x: x % divisor == 0, arr))
    return sorted(answer) if len(answer) > 0 else [-1]
    # return sorted([n for n in arr if n%divisor == 0]) or [-1]