def solution(babbling):
    word = ["aya", "ye", "woo", "ma"]
    for i in range(len(babbling)):
        for j in word:
            babbling[i] = babbling[i].replace(j, "-")
    return sum(1 for i in babbling if i == "-" * len(i))
