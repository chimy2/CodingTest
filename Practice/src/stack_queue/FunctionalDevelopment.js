// 기능개발
function solution(progresses, speeds) {
	const arr=[];
	const answer=[];
	let num=0;
	for(let i=0;i<progresses.length;i++){
		arr.push(Math.ceil((100-progresses[i])/speeds[i]));
	}
	arr.push(101);
	arr.reduce((before, after, index) => {
		if(before>=after){
			return before;
		}else {
			answer.push(index-num);
			num=index;
			return after;
		}
	});
 	return answer;
}