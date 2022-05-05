function solution(myString) {
    return myString
        .split('x')
        .filter((v) => v != '')
        .sort();
    // return myString.match(/[^x]+/g).sort();
}
