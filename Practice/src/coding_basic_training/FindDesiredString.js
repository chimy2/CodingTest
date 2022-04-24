function solution(myString, pat) {
    return myString.toUpperCase().toUpperCase().includes(pat.toUpperCase())
        ? 1
        : 0;
}
