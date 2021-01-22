// 문자열 압축
function solution(s) {
	let answer = new Array(Math.floor(s.length/2)).fill("");
	if(s.length===1) return 1;
	for(let i=1;i<=answer.length;i++){
		let reg=new RegExp(`.{${i}}`, 'g');
		let count=1;
		s.match(reg).reduce((before, after, index) => {
			if(before===after){
				count++;
				if(index==Math.floor(s.length/i-1)){
					answer[i-1]+=count>1?count+before: before;
				}
			}else{
				answer[i-1]+=count>1?count+before: before;
				count=1;
				if(index==Math.floor(s.length/i-1)){
					answer[i-1]+=after;
				}
			}
			return after;
		});
		answer[i-1]+=s.slice(i*Math.floor(s.length/i), s.length);
	}
	return answer.reduce((before, after)=>before.length>after.length?after:before).length;
}