def solution(my_string, s, e):
    arr = list(my_string)
    for i in range(s, s + int((e - s) / 2) + 1):
        temp = arr[i]
        arr[i] = arr[e - i + s]
        arr[e - i + s] = temp
        print(i, e - i + s, s, e)
    return "".join(arr)
