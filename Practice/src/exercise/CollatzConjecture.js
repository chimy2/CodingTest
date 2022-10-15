function solution(num) {
    for (let i = 0; ; i++) {
        if (i > 500) return -1;
        else if (num == 1) return i;
        num = num % 2 == 0 ? num / 2 : num * 3 + 1;
    }
}
