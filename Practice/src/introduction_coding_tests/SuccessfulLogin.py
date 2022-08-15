def solution(id_pw, db):
    id, pw = id_pw
    for id2, pw2 in db:
        if id == id2:
            if pw == pw2:
                return "login"
            else:
                return "wrong pw"
    return "fail"
    # if db_pw := dict(db).get(id_pw[0]):
    #     return "login" if db_pw == id_pw[1] else "wrong pw"
    # return "fail"
