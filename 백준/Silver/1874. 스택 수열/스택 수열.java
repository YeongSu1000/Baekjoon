import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] sequence = new int[n];
        int[] arr = new int[n];
        int[] stack = new int[n];
        int stackEnd = 0;
        int stackSize = 0;
        int sequenceStart = 0;
        int arrStart = 0;

        for (int i = 0; i < n; i++) {
            sequence[i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        char[] out = new char[n * 2];
        int outIndex = 0;
        boolean yes = true;

        while (arrStart < n) {
            if (stackSize == 0) {
                stack[stackEnd] = sequence[sequenceStart];
                out[outIndex] = '+';
                outIndex++;
                stackSize++;
            }
            if (stack[stackEnd] == arr[arrStart]) {
                arrStart++;
                stackSize--;
                if (stackEnd > 0) {
                    stackEnd--;
                } else {
                    sequenceStart++;
                }
                out[outIndex] = '-';
                outIndex++;
            } else {
                stackSize++;
                stackEnd++;
                sequenceStart++;
                if(sequenceStart == n){
                    yes = false;
                    break;
                }
                stack[stackEnd] = sequence[sequenceStart];
                out[outIndex] = '+';
                outIndex++;
            }

            if (arrStart == n) {
                if (stackSize != 0) {
                    yes = false;
                }
                break;
            }
        }

        if (yes) {
            for (int i = 0; i < outIndex; i++) {
                bw.write(out[i] + "\n");
            }
        } else {
            bw.write("NO");
        }

        bw.close();
    }
}