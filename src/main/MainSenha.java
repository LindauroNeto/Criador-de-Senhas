package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import password.PasswordCreator;

public class MainSenha {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Quantos digitos você vai querer a sua senha?");
		try {
			int leitor = scanner.nextInt();
			if (leitor > 7) {
				PasswordCreator.generatorShort(leitor);
			} else {
				PasswordCreator.generatorDefault(leitor);
			}
			PasswordCreator.showPassword();
		} catch (InputMismatchException ime) {
			System.out.println("Valor inválido.");
		} finally {
			scanner.close();
		}
	}

}