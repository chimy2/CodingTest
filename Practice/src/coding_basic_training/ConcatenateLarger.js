function solution(a, b) {
    return Math.max(parseInt(""+a+b), parseInt(""+b+a));
    // return Math.max(Number(`${a}${b}`), Number(`${b}${a}`));
}
/*
    parseInt vs Number 

    1. 숫자 뒤에 있는 문자를 무시하고 반환할 수 있다.
        Number("010-1234")      => NaN
        parseInt("010-1234")    => 10
        parseInt("JSP2.2")      => NaN

    2. 진법 사용 시 유리하다
        Number("1011")          => 1011
        parseInt("1011")        => 1011
        parseInt("1011", 2)     => 11
        parseInt("1011", 31)    => 31
    
    3. 불분명한 값에 대해 다른 값을 반환한다
        parseInt();             => NaN
        parseInt(null);         => NaN
        parseInt(true);         => NaN
        parseInt('');           => NaN
        Number();               => 0
        Number(null);           => 0
        Number(true);           => 1
        Number('');             => 0
    
    4. 소수점자리가 포함된 숫자는 정수부만 나타낸다
        parseInt("7.7")         => 7
        Number("7.7")           => 7.7
        parseFloat("7.7")       => 7.7

*/