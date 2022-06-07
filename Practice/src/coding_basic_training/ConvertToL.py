def solution(myString):
    return "".join(["l" if ord(i) <= 107 else i for i in myString])
    # return myString.translate(str.maketrans('abcdefghijk', 'lllllllllll'))