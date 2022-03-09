function solution(arr, queries) {
    let answer = new Array(queries.length);
    for (let i = 0; i < answer.length; i++) {
        let min = -1;
        let max = queries[i][2];
        for (let j = queries[i][0]; j <= queries[i][1]; j++) {
            if (arr[j] > max && (min == -1 || (min != -1 && min > arr[j])))
                min = arr[j];
        }
        answer[i] = min;
    }
    return answer;
    // map을 이용한 방법
    // return queries.map(
    //     ([s, e, k]) =>
    //         arr
    //             .slice(s, e + 1)
    //             .filter((n) => n > k)
    //             .sort((a, b) => a - b)[0] || -1
    // );
}
