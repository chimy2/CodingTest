function solution(strArr) {
    var answer = [];
    return strArr.map((v, i) =>
        i % 2 == 0 ? v.toLowerCase() : v.toUpperCase()
    );
}
