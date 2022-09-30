function solution(s) {
    return s.replaceAll(/\D/g, '') == s && (s.length == 4 || s.length == 6);
    // return /^\d{6}$|^\d{4}$/.test(s);

    // var answer = true;
    // if (s.length === 4 || s.length === 6) {
    //     for (var i = 0; i < s.length; i++) {
    //         if (!Number(s.charAt(i))) {
    //             answer = false;
    //         }
    //     }
    // } else {
    //     answer = false;
    // }
    // return answer;
}
