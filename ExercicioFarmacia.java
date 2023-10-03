package exerciciosLivro;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ExercicioFarmacia {

	public static void main(String[] args) throws Exception {

		/*
		 * Uma farmácia precisa ajustar os preços de seus produtos em
		 * 
		 * 12%. Elabore uma classe que receba o valor do produto e apli- que o
		 * percentual de acréscimo. O novo valor a ser calculado
		 * 
		 * deve ser arredondado para mais ou para menos usando o mé- todo round. A
		 * classe deve também conter um laço de repetição
		 * 
		 * que encerre o programa quando o usuário fornecer o valor zero (0) para o
		 * valor do produto. Dessa forma, o usuário digita o valor do produto, a classe
		 * calcula e mostra o valor com acréscimo, a seguir solicita um novo valor. Esse
		 * processo continua enquanto o valor do produto for diferente de zero; caso
		 * contrário o programa será encerrado.
		 */

		DecimalFormat df = new DecimalFormat("R$ ####.##");

		String valorFormatado;

		Double valor = 0.0;

		Double acrescimo = 1.12;

		do {

			try {

				valor = Double.parseDouble(
						JOptionPane.showInputDialog(null, "Insira um valor que receberá o acréscimo de 12%"));

				if (valor <= 0) {

					throw new Exception("Voce inseriu um valor negativo ou igual a zero ERRO!!");
				}

				else {

					valor *= acrescimo;

					valorFormatado = df.format(Math.round(valor));

					JOptionPane.showMessageDialog(null, "\nValor final = " + valorFormatado);

				}

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null, "Você inseriu dados inválidos ou fechou o programa incorretamente");

			}

		} while (valor > 0);

	}

}
