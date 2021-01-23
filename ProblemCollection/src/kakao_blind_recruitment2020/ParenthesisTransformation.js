// 괄호 변환
function solution(p) {
	const answer = [];
	convert(answer, p);
	return answer.toString().replace(/,/g, "");
}

function convert(answer, w){
	if(w==="") return;
	for(let i=0, count=0, check=true;;i++){
		w.charAt(i)==="(" ? count++ : count--;
		if(count<0) check=false;
		if(count===0){
			const u=w.slice(0, i+1);
			const v=w.slice(i+1);
			if(check){// 
				answer.push(u);
				convert(answer, v);
				return;
			}else {
				answer.push("(");
				answer.push(convert(answer, v));
				answer.push(")");
				u.slice(1,i).split("").forEach(element => answer.push(element === "(" ? ")" : "("));
				return;
			}
		}
	}
}