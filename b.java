import java.math.*;
public class b {

	public static void main (String args[]) {

		int v[][] = new int [3][3];

		int i,j,a=0,b=0,c=0,d=5,e=0,f=0;

		for(i=0;i<3;i++) {
	
		     for(j=0;j<3;j++) {
	
			v[i][j] = (int) (Math.random()*10);

			}

		}

		for(i=0;i<3;i++) {

			for(j=0;j<3;j++) {

				System.out.print(" ["+v[i][j]+"] ");
				
			}

			System.out.println();

		}
		for(i=0;i<3;i++) {

			for(j=0;j<3;j++) {

				if(v[i][j]>a) {

					a = v[i][j];

					b = i;

					c = j;

				}if(v[i][j]<d) {

					d = v[i][j];

					e = i;

					f = j;

				}
	
			
			}

		}

		System.out.println("O maior valor é "+a+", a linha "+b+", a coluna "+c+".");
		
		System.out.println("O menor valor é "+d+", a linha "+e+", a coluna "+f+".");

	}


}