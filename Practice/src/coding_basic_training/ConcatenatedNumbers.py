def solution(num_list):
    a = ""
    b = ""
    for i, j in enumerate(num_list) :
        if j%2==0 :
            a+=str(j)
        else :
            b+=str(j)
    return int(a)+int(b)