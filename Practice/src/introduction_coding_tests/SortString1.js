function solution(my_string) {
    return [...my_string.replaceAll(/[A-Za-z]/g, '')]
        .map(Number)
        .sort((a, b) => a - b);
    // return my_string
    //     .match(/\d/g)
    //     .sort((a, b) => a - b)
    //     .map((n) => Number(n));
}
