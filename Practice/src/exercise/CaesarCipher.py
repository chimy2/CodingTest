def solution(s, n):
    return "".join(
        chr((ord(i) + n - 97) % 26 + 97) if ord(i) >= 97 else chr((ord(i) + n - 65) % 26 + 65) if ord(i) >= 65 else " "
        for i in s)
    # return "".join(
    #     chr((ord(i) + n - 97) % 26 + 97) if i.islower() else chr((ord(i) + n - 65) % 26 + 65) if i.isupper() else " "
    #     for i in s)