def solution(numlist, n):
    arr = [0] * len(numlist)
    numlist.sort()
    l = -1
    r = 0
    for i, v in enumerate(numlist):
        l = i - 1
        r = i
        if v > n:
            break
    for i in range(len(arr)):
        if l < 0 or r < len(arr) and 2 * n >= numlist[l] + numlist[r]:
            arr[i] = numlist[r]
            r += 1
        else:
            arr[i] = numlist[l]
            l -= 1
    return arr
    # return sorted(numlist,key = lambda x: [abs(x-n),-x])
