function solution(n) {
    var answer = 0;
    var isEven = n % 2 == 0;
    for(let i = n ; i > 0 ; i-= 2){
        answer += isEven ? i*i : i; 
    }
    return answer;
    // return n % 2 == 0 ? n*(n+1)*(n+2)/6 : (n+1)/2*((n + 1)/2);
}