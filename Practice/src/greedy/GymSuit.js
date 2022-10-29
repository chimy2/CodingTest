function solution(n, lost, reserve) {
    return (
        n +
        Array(n + 2)
            .fill(0)
            .map((_, i) => reserve.includes(i) - lost.includes(i))
            .map((v, i, arr) => {
                if (v == -1) {
                    if (arr[i - 1] == 1) {
                        return 0;
                    } else if (arr[i + 1] == 1) {
                        arr[i + 1] = 0;
                        return 0;
                    } else {
                        return -1;
                    }
                }
                return 0;
            })
            .reduce((p, c) => p + c, 0)
    );
}
