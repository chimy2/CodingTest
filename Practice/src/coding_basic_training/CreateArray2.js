function solution(l, r) {
    var answer = [];
    for (let i = 1; i < 64; i++) {
        let a = i.toString(2) * 5;
        if (r < a) break;
        if (l <= a) answer.push(a);
    }
    return answer.length > 0 ? answer : [-1];
    // 정규표현식 이용
    // const result = Array.from({ length: r - l + 1 }, (_, i) => i + l).filter(
    //     (n) => !/[^05]/.test(n)
    // );
    // return result.length ? result : [-1];
}
