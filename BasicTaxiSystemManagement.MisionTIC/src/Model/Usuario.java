package Model;

public class Usuario {
    private int usuCC;
    private String usuNombre;
    private String usuApellido;
    private String usuEmail;
    
    public Usuario(int usuCC, String usuNombre, String usuApellido, String usuEmail){
        this.usuCC = usuCC;
        this.usuNombre = usuNombre;
        this.usuApellido = usuApellido;
        this.usuEmail = usuEmail;
    }
    
    public int getusuCC(){
        return usuCC; 
   }
    
    public void setusuCC(int usuCC){
        this.usuCC = usuCC;
    }
    
    public String getusuNombre(){
        return usuNombre;
    }
    
    public void setusuNombre(String usuNombre){
        this.usuNombre = usuNombre;
    }
    
     public String getusuApellido(){
        return usuApellido;
    }
     
    public void setusuApellido(String usuApellido){
        this.usuApellido = usuApellido;
    }
    
     public String getusuEmail(){
        return usuEmail;
    }
     
    public void setusuEmail(String usuEmail){
        this.usuEmail = usuEmail;
    }    
}
