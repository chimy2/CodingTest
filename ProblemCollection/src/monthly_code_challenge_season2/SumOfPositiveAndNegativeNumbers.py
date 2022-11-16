def solution(absolutes, signs):
    return sum(a if s else -a for a, s in zip(absolutes, signs))
    # return sum(2 * x * y - x for x, y in zip(absolutes, signs))
