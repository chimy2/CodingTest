function solution(angle) {
    var answer = 4;
    if (answer < 90) answer = 1;
    else if (answer == 90) answer = 2;
    else if (answer < 180) answer = 3;
    return answer;
    // return [0, 90, 91, 180].filter((x) => angle >= x).length;
}
