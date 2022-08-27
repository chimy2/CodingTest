function solution(numbers) {
    const n = [
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
    for (let i = 0; i <= 9; i++) {
        numbers = numbers.replaceAll(n[i], i);
    }

    // const num = numbers.replace(
    //     /zero|one|two|three|four|five|six|seven|eight|nine/g,
    //     (v) => {
    //         return obj[v];
    //     }
    // );

    // for (let i = 0; i < number.length; i++) {
    //     numbers = numbers.split(number[i]).join(i);
    // }
    return parseInt(numbers);
}
