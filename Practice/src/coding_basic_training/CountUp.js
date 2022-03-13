function solution(start, end) {
    return [...Array(end - start + 1).keys()].map((i) => i + start);
    // return Array.from({ length: end - start + 1 }, () => {
    //     return start++;
    // });
}
