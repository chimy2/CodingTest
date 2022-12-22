def solution(cards1, cards2, goal):
    i, j = 0, 0
    for k in goal:
        if i < len(cards1) and cards1[i] == k:
            i += 1
        elif j < len(cards2) and cards2[j] == k:
            j += 1
        else:
            return 'No'
    return 'Yes'
