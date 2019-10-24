import java.util.Scanner;
public class a {
	public static void main(String[] args) {
		int v[][] = new int [4][4];
		int i,j,a=2;
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				v[i][j]=a;
				a=a*2;
			}
		}
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.print(" ["+v[i][j]+"] ");				
			}
			System.out.println();
		}
	}

}

