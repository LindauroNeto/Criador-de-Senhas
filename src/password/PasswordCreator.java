package password;

import java.util.ArrayList;
import java.util.Random;

public class PasswordCreator {
	private static ArrayList<String> organizador = new ArrayList<String>();
	private static Random aleatorio = new Random();
	private static char ranNumber(String opcao) {
		return opcao.charAt(aleatorio.nextInt(opcao.length()));
	};
	// v Insipirado pela Amannitta!!! Não foi feito originalmente por mim!!!!!
	// Confira o repositório dela: https://github.com/Amannitta/Gerador-de-Senhas
	private static String opcoesGeral = "abcçdefghijklmnopqrstuvwxyzABCÇDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$_%&?*§=+¢/\\";
	private static String opcoesLetra = "abcçdefghijklmnopqrstuvwxyzABCÇDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String opcoesMais = "0123456789!@#$_%&?*§=+¢/\\";

	public static void geradorSenha(int qnt) {
		if (qnt > 5) {
			for (int i = 0; i < qnt; i++) {
				organizador.add(Character.toString(ranNumber(opcoesLetra)));
			}

			for (int i = 0; i <= qnt / 3; i++) {
				organizador.set(aleatorio.nextInt(organizador.size() - 1), Character.toString(ranNumber(opcoesMais)));
			}
		} else {
			for (int i = 0; i < qnt; i++) {
				organizador.add(Character.toString(ranNumber(opcoesGeral)));
			}
		}

		for (int i = 0; i < organizador.size(); i++) {
			System.out.print(organizador.get(i));
		}
	}
}