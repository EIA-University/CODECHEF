import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Colores {

	BufferedReader in;
	StringTokenizer st;

	String nextToken() throws IOException {
		if (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(in.readLine());
		return st.nextToken();
	}

	public static void main(String[] args) {
		new Colores().probar();
	}

	public void probar() {
		in = new BufferedReader(new InputStreamReader(System.in));
		int test_case;
		int[] n, m, c;
		try {
			test_case = Integer.parseInt(nextToken());
			m = new int[test_case];
			n = new int[test_case];
			c = new int[test_case];
			for (int i = 0; i < test_case; i++) {
				m[i] = Integer.parseInt(nextToken());
				n[i] = Integer.parseInt(nextToken());
				c[i] = Integer.parseInt(nextToken());
			}
			for (int i = 0; i < test_case; i++) {
				size(m[i], n[i], c[i]);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void size(int m, int n, int c) {
		int j = 1, i = 1, cont = 0;
		while (i <= c && i <= m) {
			j = 1;
			while (j * i <= c && j <= n) {
				if ((i * j) == c) {
					cont++;
				}
				j++;
			}
			i++;
		}
		System.out.println(cont);
	}

}
