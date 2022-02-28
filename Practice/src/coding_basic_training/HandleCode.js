function solution(code) {
    var answer = '';
    var mode = 0;
    for(c in code){
        if(code[c] == "1"){
            mode = mode == 0 ? 1 : 0;
            continue;
        }
        if((mode + parseInt(c)) % 2 == 0) answer += code[c];
    }
    return answer.length != 0 ? answer : "EMPTY";
    // reduce 함수를 이용한 방법
    // let odd = false
    // return Array.from(code).reduce((acc, v, i) => {
    //     if (v === '1') {
    //         odd = !odd
    //         return acc
    //     }
    //     return (i % 2 === (odd ? 1 : 0)) ? acc + v : acc
    // }, '') || 'EMPTY'
}