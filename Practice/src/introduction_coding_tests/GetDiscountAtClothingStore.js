function solution(price) {
    var n = 10 ** 5;
    if (price >= 5 * n) return parseInt(price * 0.8);
    else if (price >= 3 * n) return parseInt(price * 0.9);
    else if (price >= n) return parseInt(price * 0.95);
    return price;
}
