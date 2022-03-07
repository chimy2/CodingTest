function solution(n, control) {
    control.split("").forEach((e) => {
        switch (e) {
            case "w":
                n++;
                break;
            case "s":
                n--;
                break;
            case "a":
                n -= 10;
                break;
            case "d":
                n += 10;
        }
    });
    return n;
}
