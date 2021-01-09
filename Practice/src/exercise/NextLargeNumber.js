function solution(n) {
  let num = 0;
  for (let i of n.toString(2)) {
    if (i == "1") num++;
  }
  while (true) {
    let check = 0;
    n++;
    for (let i of n.toString(2)) {
      if (i == "1") check++;
    }
    if (check == num) break;
  }
  return n;
}