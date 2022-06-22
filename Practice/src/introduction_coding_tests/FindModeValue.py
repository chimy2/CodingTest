def solution(array):
    answer = 0
    arr = dict()
    max = 0
    for i in array:
        count = arr.get(i, 0) + 1
        arr[i] = count
        if count > max:
            max = count
            answer = i
        elif count == max:
            answer = -1
        print(arr)
    return answer
