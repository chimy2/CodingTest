function solution(phone_number) {
    return phone_number.replace(/.(?=.{4})/g, '*');
    // var result = '';
    // for (var i = 0; i < phone_number.length - 4; i++) {
    //     result += '*';
    // }
    // result += phone_number.slice(phone_number.length - 4, phone_number.length);
    // return result;
}
