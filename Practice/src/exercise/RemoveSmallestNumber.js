function solution(arr) {
    const min = Math.min(...arr);
    return arr.length > 1 ? arr.filter((i) => min != i) : [-1];
    // arr.splice(arr.indexOf(Math.min(...arr)), 1);
    // return arr.length > 0 ? arr : [-1];
}
