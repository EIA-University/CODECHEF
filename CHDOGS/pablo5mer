import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Doges {
	
	BufferedReader in;
	StringTokenizer st;

	String nextToken() throws IOException {
		if (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(in.readLine());
		return st.nextToken();
	}

	public void run() {
		in = new BufferedReader(new InputStreamReader(System.in));
		int test_case;
		double[] v, s;
		try {
			test_case = Integer.parseInt(nextToken());
			s = new double[test_case];
			v = new double[test_case];
		
			for (int i = 0; i < test_case; i++) {
				s[i] = Integer.parseInt(nextToken());
				v[i] = Integer.parseInt(nextToken());
				
			}
			for (int i = 0; i < test_case; i++) {
				time(s[i], v[i]);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	private void time(double s, double v) {
		double rst= s/(v*(1.5)); 
		System.out.println(rst);
		
	}

	public static void main(String[] args) {
		new Doges().run();
	}


}
