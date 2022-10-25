function solution(participant, completion) {
    const map = new Map();
    for (let i of participant) {
        map.set(i, map.has(i) ? map.get(i) + 1 : 1);
    }
    for (let i of completion) {
        map.set(i, map.get(i) - 1);
    }
    // for (let i = 0; i < participant.length; i++) {
    //     let a = participant[i],
    //         b = completion[i];
    //     map.set(a, (map.get(a) || 0) + 1);
    //     map.set(b, (map.get(b) || 0) - 1);
    // }
    for (let [k, v] of map) {
        if (v) return k;
    }
    // participant.sort();
    // completion.sort();
    // for (var i = 0; i < participant.length; i++) {
    //     if (participant[i] != completion[i]) {
    //         return participant[i];
    //     }
    // }
}
// var solution = (participant, completion) =>
//     participant.find(
//         (participant) => !completion[participant]--,
//         completion.map(
//             (participant) =>
//                 (completion[participant] = (completion[participant] | 0) + 1)
//         )
//     );
