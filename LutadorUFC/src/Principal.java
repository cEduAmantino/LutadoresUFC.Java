
public class Principal {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Magno", "Brazil", 32, 1.77, 69.2, 12, 1, 1);
		l[1] = new Lutador("Rubick", "Inglês", 28, 1.87, 89.2, 15, 2, 4);
		l[2] = new Lutador("Cold", "França", 35, 1.67, 69.2, 11, 5, 1);
		l[3] = new Lutador("Bruske", "Irlanda", 30, 1.82, 86.2, 11, 1, 4);
		l[4] = new Lutador("Yelfiz", "Canadá", 38, 1.88, 84.2, 7, 1, 3);
		l[5] = new Lutador("Belowsk", "Rússia", 23, 1.90, 100.2, 9, 1, 2);
		
		Luta fight01 = new Luta();
		fight01.marcarLuta(l[1], l[3]);
		fight01.lutar();
		l[1].status();
		l[3].status();
	}

}
