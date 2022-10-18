def solution(arr1, arr2):
    for i in range(len(arr1)):
        for j in range(len(arr1[0])):
            arr1[i][j] += arr2[i][j]
    return arr1
    # return [list(map(sum, zip(*x))) for x in zip(arr1, arr2)]
    # 언패킹을 하지 않은 버전
    # return [list(map(sum, zip(a, b))) for a, b in zip(arr1, arr2)]
    # packing : 여러 객체를 하나로 합쳐줌
    # unpacking : 여러 객체를 포함하고 있는 하나의 객체를 풀어줌
    # 키워드 인자에 의한 패킹은 **로 표현하고 dict으로 관리한다      
