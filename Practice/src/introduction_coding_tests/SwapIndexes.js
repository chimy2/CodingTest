function solution(my_string, num1, num2) {
    const arr = my_string.split('');
    arr[num1] = my_string.charAt(num2);
    arr[num2] = my_string.charAt(num1);
    return arr.join('');
    // my_string = my_string.split('');
    // [my_string[num1], my_string[num2]] = [my_string[num2], my_string[num1]];
    // return my_string.join('');
}
