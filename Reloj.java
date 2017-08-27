
public class Reloj
{
    private int hora;
    private int minutos;
    private int segundos;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora > 23 || hora < 0) {
            hora = 0;
        }
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos > 60 || minutos < 0) {
            minutos = 0;
        }
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos > 60 || segundos < 0) {
            segundos = 0;
        }
        this.segundos = segundos;
    }

    public void addSegundos() {
        this.setSegundos(this.getSegundos() + 1);

        if (this.getSegundos() >= 60) {
            this.setMinutos(this.getMinutos() + 1);
            this.setSegundos(0);
        }
        if (this.getMinutos() >= 60) {
            this.setHora(this.getHora() + 1);
            this.setMinutos(0);
        }
        if (this.getHora() >= 23) {
            this.setHora(0);
        }

    }

    public void subtractSegundos() {
        this.setSegundos(this.getSegundos() - 1);

        if (this.segundos <= 0) {
            this.setMinutos(this.getMinutos() - 1);
            this.setSegundos(59);
        }
        if (this.minutos <= 0) {
            this.setHora(this.getHora() - 1);
            this.setMinutos(59);
        }
        if (this.getHora() <= 0) {
            this.setHora(23);
        }
    }

    
    public String toString() {
        String horaStr = this.getHora() + "";
        String minStr = this.getMinutos() + "";
        String segStr = this.getSegundos() + "";
        if (this.getHora() <= 9) {
            horaStr = "0" + this.getHora();
        }
        if (this.getMinutos() <= 9) {
            minStr = "0" + this.getMinutos();
        }
        if (this.getSegundos() <= 9) {
            segStr = "0" + this.getSegundos();
        }
        return horaStr + ":" + minStr + ":" + segStr;
    }
}       
    
