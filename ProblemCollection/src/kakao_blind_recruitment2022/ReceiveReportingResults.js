function solution(id_list, report, k) {
    const answer = {};
    for (let s of report) {
        [x, y] = s.split(' ');
        if (answer[y] == null) {
            answer[y] = new Set();
        }
        answer[y].add(x);
    }
    for (let key of Object.keys(answer)) {
        if (answer[key].size < k) delete answer[key];
    }
    return id_list.map((v) =>
        Object.values(answer).reduce((p, c) => (c.has(v) ? p + 1 : p), 0)
    );
    // let reports = [...new Set(report)].map((a) => {
    //     return a.split(' ');
    // });
    // let counts = new Map();
    // for (const bad of reports) {
    //     counts.set(bad[1], counts.get(bad[1]) + 1 || 1);
    // }
    // let good = new Map();
    // for (const report of reports) {
    //     if (counts.get(report[1]) >= k) {
    //         good.set(report[0], good.get(report[0]) + 1 || 1);
    //     }
    // }
    // let answer = id_list.map((a) => good.get(a) || 0);
    // return answer;
}
