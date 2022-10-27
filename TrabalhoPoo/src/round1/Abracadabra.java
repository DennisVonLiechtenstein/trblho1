package round1;

public class Abracadabra {

	public static void main(String[] args) {
		int A[]={1,2,3,4,5,6,7,8,9,10};
		int B[]=new int[10];
		int result;
		
		for(int i=0;i < A.length;i++) {
			result=A[i]*i;
			B[i]=result;
			
			
			
			System.out.println("Vetor A:"+A[i]+" multiplicado pelo seu indice "+i+" ,resulta no Vetor B,que contera no seu indice "+i+" o valor: "+B[i]);
			
		}

	}

}
