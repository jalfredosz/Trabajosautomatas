package Proyecto;
import java.util.Stack;

public class arbolito {
  
    boolean isOperator(char c) { 
        if (c == '+' || c == '-'
                || c == '*' || c == '/'
                || c == '^') { 
            return true; 
        } 
        return false; 
    } 
  
    // Recorrido inorden
    void inorder(Nodo t) { 
        if (t != null) { 
            inorder(t.left); 
            System.out.print(t.value + " "); 
            inorder(t.right); 
        } 
    } 
    //Recorrido Post Orden
    void Postorder(Nodo node) 
    { 
        if (node == null) 
            return; 
        Postorder(node.left); 
  
       
        Postorder(node.right); 
  
       
        System.out.print(node.value + " "); 
    } 
    //Recorrido pre orden
    void Preorder(Nodo node) 
    { 
        if (node == null) 
            return; 
  
    
        System.out.print(node.value + " "); 
  
     
        Preorder(node.left); 
  
       
        Preorder(node.right); 
    } 
  
    // Devuelve la raiz del arbol construido en base a la expresion dada
    Nodo constructTree(char postfix[]) { 
        Stack<Nodo> st = new Stack<Nodo>(); 
        Nodo t, t1, t2; 
  
        // Recorre cada caracter de la expresion
        for (int i = 0; i < postfix.length; i++) { 
  
            // Si es operando, le da un push al stack
            if (!isOperator(postfix[i])) { 
                t = new Nodo(postfix[i]); 
                st.push(t); 
            } else //si es operador
            { 
                t = new Nodo(postfix[i]); 
  
                
                t1 = st.pop();      
                t2 = st.pop(); 
  
                //  los convierte en hijos
                t.right = t1; 
                t.left = t2; 
  
                // Agrega expresion al stack
                st.push(t); 
            } 
        } 
  
       
        t = st.peek(); 
        st.pop(); 
  
        return t; 
}
    
}
