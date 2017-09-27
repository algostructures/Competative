package template.codejam;
import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br;
	static StringTokenizer st;
	static PrintWriter pw;

	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new FileReader(""));
		pw = new PrintWriter(new BufferedWriter(new FileWriter("")));
		final int MAX_CASES = readInt();
		//readLine();
		for(int casenum = 1; casenum <= MAX_CASES; casenum++) {
		    pw.printf("Case #%d: ", casenum);
		    //System.out.println(casenum);
		    pw.println();
		    
		}
		pw.close();
	}
	public static long mod (long a, long b)
	{
	   long ret = a % b;
	   if(ret < 0)
	     ret+=b;
	   return ret;
	}
	public static long mult(long m, long n){
	    return (m*n) % 1000000007;
	}
	public static int readInt() {
		return Integer.parseInt(nextToken());
	}

	public static long readLong() {
		return Long.parseLong(nextToken());
	}

	public static double readDouble() {
		return Double.parseDouble(nextToken());
	}

	public static String nextToken() {
		while(st == null || !st.hasMoreTokens())	{
			try {
				if(!br.ready())	{
					pw.close();
					System.exit(0);
				}
				st = new StringTokenizer(br.readLine());
			}
			catch(IOException e) {
				System.err.println(e);
				System.exit(1);
			}
		}
		return st.nextToken();
	}
	
	

	public static String readLine()	{
		st = null;
		try {
			return br.readLine();
		}
		catch(IOException e) {
			System.err.println(e);
			System.exit(1);
			return null;
		}
	}

}

class util{
		int pow(int a, int b, int MOD) {
		int x = 1, y = a;
		    while(b > 0) {
		        if(b%2 == 1) {
		            x=(x*y);
		            if(x>MOD) x%=MOD;
		        }
		        y = (y*y);
		        if(y>MOD) y%=MOD;
		        b /= 2;
		    }
		    return x;
		}
		 
		int modInverse(int a, int m) {
		    return pow(a,m-2,m);
		}
}
