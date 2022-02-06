//8 – Escreva um programa Java que tem como objetivo validar se um usuário e senha existem
//no sistema. Se o usuário e senha tiver corretos, o usuário deverá receber uma mensagem de
//acordo com o horário.
//• Se for das 6h as 11h59 da manhã, receberá “Bom dia, você se logou ao nosso sistema.”
//• Se for das 12 has 17h59 da tarde, receberá “Boa tarde, você se logou ao nosso sistema.”
//• Se for das 18h as 23h59 da manhã, receberá “Boa noite, você se logou ao nosso sistema.”
//• Se for das 0h as 05h59 da madrugada, receberá “Boa madrugada, você se logou ao nosso
//sistema.”
//• Se o usuário ou senha for inválidos, deverá exibir a mensagem: “Usuário e/ou senha
//incorretos.”
//Utilizem arrays para armanezar os dados.

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Usuario> users = new ArrayList<>();
		users.add(new Usuario("Rafael", "AmoBia"));
		users.add(new Usuario("Carlos", "0001"));
		users.add(new Usuario("Cielo", "Isabella"));

		System.out.println("Login: ");
		String login = sc.next();
		System.out.println("Senha: ");
		String senha = sc.next();

		boolean valid = false;
		for (Usuario user : users) {
			if (user.equals(login)) {
				if (user.validaSenha(senha)) {
					valid = true;
				}
				break;
			}
		}
		
		if(valid){
			int horaAtual = LocalTime.now().getHour();
			if (horaAtual >= 6 && horaAtual < 12) {
				System.out.println("Bom dia, você se logou ao nosso sistema.");
			} else if (horaAtual >= 12 && horaAtual < 18) {
				System.out.println("Boa tarde, você se logou ao nosso sistema.");
			}else if (horaAtual >= 18) {
				System.out.println("Boa noite, você se logou ao nosso sistema.");
			}else {
				System.out.println("Boa madrugada, você se logou ao nosso sistema.");
			}
		}else {
			System.out.println("Usuário e/ou senha incorretos.");
		}
		
		
		sc.close();
	}

}
