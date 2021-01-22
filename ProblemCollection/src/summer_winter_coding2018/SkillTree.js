// 스킬트리
function solution(skill, skill_trees) {
    let answer = 0;
    const reg=new RegExp(`[${skill}]`,'g');
    for(const i in skill_trees){
        if(!reg.test(skill_trees[i])) {
            answer++;
            continue;
        }
        skill_trees[i]=skill_trees[i].match(reg).toString().replace(/,/g,"");
        for(let j=0;j<skill_trees[i].length;j++){
            if(skill.charAt(j)!==skill_trees[i].charAt(j)) break;
            if(j+1===skill_trees[i].length){
                answer++;
            }
        }
    }
    return answer;
}

