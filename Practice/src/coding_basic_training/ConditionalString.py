def solution(ineq, eq, n, m):
    answer = 0
    if eq == "=" and n == m or ineq == ">" and n > m or ineq == "<" and n < m : answer = 1;
    return answer
    # return int(eval(str(n)+ineq+eq.replace('!', '')+str(m)))