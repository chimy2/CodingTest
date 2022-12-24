function solution(keymap, targets) {
    const answer = [];
    const tap = [];
    for (let i = 0; i < 26; i++) {
        let c = String.fromCharCode(i + 65);
        let index = 101;
        for (let k of keymap) {
            let temp = k.indexOf(c);
            if (temp > -1) {
                index = Math.min(index, temp);
            }
        }
        tap[c] = index > 100 ? -1 : index + 1;
    }
    for (let i = 0; i < targets.length; i++) {
        let sum = 0;
        for (let t of targets[i].split('')) {
            let index = tap[t];
            if (index < 1) {
                sum = -1;
                break;
            }
            sum += index;
        }
        answer.push(sum);
    }
    return answer;
    // const answer = [];
    // const map = {};
    // for (const items of keymap) {
    //     items
    //         .split('')
    //         .map(
    //             (item, index) =>
    //                 (map[item] = map[item] < index + 1 ? map[item] : index + 1)
    //         );
    // }
    // for (const items of targets) {
    //     answer.push(
    //         items.split('').reduce((cur, item) => (cur += map[item]), 0) || -1
    //     );
    // }
    // return answer;
}
