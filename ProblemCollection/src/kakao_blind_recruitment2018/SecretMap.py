def solution(n, arr1, arr2):
    return ["".join("#" if i=="1" else " " for i in format(int(bin(a | b)[2:]), '0'+str(n))) for a, b in zip(arr1, arr2)]
    # return ["".join("#" if i == "1" else " " for i in (bin(a | b)[2:]).zfill(n)) for a, b in zip(arr1, arr2)]
    # return ["".join("#" if i == "1" else " " for i in (bin(a | b)[2:]).rjust(n, "0")) for a, b in zip(arr1, arr2)]

