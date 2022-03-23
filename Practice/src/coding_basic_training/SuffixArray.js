function solution(my_string) {
    var answer = [];
    for (let i = 0; i < my_string.length; i++) {
        answer.push(my_string.substring(i));
    }
    return answer.sort();
    //  from
    // return Array.from(my_string)
    //     .map((_, i) => my_string.substring(i))
    //     .sort();
}
