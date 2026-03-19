package EX2;

import java.util.Scanner;

public class Interface{
    Scanner sc = new Scanner(System.in);
    Cliente [] clientDb;
    ContaCorrente [] accountDb;
    public int userSession;
    
    public void chamaInterface(){
        System.out.println("Bem vindo ao banco MAC0321, insira seu CPF para começar: ");
        int clientId = searchCLient(sc.next());
        if(clientId != -1){
            System.out.println("Insira sua senha: ");
            loginHandler(sc.next());
            if(clientDb[userSession].isUserLogged()){
                
            }
        }
    }

    public int searchCLient(String CPF){
        for(int i = 0;i<clientDb.length;i++){
            if(CPF == clientDb[i].getCPF()){
                return i;
            }
        }
        return -1;
    }  

    public void loginHandler (String passsword){
        clientDb[userSession].login(passsword);
    }

    public void logOff(int clientId){
        clientDb[userSession].setIsLogged(false);
    }

    public void exibeContas (){
        int [] associatedAccounts = clientDb[userSession].getAssociatedAccounts();
        for(int i=0; i<associatedAccounts.length; i++){
            System.out.println("----------------------\nCONTA CORRENTE: "+i+"\nSALDO: "+accountDb[associatedAccounts[i]].getSaldo()+"\n----------------------");
        }
    }

    public void exibeOpcoes (){
        System.out.println("SELECIONE UMA DAS OPÇÕES ABAIXO: \n1-Exibir contas\n2-Saque\n3-Deposito\n4-Extrato\n5-Abrir uma conta");
        int option = sc.nextInt();
        switch (option){
            case 1:
                exibeContas();
            break;
            case 2:
            break;
            case 3:
            break;
            case 4:
            break;
            default:
                System.out.println("Insira uma opção valida");
        }
    }
         
}
