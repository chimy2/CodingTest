function solution(babbling) {
    return babbling.filter((v) =>
        v.match(/^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$/g)
    ).length;
}
