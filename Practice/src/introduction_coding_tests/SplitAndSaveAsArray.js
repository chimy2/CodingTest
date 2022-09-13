function solution(my_str, n) {
    return Array(parseInt((my_str.length + n - 1) / n))
        .fill('')
        .map((_, i) => my_str.substring(i * n, (i + 1) * n));
    // return my_str.match(new RegExp(`.{1,${n}}`, 'g'));
}
