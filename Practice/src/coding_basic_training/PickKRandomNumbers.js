function solution(arr, k) {
    var answer = Array(k).fill(-1);
    for (let i = 0, j = 0; i < arr.length && j < k; i++) {
        if (!answer.includes(arr[i])) answer[j++] = arr[i];
    }
    return answer;
    // const set = new Set(arr);
    // return set.size < k
    //     ? [...set, ...Array(k - set.size).fill(-1)]
    //     : [...set].slice(0, k);
}
