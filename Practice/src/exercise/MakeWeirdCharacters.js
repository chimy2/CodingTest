function solution(s) {
    return s
        .split(' ')
        .map((v) =>
            [...v]
                .map((v, i) => (i % 2 == 0 ? v.toUpperCase() : v.toLowerCase()))
                .join('')
        )
        .join(' ');
    // return s
    //     .toUpperCase()
    //     .replace(/(\w)(\w)/g, (a) => a[0].toUpperCase() + a[1].toLowerCase());
}
