function solution(myStr) {
    var answer = myStr.split(/[abc]/).filter((v) => v.length > 0);
    return answer.length > 0 ? answer : ['EMPTY'];
}
