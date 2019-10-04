package Identificador_de_Biomas;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IndentificadorDeBiomas {
	
	public static void OpcaoSe(String R, String Vetor[]) {
		for(int x =0; x < Vetor.length; x++) {
			if(R==Vetor[x])
				Vetor[x]="-";
		}
	}

	public static void main(String[] args) {
		/*Esse programa se trata de um algoritimo capaz de receber informa��es sobre um ambiente observado e capaz de deduzir qual seria esse ecossitema e inclusive sua localiza��o estimada e possiveis quest�es climaticas */
		int E = JOptionPane.ERROR_MESSAGE;
		int I = JOptionPane.INFORMATION_MESSAGE;
		int W = JOptionPane.WARNING_MESSAGE;
		int Q = JOptionPane.QUESTION_MESSAGE;
		int P = JOptionPane.PLAIN_MESSAGE;
		
		int De = JOptionPane.DEFAULT_OPTION;
		int YN = JOptionPane.YES_NO_OPTION;
		int YNC = JOptionPane.YES_NO_CANCEL_OPTION;
		int OKC = JOptionPane.OK_CANCEL_OPTION;
		
		String RelevoA[] = {"-","Planaltos","Planice", "Montanha(s)","Cordilheira", "Depress�o"};//Primeira forma��o de relevancia, segundo e terceiro
		String RelevoB[] = {"-", "Rios", "Lagos","Ilhas","Arquipelogos" };//Primeira forma��o de relevancia, segundo e terceiro
		
		String Eventos1[] = {"Chuvas de Mon��es", "Tempestade Tropical", "Furacao/Tuf�o/Ciclone","Pular"};//H� a presen�� de algum desses Eventos Climaticos
		String Eventos2[] = {"Presentes e Frequ�ntes", "Presentes mas Ocasionais","Ausentes","Pular"};//Eventos S�smicos
		String Eventos3[] = {"Vulcanismo", "Terremotos","Maremotos", "Fracos sem grandes Eventos S�smicos","Pular"};//Eventos S�smicos
		
		String Clima1[] = {"Quente", "Temperado", "Frio"};
		String Clima2[] = {"-","Equatorial","Tropical �mido", "Tropical Seco", "Semiarido","Arido/Desertico"};
		String Clima3[] = {"-", "Subtropical", "Mediterr�neo", "Maritimo/Oce�nico","Continental"};
		String Clima4[] = {"-", "Frio de altitude", "Polar","Sub�rtico", "Continental"};
		
		String VegetacaoI[] = {"Seca e/ou Mirrada", "�mida e/ou Exuberante","Pular"};
		String VegetacaoS[] = { "-", "Rasteira", "Galhos Retorcidos", "Cactos", "Arbustos","Pular"};
		String VegetacaoU[] = {"-", "�rvores  espa�adas", "Floresta Exuberante", "Floresta Densa", "Arbustos", "Pinheiros", "Gramineas", "Solo Pant�noso","Pular"};
		
		String Animais[] = {"Coala/Canguru", "Urso Polar", "Mico Le�o Dourado", "Girafa","Pular"};
		
		String RA1 ="", RA2 ="", RB1 ="", RB2 ="",
				RB3 ="",  Cli2 ="", Cli3 ="", Cli4 ="", 
				VgS ="", VgU ="" ;
		int Ev1, Ev2, Ev3, Cli1,VgI,An;
		
		Icon BemVindo = new ImageIcon("imagens/Terra1.png");
		Icon Biomas = new ImageIcon("imagens/Biomas.png");
		Icon BioLogo = new ImageIcon("imagens/Logo1.jpg");
		
		int Tela1= 0, R =0; 
		Object options[] = {"Ok", "Sair"}, SouN[] = {"Sim", "N�o"};

		
		//Aqui �
		int AA=1;
		
		switch (AA) {
			case 0://******************************************************************
		
		JOptionPane.showMessageDialog(null, BioLogo, "Biotenolog", P );
		
		JOptionPane.showMessageDialog(null, "Seja Bem vindo ao Identificador de Biomas V.1.0 \n" + "Carregando sistemas...", "Bem Vindo", I, BemVindo);
		
		do {
		R =0;
		Tela1 = JOptionPane.showOptionDialog( null,"                                              Identificador de Biomas \n" +"Esse sistema � capaz de receber as descri��es de qualquer ponto do planeta \n" + "e decifrar qual seria esse ponto, \n" + " mas sendo limitado as seguintes especifica��es de Relevo, Clima e Vegeta��o do ambiente \n"+"         Vegeta��o         |         Clima             |         Relevo            \n"+    "\r\n" + 
				"           Seca                 |             �rido           |        Planaltos         \r\n" + "          Cactos              |        Semi�rido       |         Plan�ce    \r\n" + "         Rasteira             |        Equatorial       |       Montanha(s)\r\n" + "Galhos Retorcidos   |          Tropical         |       Cordilheira\r\n" + "�rvores espa�adas |         Subtropical   |         Vulc�o\r\n" + "Floresta Exuberante|   Frio de Altitude   |        Depres�o\r\n" + "      Floresta Densa    |    Mediterr�neo     |         Rio(s)\r\n" + "         Arbustos            |         Temperado    |         Lago(s)\r\n" + "         Pinheiros            |           Polar              |         Ilha(s)\r\n" + " 		      				            				                    |           �rtico             |     Arquipelogo(s)\r\n" + "                                       |Chuvas de Mons�es|        Penisula\r\n" + "                                       |Tempestade Tropical|\r\n" + "                                       |          Furac�o          |\r\n" + "                                       |		        Tuf�o                 |\r\n" + "                                       |          Ciclone           |\r\n" + "                                       |   Abalo S�smico/Terremoto |", "Identificador de Biomas", De, I, Biomas, options, options[0] );
			switch (Tela1) {
				case 0 :

					break;
				default:
				 R = JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair? ", "Aten��o", De, W, null, SouN, SouN[0]);
					switch (R) {
						case 0 :
							System.exit(0);
					}
					break;
			}
		}while(R>0||R<0);
			break;
			case 1://******************************************************************
		 RA1=  (String)JOptionPane.showInputDialog(null, "Qual destas forma��es de Relevo � 1� principal ?", "Identificador de Biomas", P,null, RelevoA, RelevoA[0]);
		 OpcaoSe(RA1, RelevoA);
		 
		 RA2=  (String)JOptionPane.showInputDialog(null, "Qual destas forma��es de Relevo � 2� principal ?", "Identificador de Biomas", P,null, RelevoA, RelevoA[0]);
		 OpcaoSe(RA2, RelevoA);
		 
		 RB1=  (String)JOptionPane.showInputDialog(null, "Qual destas forma��es Hidrograficas � 1� principal ?", "Identificador de Biomas", P,null, RelevoB, RelevoB[0]);
		 OpcaoSe(RB1, RelevoB);
		 
		 RB2=  (String)JOptionPane.showInputDialog(null, "Qual destas forma��es Hidrograficas  � 2� principal ?", "Identificador de Biomas", P,null, RelevoB, RelevoB[0]);
		 OpcaoSe(RB2, RelevoB);
		 
		 Cli1= JOptionPane.showOptionDialog(null, "Que tipo de clima predomina(tem mais :) na regi�o?", "Identificador de Biomas", De, Q, null, Clima1, Clima1[0]);
		 switch (Cli1) {
		 	case 0:
		 		Cli2= (String)JOptionPane.showInputDialog(null, "Qual destes climas quentes corresponde ao da regi�o?", "Identificador de Biomas", P, null, Clima2, Clima2[0]);
		 		break;
		 	case 1:
		 		Cli3= (String)JOptionPane.showInputDialog(null, "Qual destes climas temperados corresponde ao da regi�o?", "Identificador de Biomas", P, null, Clima3, Clima3[0]);
		 		break;
		 	case 2:
		 		Cli4= (String)JOptionPane.showInputDialog(null, "Qual destes climas frios corresponde ao da regi�o?", "Identificador de Biomas", P, null, Clima4, Clima4[0]);
		 		break;		
		 }
		 
		 VgI = JOptionPane.showOptionDialog(null, "Como classificaria a vegeta��o da regi�o?", "Identificador de Biomas", De, Q, null, VegetacaoI, VegetacaoI[0]);
		 switch (VgI) {
		  case 0:
			  VgS = (String)JOptionPane.showInputDialog(null, "Qual destas caracteristicas da vegeta��o s�o mais presentes na �rea?", "Identifcador de Biomas", Q, null, VegetacaoS, VegetacaoS[0]);
			  break;
		  case 1:
			  VgU = (String)JOptionPane.showInputDialog(null, "Qual destas caracteristicas da vegeta��o s�o mais presentes na �rea?", "Identifcador de Biomas", Q, null, VegetacaoU, VegetacaoU[0]);
			  break;
		 }
		 
		 An = JOptionPane.showOptionDialog(null, "Alguma dessas �pecies esta presente nessa regi�o?", "Identifcador de Biomas", De, Q, null, Animais, Animais[0]);
		 
		 Ev1 = JOptionPane.showOptionDialog(null, "Existe a insid�ncia de algum destes eventos climaticos?", "Identifcador de Biomas", De, Q, null, Eventos1, Eventos1[0]);
		 Ev2 = JOptionPane.showOptionDialog(null, "Existe a insid�ncia de alguma atividade s�smica na regi�o?", "Identifcador de Biomas", De, Q, null, Eventos2, Eventos2[0]);
		 switch (Ev2) {
		 case 0:
			 Ev3 = JOptionPane.showOptionDialog(null, "Existe a insid�ncia de algum destes eventos climaticos?", "Identifcador de Biomas", De, Q, null, Eventos1, Eventos1[0]);
		 }
		 
		 
		break;
		}
		}
		

	}


