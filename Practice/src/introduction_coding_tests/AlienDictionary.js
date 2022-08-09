function solution(spell, dic) {
    const s = spell.join('');
    const reg = new RegExp(`[^${s}]`, 'g');
    for (let i = 0; i < dic.length; i++) {
        if (dic[i].replaceAll(reg, '').length == spell.length) {
            let count = 0;
            for (let j = 0; j < spell.length; j++) {
                if (dic[i].includes(spell[j])) count++;
            }
            if (count == spell.length) return 1;
        }
    }
    return 2;
}
