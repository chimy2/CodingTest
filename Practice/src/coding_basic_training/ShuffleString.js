function solution(str1, str2) {
    var answer = '';
    for(let i=0;i<str1.length;i++){
        answer += str1.charAt(i) + str2.charAt(i);
    }
    return answer;
    // join 함수 이용
    // return [...str1].map((x, idx)=> x+str2[idx]).join("");
}