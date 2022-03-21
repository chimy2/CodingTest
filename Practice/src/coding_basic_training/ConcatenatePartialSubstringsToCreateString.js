function solution(my_strings, parts) {
    return (
        my_strings
            .map((c, i) =>
                my_strings[i].substring(parts[i][0], parts[i][1] + 1)
            )
            // .map(([s, e], i) => my_strings[i].substring(s, e + 1))
            .join("")
    );
}
