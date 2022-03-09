def solution(arr, queries):
    answer=[]
    for s, e, k in queries:
        result=[arr[i] for i in range(s, e+1) if arr[i]>k]
        answer.append(min(result) if result else -1)
    return answer
