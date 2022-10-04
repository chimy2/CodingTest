function solution(s, n) {
    return [...s]
        .map((i) => +i.charCodeAt(0))
        .map((i) =>
            i >= 97
                ? ((i + n - 97) % 26) + 97
                : i >= 65
                ? ((i + n - 65) % 26) + 65
                : 32
        )
        .map((i) => String.fromCharCode(i))
        .join('');
}
