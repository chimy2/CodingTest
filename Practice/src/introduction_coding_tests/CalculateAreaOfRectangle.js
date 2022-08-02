function solution(dots) {
    for (let i = 1; i < dots.length; i++) {
        if (dots[0][0] != dots[i][0] && dots[0][1] != dots[i][1]) {
            return Math.abs(
                (dots[0][0] - dots[i][0]) * (dots[0][1] - dots[i][1])
            );
        }
    }
}
