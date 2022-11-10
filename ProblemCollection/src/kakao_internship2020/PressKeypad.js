function solution(numbers, hand) {
    let answer = '';
    let l = 10,
        r = 12;
    for (let i of numbers) {
        if (i == 0) i = 11;
        let countL = Math.abs(parseInt((l - i) / 3) + ((l - i) % 3));
        let countR = Math.abs(parseInt((r - i) / 3) + ((r - i) % 3));
        if (
            i % 3 == 1 ||
            (i % 3 == 2 &&
                (countL < countR || (countL == countR && hand == 'left')))
        ) {
            answer += 'L';
            l = i;
        } else {
            answer += 'R';
            r = i;
        }
    }
    return answer;
}
