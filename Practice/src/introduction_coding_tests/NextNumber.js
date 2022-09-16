function solution(common) {
    [x, y, z] = common;
    return y - x == z - y
        ? common[common.length - 1] + y - x
        : common[common.length - 1] * (y - x);
}
