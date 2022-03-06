function solution(num_list) {
    let a = num_list[num_list.length - 2];
    let b = num_list[num_list.length - 1];
    num_list.push(a >= b ? b * 2 : b - a);
    return num_list;
    // const [a, b] = [...num_list].reverse();
    // return [...num_list, a > b ? a - b : a * 2];
}
