function solution(ineq, eq, n, m) {
    var answer = 0;
    var checked1 = ineq == ">";
    var checked2 = eq == "=";
    if(checked1 && n >= m || !checked1 && n<=m) {
        if(checked2 || n!=m) answer = 1;
    }
    return answer;
}