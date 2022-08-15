function solution(id_pw, db) {
    const [id, pw] = id_pw;
    for (let [id2, pw2] of db) {
        if (id == id2) {
            if (pw == pw2) {
                return 'login';
            } else {
                return 'wrong pw';
            }
        }
    }
    return 'fail';
}
