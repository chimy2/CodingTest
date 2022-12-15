function solution(s) {
    let temp;
    return [...s].map((v, i) =>
        i != 0 && (temp = s.lastIndexOf(v, i - 1)) >= 0 ? i - temp : -1
    );
}
