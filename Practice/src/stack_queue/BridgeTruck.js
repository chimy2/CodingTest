// 다리를 지나는 트럭
function solution(bridge_length, weight, truck_weights) {
	let answer = 0;
	let bridge=new Array(bridge_length).fill(0);
	while(truck_weights.length>0){
		let sum=bridge.reduce((a,b)=>a+b);
		if(weight-truck_weights[0]>=sum-bridge[0]) {
			sum+=truck_weights[0];
			bridge.push(truck_weights.shift());
			bridge.shift();
		} else if(bridge[0]>0){
			bridge.push(0);
			bridge.shift();
		} else{
			let find=bridge.find(e=>e>0);
			let index=bridge.findIndex(e=>e>0);
			bridge=Array.prototype.concat(bridge.slice(index+1), new Array(index).fill(0));
			if(sum+truck_weights[0]-find<=weight){
				bridge.push(truck_weights.shift());
			}else {
				bridge.push(0);
			}
			answer+=index;
		}
		if(sum==0)continue;
		answer++;
	}
	return answer+bridge_length;
}