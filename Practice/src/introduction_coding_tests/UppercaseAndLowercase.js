function solution(my_string) {
    return my_string
        .split('')
        .map((i) => (i.charCodeAt(i) < 97 ? i.toLowerCase() : i.toUpperCase()))
        .join('');
}
