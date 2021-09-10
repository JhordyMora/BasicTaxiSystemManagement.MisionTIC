package Model;

public class Vehiculo {
    private String vehPlaca;
    private String vehMarca;
    private String vehModelo;
    private int vehAnhio;
    private int vehCapacidad;
    private String vehColor;
    private int vehKilometros;
    
    public Vehiculo(String vehPlaca, String vehMarca, String vehModelo,
            int vehAnhio, int vehCapacidad, String vehColor, int vehKilometros){
        this.vehPlaca = vehPlaca;
        this.vehMarca = vehMarca;
        this.vehModelo = vehModelo;
        this.vehAnhio = vehAnhio;
        this.vehCapacidad = vehCapacidad;
        this.vehColor = vehColor;
        this.vehKilometros = vehKilometros;
    }

    public String getVehPlaca() {
        return vehPlaca;
    }

    public void setVehPlaca(String vehPlaca) {
        this.vehPlaca = vehPlaca;
    }

    public String getVehMarca() {
        return vehMarca;
    }

    public void setVehMarca(String vehMarca) {
        this.vehMarca = vehMarca;
    }

    public String getVehModelo() {
        return vehModelo;
    }

    public void setVehModelo(String vehModelo) {
        this.vehModelo = vehModelo;
    }

    public int getVehAnhio() {
        return vehAnhio;
    }

    public void setVehAnhio(int vehAnhio) {
        this.vehAnhio = vehAnhio;
    }

    public int getVehCapacidad() {
        return vehCapacidad;
    }

    public void setVehCapacidad(int vehCapacidad) {
        this.vehCapacidad = vehCapacidad;
    }

    public String getVehColor() {
        return vehColor;
    }

    public void setVehColor(String vehColor) {
        this.vehColor = vehColor;
    }

    public int getVehKilometros() {
        return vehKilometros;
    }

    public void setVehKilometros(int vehKilometros) {
        this.vehKilometros = vehKilometros;
    }
    
    
}
