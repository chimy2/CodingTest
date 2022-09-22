function solution(a, b) {
    return new Date(2016, a - 1, b).toString().slice(0, 3).toUpperCase();
    // var answers = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT'];
    // var answer = answers[new Date('2016', a - 1, b).getDay()];
    // return answer;
}
