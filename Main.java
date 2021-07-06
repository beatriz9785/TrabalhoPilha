package application;

public class Main {

	public static void main(String[] args) {
		
		NodeStack <Integer> pilha = new NodeStack<>();//criei uma pilha vazia por enquanto
		
		pilha.push(3);
		pilha.push(4);
		pilha.push(2);
		pilha.push(1);
		pilha.push(5);
		System.out.println("quantidade de itens na pilha: " + pilha.size);
		pilha.pop();
		pilha.pop();
		System.out.println("agora tiramos dois itens..." + pilha.size);
		System.out.println("top: " + pilha.top());
	}

}
