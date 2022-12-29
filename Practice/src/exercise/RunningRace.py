def solution(players, callings):
    rank = dict(zip(players, range(len(players))))
    for c in callings:
        i = rank[c]
        rank[c] -= 1
        rank[players[i - 1]] += 1
        players[i] = players[i - 1]
        players[i - 1] = c
    return players
