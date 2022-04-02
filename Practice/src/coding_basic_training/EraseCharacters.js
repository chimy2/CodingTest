function solution(my_string, indices) {
    var answer = my_string.split('');
    for (let i of indices) {
        answer[i] = '';
    }
    for (let i = 0; i < m.length; i++) {
        if (!a.includes(i)) {
            answer += m[i];
        }
    }
    return answer.join('');
}
