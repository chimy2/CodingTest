def solution(arr, idx):
    answer = -1
    for i, v in enumerate(arr[idx:]):
        if v:
            answer = i + idx
            break;
    return answer
