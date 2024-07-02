package password;

import java.util.ArrayList;
import java.util.Random;

public class PasswordCreator {
	private static ArrayList<String> organizador = new ArrayList<String>();
	private static Random aleatorio = new Random();
	private static char ranNumber(String opcao) {
		return opcao.charAt(aleatorio.nextInt(opcao.length()));
	};

	public static void showPassword() {
		for (int i = 0; i < organizador.size(); i++) {
			System.out.print(organizador.get(i));
		}
	}

	public static void generatorDefault(int qnt) {
		for (int i = 0; i < qnt; i++) {
			organizador.add(Character.toString(ranNumber(PasswordValues.opcoesGeral)));
		}
	}

	public static void generatorShort(int qnt) {
		// Construção da senha primeiramente com letras
		for (int i = 0; i < qnt; i++) {
			organizador.add(Character.toString(ranNumber(PasswordValues.opcoesLetra)));
		}

		// Segundo momento que em que a senha vai ter 1/3 dos caracteres convertidos em símbolos e números
		for (int i = 0; i <= qnt / 3; i++) {
			organizador.set(aleatorio.nextInt(organizador.size() - 1), Character.toString(ranNumber(PasswordValues.opcoesMais)));
		}
	}
}