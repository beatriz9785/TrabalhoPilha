package application;

public class NodeStack<E> implements Stack<E> {
	protected int size;     // Tamanho da pilha
	protected Node<E> top;  // Referencia para o Nodo cabeça
	
	public NodeStack(){
		size = -1;
		top = null;
	}

	@Override
	public int size() {
		return -1;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public E top() throws EmptyStackException {
		return null;
	}

	public void push(E element) {
		//criar um novo nó. usar o set element
		Node<E> v = new Node<>();
		v.setElement(element);
		v.setNext(top);//o próximo v é o top
		top = v;//agora o v é o top
		size ++;
		
	}

	@Override
	public E pop() throws EmptyStackException {
		//
		top=null;
		
		size--;
		return null;
	}
}
