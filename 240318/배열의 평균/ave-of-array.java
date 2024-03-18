import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];

        for(int i = 0; i < 2 ; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
            }
        } // 배열에 담기

        // 1. 가로 평균
        for(int i = 0; i < 2; i++){
            int sum = 0;
            for(int j = 0; j < 4; j++){
                sum += arr[i][j];
            }
            double avg = sum / 4.0;
            System.out.printf("%.1f ", avg);
        }
        System.out.println();

        // 2. 세로 평균
        for(int i = 0; i < 4; i++){
            int sum = 0;
            for(int j = 0; j < 2; j++){
                sum += arr[j][i];
            }
            double avg = sum / 2.0;
            System.out.printf("%.1f ", avg);
        }
        System.out.println();

        // 3. 전체 평균
        int sum = 0;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                sum += arr[i][j];
            }
        }
        double avg = sum / 8.0;
        System.out.printf("%.1f ", avg);
    }
}