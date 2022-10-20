process.stdin.setEncoding('utf8');
process.stdin.on('data', (data) => {
    [x, y] = data.split(' ');
    console.log(('*'.repeat(x) + '\n').repeat(y));
    // const preStar = data.split(' ');
    // const a = Number(preStar[0]),
    //     b = Number(preStar[1]);
    // var data = '';
    // for (var i = 0; i < b; i++) {
    //     for (var j = 0; j < a; j++) {
    //         data += '*';
    //     }
    //     data += '\n';
    // }
    // console.log(data);
});
