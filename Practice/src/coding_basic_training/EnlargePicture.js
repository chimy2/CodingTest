function solution(picture, k) {
    var answer = [];
    picture.map((v) => v.map((v) => v.repeat(k)));
    for (let i of picture) {
        let s = '';
        for (let j of i) {
            s += j.repeat(k);
        }
        for (let j = 0; j < k; j++) {
            answer.push(s);
        }
    }
    // picture.forEach((line) => {
    //     const expanded = [...line].reduce(
    //         (acc, cur) => acc + cur.repeat(k),
    //         ''
    //     );

    //     for (let i = 0; i < k; i++) answer.push(expanded);
    // });
    return answer;
}
