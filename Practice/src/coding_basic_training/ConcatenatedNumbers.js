function solution(num_list) {
    let a = "";
    let b = "";
    for (let i of num_list) {
        if (i % 2 == 0) {
            a += i;
        } else {
            b += i;
        }
    }
    return Number(a) + Number(b);
    // reduce를 이용한 방법
    // const { odds, evens } = num_list.reduce(
    //     ({ odds, evens }, num) => {
    //         if (num % 2 === 0) {
    //             evens.push(num);
    //         } else {
    //             odds.push(num);
    //         }
    //         return { odds, evens };
    //     },
    //     { odds: [], evens: [] }
    // );
    // return Number(odds.join("")) + Number(evens.join(""));
}
