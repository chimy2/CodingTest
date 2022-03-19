def solution(my_string, queries):
    a = list(my_string)
    for x, y in queries:
        a[x:y + 1] = a[x:y + 1][::-1]
    return "".join(a)
