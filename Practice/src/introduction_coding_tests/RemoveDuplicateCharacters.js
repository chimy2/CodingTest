function solution(my_string) {
    var answer = '';
    for (let s of my_string.split('')) {
        if (!answer.includes(s)) answer += s;
    }
    return answer;
    // return [...new Set(my_string)].join('');
    // return [...my_string].filter((c, i) => s.indexOf(c) == i).join('');
}
