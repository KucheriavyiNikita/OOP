import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String[] A = in.readLine().split("\\s");
        String[] B = in.readLine().split("\\s");
        for (int i = 0; i < 5; i++) {
            if (Integer.parseInt(A[i]) + Integer.parseInt(B[i]) != 1) {
                out.println("N");
                out.close();
                break;
            }
        }
        out.println("Y");
        out.close();
    }
}