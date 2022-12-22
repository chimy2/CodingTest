function solution(cards1, cards2, goal) {
    for (let i = 0, j = 0, k = 0; k < goal.length; k++) {
        if (cards1[i] == goal[k]) {
            i++;
        } else if (cards2[j] == goal[k]) {
            j++;
        } else {
            return 'No';
        }
    }
    return 'Yes';
    // for (const s of goal) {
    //     if (cards1[0] == s) {
    //         cards1.shift();
    //     } else if (cards2[0] == s) {
    //         cards2.shift();
    //     } else {
    //         return 'No';
    //     }
    // }
    // return 'Yes';
}
