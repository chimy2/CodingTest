function solution(n, arr1, arr2) {
    return Array(n)
        .fill('')
        .map((_, i) =>
            (arr1[i] | arr2[i])
                .toString(2)
                .replaceAll('1', '#')
                .replaceAll('0', ' ')
                .padStart(n, ' ')
        );
    // return arr1.map((v, i) =>
    //     (v | arr2[i])
    //         .toString(2)
    //         .padStart(n, ' ')
    //         .replaceAll(/1|0/g, (x) => (+x ? '#' : ' '))
    // );
}
