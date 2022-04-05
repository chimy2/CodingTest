function solution(n, slicer, num_list) {
    var answer = [];
    var [a, b, c] = slicer;
    // let [a, b, c] = [...slicer];
    switch (n) {
        case 1:
            answer = num_list.filter((v, i) => i <= b);
            // answer = num_list.slice(0, b + 1);
            break;
        case 2:
            answer = num_list.filter((v, i) => i >= a);
            break;
        case 3:
            answer = num_list.filter((v, i) => i >= a && i <= b);
            break;
        case 4:
            answer = num_list.filter(
                (v, i) => i >= a && i <= b && i % c == a % c
            );
    }
    return answer;
}
