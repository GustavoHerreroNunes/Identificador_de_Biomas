package Identificador_de_Biomas;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class Entrada_Dados {
	
	public static void OpcaoSe(String R, String Vetor[]) {
		for(int x =0; x < Vetor.length; x++) {
			if(R==Vetor[x])
				Vetor[x]="-";
		}
	}

	public static void main(String[] args) {
		String RelevoA[] = {"-","Planaltos","Planice", "Montanha(s)","Cordilheira", "Depress�o"};//Forma��es de Terreno
		String RelevoB[] = {"-", "Rios", "Lagos","Ilhas","Arquipelogos" };//Forma��es Aquaticas	
		String R1 ="", R2 ="", R3 ="";
		int Pos =0;
		
		
		
		
		R1 =(String)JOptionPane.showInputDialog(null, "Qual destas forma��es de Relevo � a 1� mais abundante ?", "Identificador de Biomas", 0,null, RelevoA, RelevoA[0]);
		OpcaoSe(R1, RelevoA);
		
		
		R2 = (String)  JOptionPane.showInputDialog(null, "Qual destas forma��es de Relevo � 2� mais abundante ?", "Identificador de Biomas", 0,null, RelevoA, RelevoA[0]);
		OpcaoSe(R2, RelevoA);
		
		R3 = (String)  JOptionPane.showInputDialog(null, "Qual destas forma��es de Relevo � 2� mais abundante ?", "Identificador de Biomas", 0,null, RelevoA, RelevoA[0]);
		OpcaoSe(R3, RelevoA);

	}

}
