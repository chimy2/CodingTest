function solution(food) {
    return food.reduceRight(
        (p, c, i) => String(i).repeat(c / 2) + p + String(i).repeat(c / 2),
        '0'
    );
}
