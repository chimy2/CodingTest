function solution(my_string) {
    return my_string
        .replace(/ \+ | - /g, (i) => (i == ' + ' ? ' ' : ' -'))
        .split(' ')
        .reduce((p, c) => p + +c, 0);
}
