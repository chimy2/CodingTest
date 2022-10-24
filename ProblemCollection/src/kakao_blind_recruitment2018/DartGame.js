function solution(dartResult) {
    const answer = [0, 0, 0];
    for (let i = 0, index = -1; i < dartResult.length; i++) {
        switch (dartResult[i]) {
            case 'S':
                console.log('?');
                break;
            case 'D':
                answer[index] = Math.pow(answer[index], 2);
                break;
            case 'T':
                answer[index] = Math.pow(answer[index], 3);
                break;
            case '*':
                if (index > 0) answer[index - 1] *= 2;
                answer[index] *= 2;
                break;
            case '#':
                answer[index] *= -1;
                break;
            default:
                if (dartResult[i + 1] == '0') {
                    answer[++index] = 10;
                    i++;
                } else {
                    answer[++index] = +dartResult[i];
                }
        }
        console.log(i, answer);
    }
    return answer.reduce((a, b) => a + b, 0);
    // const bonus = { S: 1, D: 2, T: 3 },
    //     options = { '*': 2, '#': -1, undefined: 1 };
    // let darts = dartResult.match(/\d+\D+/g);
    // for (let i = 0; i < darts.length; i++) {
    //     let split = darts[i].match(/(^\d+)(S|D|T)(\*|#)?/),
    //         score = Math.pow(split[1], bonus[split[2]]) * options[split[3]];
    //     if (split[3] === '*' && darts[i - 1]) darts[i - 1] *= options['*'];
    //     darts[i] = score;
    // }
    // return darts.reduce((a, b) => a + b);
}
