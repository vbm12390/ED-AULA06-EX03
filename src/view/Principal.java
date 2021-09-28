package view;

import javax.swing.JOptionPane;
import br.edu.fateczl.vinicius.filaDinamica.String.Fila;
import controller.ImpressoraController;

public class Principal {

	public static void main(String[] args) {
		ImpressoraController PrinterControoler = new ImpressoraController();
		Fila f = new Fila();
		String documento = "";
		int opc = 0;
		Boolean validador = true;
		while (validador == true) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Sistema de Impress�o" + "\nSelecione a Op��o Desejada\n"
					+ "1-Inserir Documento\n" + "2-Iniciar Impress�o\n" + "3-Sair "));

			switch (opc) {
			case 1:
				documento = JOptionPane
						.showInputDialog("Para iniciar a impress�o insira o ID do PC e o Nome do Arquivo\n"
								+ "Seguir o seguinte formato\n" + "ID_PC;Nome_Arquivo\n\n" + "Insira o arquivo:");
				if (documento.contains("ID_") && documento.matches(".*\\d.*") && documento.contains(";")) {
					PrinterControoler.insereDocumento(f, documento);
					JOptionPane.showMessageDialog(null, "Enviado a Fila de Impress�o");
				} else {
					JOptionPane.showMessageDialog(null, "Arquivo invalido, Tente novamente");
				}

				break;
			case 2:
				PrinterControoler.imprime(f);
				break;
			case 3:
				validador = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o Invalida");
				break;
			}
		}

	}

}