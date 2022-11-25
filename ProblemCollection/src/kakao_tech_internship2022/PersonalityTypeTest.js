function solution(survey, choices) {
    const s = 'RTCFJMAN';
    const score = [0, 0, 0, 0];
    for (let i = 0; i < survey.length; i++) {
        switch (survey[i].charAt(0)) {
            case 'R':
                score[0] += choices[i] - 4;
                break;
            case 'T':
                score[0] += 4 - choices[i];
                break;
            case 'C':
                score[1] += choices[i] - 4;
                break;
            case 'F':
                score[1] += 4 - choices[i];
                break;
            case 'J':
                score[2] += choices[i] - 4;
                break;
            case 'M':
                score[2] += 4 - choices[i];
                break;
            case 'A':
                score[3] += choices[i] - 4;
                break;
            case 'N':
                score[3] += 4 - choices[i];
        }
    }
    return score.reduce((p, c, i) => p + s.charAt(i * 2 + (c > 0 ? 1 : 0)), '');
}
