package Identificador_de_Biomas;

import javax.swing.JOptionPane;

public class Somatoria_de_Respostas {
	
	public static int RespSoma(String R, String Vetor[]) {
		int R1 =0;
		for(int x =1; x < Vetor.length; x++) {
			if(R==Vetor[x])
				switch(x) {
				case 1:
					R1 = 2;
					break;
				case 2:
					R1 = 3;
					break;
				case 3:
					R1 = 5;
					break;
				case 4:
					R1 = 7;
					break;
				case 5:
					R1 = 11;
					break;
				case 6:
					R1 = 13;
					break;
				case 7:
					R1 = 17;
					break;
				}
						
				
		}
		
		
		
		return R1;
	}
	

	public static void main(String[] args) {
		int Soma = 10;
		String  Resp[] = {"A", "B", "C", "D"}, RespUs = "C", RespUs2 = "D";
		
		Soma += RespSoma(RespUs2, Resp);
		Soma += RespSoma(RespUs, Resp);
		
		JOptionPane.showMessageDialog(null, "Resultado final:" + Soma);
		
	}

}
