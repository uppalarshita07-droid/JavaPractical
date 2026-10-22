import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r1, c1, r2, c2, i, j, k;

        System.out.println("Enter rows and columns of first matrix:");
        r1 = Integer.parseInt(br.readLine());
        c1 = Integer.parseInt(br.readLine());

        System.out.println("Enter rows and columns of second matrix:");
        r2 = Integer.parseInt(br.readLine());
        c2 = Integer.parseInt(br.readLine());

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int result[][] = new int[r1][c2];

        System.out.println("Enter elements of first matrix:");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                a[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                b[i][j] = Integer.parseInt(br.readLine());
            }
        }

        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                for (k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product of the matrices:");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}