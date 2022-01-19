package Interfaz;


public class dec_bin extends operacion {
	
		public void opDB (int b) {
		
			int modulo;
			String c = "";
			
			while(b>0) {
				
				modulo = (b%2);
				
				c=modulo+c;
				
				b=b/2;
			}
			
			super.setresultado(c);
		}
		
}