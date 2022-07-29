function solution(my_string) {
    return [...my_string.replaceAll(/[^\d]/g, '')].reduce(
        (ac, c) => ac + Number(c),
        0
    );
}
