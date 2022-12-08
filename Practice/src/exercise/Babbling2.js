function solution(babbling) {
    return babbling.reduce(
        (p, c) =>
            c.match(/^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$/g)
                ? p + 1
                : p,
        0
    );
}
