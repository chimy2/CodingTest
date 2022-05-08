function solution(myString, pat) {
    return myString.includes(
        pat.replaceAll('A', 'a').replaceAll('B', 'A').replaceAll('a', 'B')
    )
        ? 1
        : 0;
    // return [...myString]
    //     .map((v) => (v === 'A' ? 'B' : 'A'))
    //     .join('')
    //     .includes(pat)
    //     ? 1
    //     : 0;
}
