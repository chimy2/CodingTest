function solution(t, p) {
    let answer = 0;
    for (let i = 0; i <= t.length - p.length; i++) {
        if (t.substring(i, i + p.length).localeCompare(p) <= 0) answer++;
        // localeCompare보다 등호로 직접 비교하는게 빠르다
        // if (t.substring(i, i + p.length) <= p) answer++;
        // if (+t.slice(i, i + p.length) <= +p) answer++;
    }
    return answer;
}
