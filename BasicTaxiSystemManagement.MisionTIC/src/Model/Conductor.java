package Model;

public class Conductor {
    private int usuCC;
    private String vehPlaca;
    
    public Conductor(int usuCC, String vehPlaca){
        this.usuCC = usuCC;
        this.vehPlaca = vehPlaca;
    }

    public int getUsuCC() {
        return usuCC;
    }

    public void setUsuCC(int usuCC) {
        this.usuCC = usuCC;
    }

    public String getVehPlaca() {
        return vehPlaca;
    }

    public void setVehPlaca(String vehPlaca) {
        this.vehPlaca = vehPlaca;
    }    
}
