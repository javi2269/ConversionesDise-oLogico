package Interfaz;

public class oct_bin extends operacion{
	public void opDO(double a){
		
		int i=0;
		long decimal = 0;
		
		while(a!=0) {
			decimal=(long) (decimal+(a % 10)*Math.pow(8, i));
			a/=10;
			i++;
		}
		
		long modulo;
		String c = "";
		
		while(decimal>0) {
			
			modulo = (decimal % 2);
			
			c=modulo+c;
			
			decimal=decimal/2;
		}
		
		super.setresultado(c);
		
	}

}
