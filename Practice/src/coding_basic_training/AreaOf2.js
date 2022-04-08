function solution(arr) {
    var answer = [];
    var checked = false;
    for (let i of arr) {
        if (i == 2) checked = true;
        if (checked) answer.push(i);
    }
    while (answer.length > 0 && answer[answer.length - 1] != 2) {
        answer.pop();
    }
    return checked ? answer : [-1];

    // const from = arr.indexOf(2);
    // const end = arr.lastIndexOf(2);

    // return from === -1 ? [-1] : arr.slice(from, end + 1);
}
