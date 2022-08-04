function solution(polynomial) {
    var answer = '';
    let x = 0,
        d = 0;
    for (let s of polynomial.split(' + ')) {
        if (s.includes('x')) {
            x += s.length > 1 ? parseInt(s) : 1;
        } else {
            d += parseInt(s);
        }
    }
    if (x > 0 && d > 0) {
        answer = `${x > 1 ? x : ''}x + ${d}`;
    } else if (x > 0) {
        answer = `${x > 1 ? x : ''}x`;
    } else {
        answer += d;
    }
    return answer;
}
