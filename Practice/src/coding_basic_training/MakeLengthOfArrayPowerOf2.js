function solution(arr) {
    var answer = Array().concat(
        ...arr,
        Array(
            Math.pow(2, (arr.length - 1).toString(2).length) % arr.length
        ).fill(0)
    );
    // return [
    //     ...arr,
    //     ...Array(2 ** Math.ceil(Math.log2(arr.length)) - arr.length).fill(0),
    // ];
}
