function solution(lottos, win_nums) {
    var answer = [7, 7];
    for (let n of lottos) {
        if (n == 0) {
            answer[0]--;
        } else {
            for (let win of win_nums) {
                if (n == win) {
                    answer[0]--;
                    answer[1]--;
                    break;
                }
            }
        }
    }
    return answer.map((v) => (v == 7 ? 6 : v));
    // const rank = [6, 6, 5, 4, 3, 2, 1];
    // let [max, min] = lottos.reduce(
    //     ([max, min], cur) =>
    //         win_nums.includes(cur)
    //             ? [++max, ++min]
    //             : cur === 0
    //             ? [++max, min]
    //             : [max, min],
    //     [0, 0]
    // );
    // return [rank[max], rank[min]];
}
