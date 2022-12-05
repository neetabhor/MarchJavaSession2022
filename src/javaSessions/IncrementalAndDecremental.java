package javaSessions;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		
		// ++ and --
		
		//1.Post Increament -> increase the value later	
		
		int a=1;
		int b=a++;
		System.out.println(a); //2
		System.out.println(b); //1
		
		int m = -99;
		int n = m++;
		System.out.println(m);
		System.out.println(n);
		
		//2.Pre increament  -> immediately increase the value of c 
		int c = 1;
		int d = ++c;
		System.out.println(c);
		System.out.println(d);
		
		int p = -101;
		int q = ++p;
		System.out.println(p);
		System.out.println(q);
		System.out.println(p+q);
		
		//Post decrement -> decrease the value later 
		int h =2;
		int g = h--;
		System.out.println(h);//1
		System.out.println(g);//2
		
		int l = -49;
		int u = l--;
		System.out.println(l);
		System.out.println(u);
		
		// pre decrement -> immediately decrease the value v
		int v=2;
		int z = --v;
		System.out.println(v);
		System.out.println(z);
		
		int t =2;
		System.out.println(t++);
		System.out.println(t);
		
		int o = 3;
		System.out.println(++o);
		System.out.println(o);
		
		int k = 2;
		System.out.println(100 + (k++));
		System.out.println(100 + (++k));
		
		
		
		
		
		
		
		
		
		
	}

}
