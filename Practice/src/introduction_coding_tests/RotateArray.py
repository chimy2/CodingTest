def solution(numbers, direction):
    if direction == "left":
        numbers.append(numbers.pop(0))
    else:
        numbers.insert(0, numbers.pop())
    return numbers
    # return [numbers[-1]] + numbers[:-1] if direction == 'right' else numbers[1:] + [numbers[0]]
