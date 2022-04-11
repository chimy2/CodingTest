function solution(num_list, n) {
    [...num_list].map((v, i) => num_list[(i + n) % num_list.length]);
    return Array(num_list.slice(n), num_list.slice(0, n));
}
