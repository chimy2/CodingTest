function solution(s, skip, index) {
    const c = [];
    let temp = 0;
    for (let i = 0; i < 26; i++) {
        for (let count = 1, minus = 0; count - minus <= index; count++) {
            temp = String.fromCharCode(((i + count) % 26) + 97);
            if (skip.includes(temp)) minus++;
        }
        c.push(temp);
    }
    return [...s].map((v) => c[v.charCodeAt(0) - 97]).join('');
    // const alphabet = [...'abcdefghijklmnopqrstuvwxyz'].filter(
    //     (c) => !skip.includes(c)
    // );
    // return [...s]
    //     .map((c) => alphabet[(alphabet.indexOf(c) + index) % alphabet.length])
    //     .join('');
}
