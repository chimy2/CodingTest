function solution(new_id) {
    let answer = new_id.toLowerCase();
    answer = answer.replaceAll(/[^a-z0-9-_.]/g, '');
    answer = answer.replaceAll(/\.{2,}/g, '.');
    answer = answer.replaceAll(/^\.|\.$/g, '');
    if (answer.length == 0) {
        answer = 'aaa';
    } else if (answer.length < 3) {
        answer += answer.charAt(answer.length - 1).repeat(3 - answer.length);
    } else if (answer.length > 15) {
        answer = answer.substring(0, answer.charAt(14) == '.' ? 14 : 15);
    }
    return answer;

    // const id = new_id
    //     .toLowerCase()
    //     .replace(/[^\w\d-_.]/g, '')
    //     .replace(/\.{2,}/g, '.')
    //     .replace(/^\.|\.$/g, '')
    //     .padEnd(1, 'a')
    //     .slice(0, 15)
    //     .replace(/^\.|\.$/g, '');
    // return id.padEnd(3, id[id.length - 1]);
}
