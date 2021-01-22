// 멀쩡한 사각형
function solution(w,h){
	let answer = w*h-(w+h);
	let gcd=1;
	for(let i=2;w>=i&&h>=i;){
		if(w%i===0 && h%i===0){
			w/=i;
			h/=i;
			gcd*=i;
		}else{
			i++;
		}
		
	}
	return answer+gcd;
}