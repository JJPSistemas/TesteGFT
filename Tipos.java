import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Tipos {

	public static void main(String[] args) {
		
		String manha;
		String noite;

		String position[][] = new String[5][3];

		position[0][0] = "Pratos";
		position[1][0] = "Entrada";
		position[2][0] = "Lado";
		position[3][0] = "Bebidas";
		position[4][0] = "Sobremesa";
		position[0][1] = "manha";
		position[1][1] = "Ovos";
		position[2][1] = "Torradas";
		position[3][1] = "Cafe";
		position[4][1] = "Não aplicável";
		position[0][2] = "noite";
		position[1][2] = "Bife";
		position[2][2] = "Batata";
		position[3][2] = "Vinho";
		position[4][2] = "Bolo";

		for (int i=0; i<5; i++) {
			for (int j=0; j<3; j++) {

			}
		}
		
		System.out.println("--------------------------------");
		System.out.print(position[0][0]);
		System.out.print("    |"+position[0][1]);
		System.out.println("        |"+position[0][2]+ "  |");
		System.out.println("--------------------------------");
		System.out.print(position[1][0]);
		System.out.print("   |"+position[1][1]);
		System.out.println("         |"+position[1][2]+ "   |");
		System.out.println("--------------------------------");
		System.out.print(position[2][0]);
		System.out.print("      |"+position[2][1]);
		System.out.println("     |"+position[2][2]+ " |");
		System.out.println("--------------------------------");
		System.out.print(position[3][0]);
		System.out.print("   |"+position[3][1]);
		System.out.println("         |"+position[3][2]+ "  |");
		System.out.println("--------------------------------");
		System.out.print(position[4][0]);
		System.out.print(" |"+position[4][1]);
		System.out.println("|"+position[4][2]+ "   |");
		System.out.println("--------------------------------");
		System.out.println("\n");
		
		Locale locale = new Locale("pt", "BR");
		GregorianCalendar calendar = new GregorianCalendar();
		SimpleDateFormat formatador = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'h'", locale);
		System.out.println(formatador.format(calendar.getTime()));
		
		manha = "Ovos, Torradas, Café";
		noite = "Bife, Batata, Vinho, Bolo";
		
		System.out.println("Entrada: manha, "+position[1][1]+ "," +position[2][1]+ "," +position[3][1]);
		System.out.println("Saída: " + manha);
		
		System.out.println("\n"+formatador.format(calendar.getTime()));
		System.out.println("Entrada: manha, "+position[2][1]+ "," +position[1][1]+ "," +position[3][1]);
		System.out.println("Saída: " + manha);
		
		System.out.println("\n"+formatador.format(calendar.getTime()));
		System.out.println("Entrada: manha, "+position[2][1]+ "," +position[1][1]+ "," +position[3][1]+ "," +position[4][1]);
		System.out.println("Saída: " + manha);
		
		System.out.println("\n"+formatador.format(calendar.getTime()));
		System.out.println("Entrada: manha, "+position[1][1]+ "," +position[2][1]+ "," +position[3][1]+ "," +position[3][1]+ "," +position[3][1]);
		System.out.println("Saída: " + manha);
		
		System.out.println("\n"+formatador.format(calendar.getTime()));
		System.out.println("Entrada: noite, "+position[1][2]+ "," +position[2][2]+ "," +position[3][2]+ "," +position[4][2]);
		System.out.println("Saída: " + noite);
		
		System.out.println("\n"+formatador.format(calendar.getTime()));
		System.out.println("Entrada: noite, "+position[1][2]+ "," +position[2][2]+ "," +position[2][2]+ "," +position[4][2]);
		System.out.println("Saída: " + noite);
		

	}

}
