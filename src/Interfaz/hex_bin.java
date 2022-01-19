package Interfaz;

public class hex_bin extends operacion{
	
	public void opDHD(String a){
		
		//Conversion Hexadecimal a decimal
		long suma=0;
		StringBuilder dato = new StringBuilder(a).reverse();
		
		for(int i=0;i<dato.length();i++) {
			if(dato.charAt(i)=='A') {
				suma +=10*(Math.pow(16, i));
			}
			else if(dato.charAt(i)=='B') {
				suma +=11*(Math.pow(16, i));
			}
			else if(dato.charAt(i)=='C') {
				suma +=12*(Math.pow(16, i));
			}
			else if(dato.charAt(i)=='D') {
				suma +=13*(Math.pow(16, i));
			}
			else if(dato.charAt(i)=='E') {
				suma +=14*(Math.pow(16, i));
			}
			else if(dato.charAt(i)=='F') {
				suma +=15*(Math.pow(16, i));
			}
			else {
				suma=suma+Integer.parseInt(""+dato.charAt(i))*(long)Math.pow(16, i);
			}
			
		}
		
		//Conversion Decimal a binario
		long modulo;
		String c = "";
		
		while(suma>0) {
			
			modulo = (suma%2);
			
			c=modulo+c;
			
			suma=suma/2;
		}
		
		
		super.setresultado(c);
		
	}
	}

