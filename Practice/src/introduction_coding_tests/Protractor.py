def solution(angle):
    return len(i for i in [0, 90, 91, 180] if angle >= i)
    # return (angle // 90) * 2 + (angle % 90 > 0)

