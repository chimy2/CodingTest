function solution(i, j, k) {
    return Array(j - i + 1)
        .fill(i)
        .map((v, idx) => v + idx)
        .reduce((p, c) => p + String(c), '')
        .replaceAll(new RegExp('[^' + k + ']', 'g'), '').length;
    // return (
    //     Array(j - i + 1)
    //         .fill(i)
    //         .map((v, i) => v + i)
    //         .join('')
    //         .split(k).length - 1
    // );
}
