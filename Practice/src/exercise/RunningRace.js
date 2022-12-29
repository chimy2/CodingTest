function solution(players, callings) {
    const rank = {};
    for (let i = 0; i < players.length; i++) {
        rank[players[i]] = i;
    }
    for (let c of callings) {
        let i = rank[c];
        rank[players[i - 1]] = i;
        rank[c] = i - 1;
        players[i] = players[i - 1];
        players[i - 1] = c;
    }
    return players;
}
