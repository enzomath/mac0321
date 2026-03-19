package EX2;
public class Cliente {
    public String name;
    private String CPF;
    private String RG;
    private String adress;
    private Boolean isLogged;
    private int [] associatedAccounts;
    private String passsword;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Boolean getIsLogged() {
        return isLogged;
    }
    public void setIsLogged(Boolean isLogged) {
        this.isLogged = isLogged;
    }

    public Boolean isUserLogged (){
        Boolean logged = getIsLogged();
        if(logged == true){
            return true;
        } else  {
            return false;
        }
    }

    public void login (String password){
        if(this.passsword == password){
            setIsLogged(true);
        } else {
            setIsLogged(false);
        }
    }

    public int[] getAssociatedAccounts() {
        return associatedAccounts;
    }
    public void setNewAssociatedAccounts(int newAssociated) {
        this.associatedAccounts[this.associatedAccounts.length] = newAssociated;
    }

}