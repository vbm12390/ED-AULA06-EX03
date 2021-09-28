package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.vinicius.filaDinamica.String.Fila;

public class ImpressoraController {

	public void insereDocumento(Fila f, String documento) {
		f.insert(documento);
	}

	@SuppressWarnings("static-access")
	public void imprime(Fila f) {
		Thread t = new Thread();
		int tamanho = f.size();
		String removido = "";

		if (tamanho == 0) {
			JOptionPane.showMessageDialog(null, "Nenhum Documento na fila de Impressão");
			return;
		}

		try {
			int tempo = (int) ((Math.random() * 1000) + 1000);
			t.sleep(tempo);;
			removido = f.remove();
			System.out.println("#PC:"+removido +" ==> Impresso com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}