def solution(numer1, denom1, numer2, denom2):
    answer = [numer1 * denom2 + numer2 * denom1, denom1 * denom2]
    num = 2
    while num <= answer[0] and num <= answer[1]:
        if answer[0] % num == 0 and answer[1] % num == 0:
            answer[0] /= num
            answer[1] /= num
        else:
            num += 1
    return answer
