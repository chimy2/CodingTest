function solution(today, terms, privacies) {
    const answer = [];
    const term = {};
    const day = [12 * 28, 28, 1];
    const now = today.split('.').reduce((p, c, i) => p + c * day[i], 0);
    for (let t of terms) {
        let s = t.split(' ');
        term[s[0]] = +s[1];
    }
    for (let idx = 0; idx < privacies.length; idx++) {
        let s = privacies[idx].split(' ');
        if (
            s[0].split('.').reduce((p, c, i) => p + c * day[i], 0) +
                term[s[1]] * day[1] <=
            now
        ) {
            answer.push(idx + 1);
        }
    }
    return answer;
}
