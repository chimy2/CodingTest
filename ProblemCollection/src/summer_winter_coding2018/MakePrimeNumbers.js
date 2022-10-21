function solution(nums) {
    let answer = 0;
    const set = new Set();
    const max = Math.max(...nums) * 3;
    for (let i = 2; i < max; i++) {
        if (!set.has(i)) {
            for (let j = i * i; j < max; j += i) {
                set.add(j);
            }
        }
    }
    for (let i = 0; i < nums.length - 2; i++) {
        for (let j = i + 1; j < nums.length - 1; j++) {
            for (let k = j + 1; k < nums.length; k++) {
                if (!set.has(nums[i] + nums[j] + nums[k])) answer++;
            }
        }
    }
    return answer;
}
