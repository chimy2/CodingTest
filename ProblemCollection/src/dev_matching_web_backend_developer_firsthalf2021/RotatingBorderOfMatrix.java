package dev_matching_web_backend_developer_firsthalf2021;

import java.util.ArrayList;
import java.util.List;

//	행렬 테두리 회전하기
public class RotatingBorderOfMatrix {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] arr = new int[rows][columns];
        List<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = i * columns + j + 1;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int[] dir = queries[i];
            boolean isPlus = true;
            int x = dir[0] - 1, y = dir[1] - 1;
            int startX = x, startY = y;
            int endX = dir[2] - 1, endY = dir[3] - 1;
            int min = rows * columns;
            int current = arr[x][y], next;

            do {
                int x2 = x, y2 = y;

                if (isPlus) {
                    if (y < endY) {
                        y2++;
                    } else {
                        x2++;
                    }
                } else {
                    if (y > startY) {
                        y2--;
                    } else {
                        x2--;
                    }
                }
                next = arr[x2][y2];
                arr[x2][y2] = current;
                x = x2;
                y = y2;

                if (x == endX && y == endY) {
                    isPlus = !isPlus;
                }
                min = Math.min(current, min);
                current = next;
            } while (x != startX || y != startY);
            answer.add(min);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}