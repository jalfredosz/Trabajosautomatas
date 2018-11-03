package Proyecto;
public class Principal {

	public static void main(String[] args) {
		
		arbolito ae = new arbolito(); 
        String expresion = "ABC*+"; 
        char[] charArray = expresion.toCharArray(); 
        Nodo raiz = ae.constructTree(charArray); 
        System.out.println("La expresion es: "+expresion);
        System.out.println("-------------------Recorridos------------------------"); 
        System.out.println("Recorrido InOrden:\n");
        ae.inorder(raiz); 
        System.out.println("\nRecorrido PreOrden:\n");
        ae.Preorder(raiz);
        System.out.println("\nRecorrido PostOrden:\n");
        ae.Postorder(raiz);
	}

}
