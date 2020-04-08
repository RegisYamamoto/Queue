package com.regis;
import java.util.LinkedList;
import java.util.Queue;

public class Inicio {

	public static void main(String[] args) {
		
		Queue<String> filaDePessoas = new LinkedList<String>();
		
		filaDePessoas.add("Patricia");
		filaDePessoas.add("Gustavo");
		filaDePessoas.add("Renan");
		filaDePessoas.add("José");
		filaDePessoas.add("Marilia");
		filaDePessoas.add("Gabriela");
		filaDePessoas.add("Moises");
		filaDePessoas.add("Alice");
		
		System.out.println(filaDePessoas.poll()); // Pega o primeiro da linha e exclui da fila
		System.out.println(filaDePessoas.peek()); // Pega o primeiro da linha sem excluir da fila
		System.out.println(filaDePessoas.size()); // Pega o tamanho da fila
		System.out.println(filaDePessoas.contains("G")); // Diz se existe a string passada por parâmetro
		System.out.println(filaDePessoas.toArray()[1]); // Pega o registro do índice passado por parâmetro
		
		System.out.println(filaDePessoas);

	}

}