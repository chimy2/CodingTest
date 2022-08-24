function solution(order) {
    return String(order).replaceAll(/[^369]/g, '').length;
}
