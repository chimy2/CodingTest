function solution(s) {
    const arr = [
        'zero',
        'one',
        'two',
        'three',
        'four',
        'five',
        'six',
        'seven',
        'eight',
        'nine',
    ];
    return +s
        .match(/\d+|zero|one|two|three|four|five|six|seven|eight|nine/g)
        .map((v) => (+v ? v : arr.indexOf(v)))
        .join('');
}
