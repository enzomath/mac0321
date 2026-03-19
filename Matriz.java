import java.util.Scanner;

public class Matriz {
        int dim1;
        int dim2; 
        int [][] matriz; 
        char Id;
        Scanner sc = new Scanner(System.in);

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        Matriz A = new Matriz();
        A.dim1 = Integer.parseInt(args[0]);
        A.dim2 = Integer.parseInt(args[1]);
        A.Id = 'A';
        A.populaMatriz();

        Matriz B = new Matriz();;
        B.dim1 = Integer.parseInt(args[2]);
        B.dim2 = Integer.parseInt(args[3]);
        B.Id = 'B';
        B.populaMatriz();

        A.exibeMatriz();
        B.exibeMatriz();

        int [][] productMatriz;
        Matriz resultado = new Matriz();


        Boolean product = isProductPossible(A.dim2, B.dim1);
        int n;
        if(product==true){
            n = A.dim2;
            productMatriz = new int [A.dim1][B.dim2];
            for(int i=0; i<A.dim1; i++){
                for(int j=0; j<B.dim2; j++){
                    int termo = 0;
                    for(int k=0; k<n; k++){
                        termo += A.matriz[i][k]*B.matriz[k][j];
                    }
                    productMatriz[i][j] = termo;
                }
            }
            resultado.dim1 = A.dim1;
            resultado.dim2 = B.dim2;
            resultado.Id = 'R';
            resultado.matriz = productMatriz;   
            resultado.exibeMatriz();
        }
        sc.close();

    }

    public static Boolean isProductPossible(int columnsA, int rowsB) {
        if(columnsA == rowsB){
            System.out.println("Produto Possível");
            return true;
        } else {
            System.out.println("Não foi possível realizar o produto");
            return false;
        }
    }

    public void populaMatriz (){
        System.out.println("Insira os " + (dim1*dim2) + " dados da Matriz "+Id+" ("+dim1+"x"+dim2+"):");
        matriz = new int[dim1][dim2];
        for(int i=0; i<dim1; i++){
            for(int j=0; j<dim2; j++){
                System.out.println("Linha "+(i+1)+", Coluna "+(j+1)+":");
                int value = sc.nextInt();
                matriz[i][j] = value;
            }
        }        
    }

    public void exibeMatriz(){
        System.out.println("Matriz " +Id+":");
        for(int i=0; i<dim1; i++){
            System.out.print("| ");
            for(int j=0; j<dim2; j++){
                System.out.print(matriz[i][j]+" ");
            }
        System.out.print("|\n");
        }        
    }

    }
