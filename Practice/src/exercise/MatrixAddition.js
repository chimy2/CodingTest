function solution(arr1, arr2) {
    for (var i = 0; i < arr1.length; i++) {
        for (var j = 0; j < arr1[i].length; j++) {
            arr1[i][j] += arr2[i][j];
        }
    }
    return arr1;
    // return arr1.map((row, x) => row.map((v, y) => v + arr2[x][y]));
}
