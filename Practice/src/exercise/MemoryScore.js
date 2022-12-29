function solution(name, yearning, photo) {
    const score = [];
    for (let i = 0; i < name.length; i++) {
        score[name[i]] = yearning[i];
    }
    return photo.map((arr) =>
        arr.reduce((p, c) => (score[c] ? p + score[c] : p), 0)
    );
    // null 병합 연산자 사용
    // return photo.map((v) =>
    //     v.reduce((a, c) => (a += yearning[name.indexOf(c)] ?? 0), 0)
    // );
}
