function solution(nums) {
    return Math.min(new Set(nums).size, parseInt(nums.length / 2));
}
