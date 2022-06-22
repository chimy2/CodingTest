function solution(array) {
    var answer = 0;
    const m = new Map();
    let max = 0;
    for (let i of array) {
        let count = m.has(i) ? m.get(i) + 1 : 1;
        m.set(i, count);
        if (max < count) {
            answer = i;
            max = count;
        } else if (max == count) {
            answer = -1;
        }
    }
    return answer;
}
