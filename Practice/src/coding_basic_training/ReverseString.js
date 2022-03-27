function solution(my_string, s, e) {
    let arr = my_string.split("");
    for (let i = s; i <= s + (e - s) / 2; i++) {
        let temp = arr[i];
        arr[i] = arr[e - i + s];
        arr[e - i + s] = temp;
    }
    return arr.join("");
}
