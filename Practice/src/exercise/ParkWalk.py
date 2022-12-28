def solution(park, routes):
    n, m = len(park), len(park[0])
    d = {'E': [0, 1], 'W': [0, -1], 'S': [1, 0], 'N': [-1, 0]}
    for i in range(len(park)):
        j = park[i].find('S')
        if j != -1:
            for r in routes:
                direction, distance = r.split()
                distance = int(distance)
                i2, j2 = i + d[direction][0] * distance, j + d[direction][1] * distance
                if i2 >= 0 and j2 >= 0 and i2 < n and j2 < m:
                    i, j = getCoord(park, i, j, i2, j2)
            return [i, j]

def getCoord(park, i, j, i2, j2):
    for x in range(min(i, i2), max(i, i2) + 1):
        for y in range(min(j, j2), max(j, j2) + 1):
            if park[x][y] == 'X':
                return [i, j]
    return [i2, j2]
