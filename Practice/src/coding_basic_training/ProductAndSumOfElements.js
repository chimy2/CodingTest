function solution(num_list) {
    return num_list.reduce((a, c) => a * c) <
        Math.pow(
            num_list.reduce((a, c) => a + c),
            2
        )
        ? 1
        : 0;
    // Math.pow() 대신 산술연산자도 가능
    // return num_list.reduce((a, c) => a * c) <
    //     num_list.reduce((a, c) => a + c) ** 2
    //     ? 1
    //     : 0;
}
