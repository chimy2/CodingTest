function solution(s) {
    return (
        s.replaceAll(/[^pP]/g, '').length == s.replaceAll(/[^yY]/g, '').length
    );
    // return s.split(/p/ig).length == s.split(/y/ig).length;
    // return [...s.toLowerCase()].reduce((acc, cur) => {
    //     if (cur === 'p') return acc + 1;
    //     else if (cur === 'y') return acc - 1;
    //     return acc;
    // }, 0)
    //     ? false
    //     : true;
}
