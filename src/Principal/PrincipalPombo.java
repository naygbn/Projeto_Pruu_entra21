package Principal;

import java.util.ArrayList;

import entidades.Pruu;
import entidades.UsuarioAdministrador;
import entidades.UsuarioGeral;

public class PrincipalPombo {

	public static void main(String[] args) {

		UsuarioGeral brenda = new UsuarioGeral("Brenda", "brenda@gmail.com", "126752698-74");
		Pruu brendaPruu1 = new Pruu("Oii gente! esse é meu primeiro Pruu :)");
		Pruu brendaPruu2 = new Pruu("Esse é meu segundo Pruu, gostaram?");
		ArrayList<Pruu> pruusdaBrenda = new ArrayList<>();

		pruusdaBrenda.add(brendaPruu1);
		pruusdaBrenda.add(brendaPruu2);
		brenda.setPruus(pruusdaBrenda);

		UsuarioGeral vitor = new UsuarioGeral("Vitor", "vitinho@hotmail.com", "745982310-00");
		Pruu vitorPruu1 = new Pruu("Bom dia galera!");
		Pruu vitorPruu2 = new Pruu("Bora tomar um cafézinho e codar!");
		ArrayList<Pruu> pruusdoVitor = new ArrayList<>();
		pruusdoVitor.add(vitorPruu1);
		pruusdoVitor.add(vitorPruu2);
		vitor.setPruus(pruusdoVitor);

		UsuarioAdministrador nayara = new UsuarioAdministrador("Nayara", "nayaragbn@gmail.com", "05698310478");
		Pruu nayara1 = new Pruu("Oi pessoal!");
		Pruu nayara2 = new Pruu("Saudades do verão né, galera?!");
		ArrayList<Pruu> pruusdaNayara = new ArrayList<>();
		pruusdaNayara.add(nayara1);
		pruusdaNayara.add(nayara2);
		nayara.setPruus(pruusdaNayara);

		ArrayList<UsuarioGeral> listaDeUsuarios = new ArrayList<UsuarioGeral>();
		listaDeUsuarios.add(brenda);
		listaDeUsuarios.add(nayara);
		listaDeUsuarios.add(vitor);

		System.out.println("Todos os  pruus: ");
		for (int i = 0; i < listaDeUsuarios.size(); i++) {
			int qtdPruu = listaDeUsuarios.get(i).getPruus().size();

			for (int j = 0; j < qtdPruu; j++) {
				System.out.println(listaDeUsuarios.get(i).getPruus().get(j).toString());

			}

		}

		System.out.println("\n\nUSUÁRIO ESPECÍFICO: ");
		int qtdPruusBrenda = brenda.getPruus().size();
		System.out.println("Nome: " + brenda.getNome());
		for (int k = 0; k < qtdPruusBrenda; k++) {
			System.out.println(brenda.getPruus().get(k).toString());

		}

		brenda.darLike(vitorPruu2);
		vitor.darLike(brendaPruu2);
		nayara.bloquearPruu(vitorPruu1);

		System.out.println("Todos os  pruus: ");
		for (int i = 0; i < listaDeUsuarios.size(); i++) {
			int qtdPruu = listaDeUsuarios.get(i).getPruus().size();

			for (int j = 0; j < qtdPruu; j++) {
				System.out.println(listaDeUsuarios.get(i).getPruus().get(j).toString());

			}

		}
	}
}
