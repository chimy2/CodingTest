def solution(lines):
    arr = [0] * 201;
    for x, y in lines:
        for i in range(x, y):
            arr[i] += 1
    return len(i for i in arr if i > 1)
