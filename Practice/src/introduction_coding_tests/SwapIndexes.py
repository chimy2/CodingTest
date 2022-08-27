def solution(my_string, num1, num2):
    arr = my_string.split()
    arr[num1] = my_string[num2]
    arr[num2] = my_string[num1]
    # arr[num1],arr[num2] = arr[num2],arr[num1]
    return "".join(arr)
