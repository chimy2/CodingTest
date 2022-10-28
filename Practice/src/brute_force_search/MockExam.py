def solution(answers):
    arr = [[1, 2, 3, 4, 5], [2, 1, 2, 3, 2, 4, 2, 5], [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]]
    score = [0, 0, 0]
    for i in range(3):
        for idx, v in enumerate(answers):
            if v == arr[i][idx % len(arr[i])]:
                score[i] += 1
    return [i for i in [1, 2, 3] if score[i - 1] == max(score)]
