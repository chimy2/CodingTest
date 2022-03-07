function solution(numLog) {
    var answer = "";
    for (let i = 1; i < numLog.length; i++) {
        switch (numLog[i] - numLog[i - 1]) {
            case 1:
                answer += "w";
                break;
            case -1:
                answer += "s";
                break;
            case -10:
                answer += "a";
                break;
            case 10:
                answer += "d";
        }
    }
    return answer;
    // 객체를 이용할 수 있음
    // let a = {
    //     1: "w",
    //     "-1": "s",
    //     10: "d",
    //     "-10": "a",
    // };

    // return numLog
    //     .slice(1)
    //     .map((v, i) => {
    //         return a[v - numLog[i]];
    //     })
    //     .join("");
}
