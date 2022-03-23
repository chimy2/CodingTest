function solution(my_string, n) {
    return my_string.substring(my_string.length - n);
    // slice를 이용한 방법
    // return my_string.slice(-1 * n);
}
