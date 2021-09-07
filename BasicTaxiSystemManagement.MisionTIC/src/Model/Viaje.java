package Model;

public class Viaje {
    private int viaId;
    private int usuCC;
    private int conCC;
    private String fecha;
    
    public Viaje(int viaId, int usuCC, int conCC, String fecha){
        this.viaId = viaId;
        this.usuCC = usuCC;
        this.conCC = conCC;
        this.fecha = fecha;
    }

    public int getViaId() {
        return viaId;
    }

     public void setViaId(int viaId) {
        this.viaId = viaId;
    }

    public int getUsuCC() {
        return usuCC;
    }

    public void setUsuCC(int usuCC) {
        this.usuCC = usuCC;
    }

    public int getConCC() {
        return conCC;
    }

    public void setConCC(int conCC) {
        this.conCC = conCC;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
