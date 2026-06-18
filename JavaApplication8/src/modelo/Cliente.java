package modelo;


public class Cliente {
    private int ID;
    private String Nome;
    private String CPF;
    private String Email;
    
    public Cliente(){
    }
    
    public Cliente(int ID, String Nome, String CPF, String Email){
         this.ID = ID;
         this.Nome = Nome;
         this.CPF = CPF;
         this.Email = Email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
