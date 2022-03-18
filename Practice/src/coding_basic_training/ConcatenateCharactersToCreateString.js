function solution(my_string, index_list) {
    var answer = "";
    for (i of index_list) {
        answer += my_string[i];
    }
    return answer;
    // map과 join 이용
    // return index_list.map((i) => my_string[i]).join("");
}
