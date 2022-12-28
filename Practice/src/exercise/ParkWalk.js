function solution(park, routes) {
    let lenI = park.length;
    let lenJ = park[0].length;
    for (let i = 0; i < park.length; i++) {
        let j = park[i].indexOf('S');
        if (j != -1) {
            for (let r of routes) {
                [direction, distance] = r.split(' ');
                distance = +distance;
                switch (direction) {
                    case 'E':
                        if (j + distance < lenJ) {
                            for (let k = 1; k <= distance; k++) {
                                if (park[i][j + k] == 'X') break;
                                if (k == distance) {
                                    j += distance;
                                }
                            }
                        }
                        break;
                    case 'W':
                        if (j >= distance) {
                            for (let k = 1; k <= distance; k++) {
                                if (park[i][j - k] == 'X') break;
                                if (k == distance) {
                                    j -= distance;
                                }
                            }
                        }
                        break;
                    case 'S':
                        if (i + distance < lenI) {
                            for (let k = 1; k <= distance; k++) {
                                if (park[i + k][j] == 'X') break;
                                if (k == distance) {
                                    i += distance;
                                }
                            }
                        }
                        break;
                    case 'N':
                        if (i >= distance) {
                            for (let k = 1; k <= distance; k++) {
                                if (park[i - k][j] == 'X') break;
                                if (k == distance) {
                                    i -= distance;
                                }
                            }
                        }
                }
            }
            return [i, j];
            break;
        }
    }
}
