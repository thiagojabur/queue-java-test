package edsExistentes;

import java.util.LinkedList;
import java.util.Queue;

public class principal {

	public static void main(String[] args) {
		
		//Garante ordem de inser��o.
		//N�o faz ordena��o.
		//Adiciona, le e remove: Primeiro que entra, primeiro que sai (FIFO).

		Queue<Object> filaPessoas = new LinkedList<>();

        filaPessoas.add(1);
        filaPessoas.add("Ricardo");
        filaPessoas.add("Jo�o");
        filaPessoas.add("Carla"); 
        
        System.out.println("Fila atual " + filaPessoas); 
		System.out.println("Tamanho da fila " + filaPessoas.size());
        System.out.println("Removi " + filaPessoas.poll()); // 
        System.out.println("Fila atual " + filaPessoas);
                
        //peek() consulta o elemento mas n�o remove
        System.out.println("Consultei " +filaPessoas.peek());         
        System.out.println("Fila atual " + filaPessoas);
        
        //adicionando fila
        filaPessoas.add("Deitel");
        System.out.println("Fila atual " + filaPessoas);
        
        //percorrendo a fila de modo elegante
       // for (String nome: filaPessoas) {
       //    System.out.println(nome);
       // }
        
        //buscando um elemento
        System.out.println("Tem Deitel? " + filaPessoas.contains(" Deitel ".trim()));
        
        //limpando a fila
        filaPessoas.clear();
        
        System.out.println("Fila atual ap�s limpeza da lista " + filaPessoas);
	}

}