package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
    private Boolean estadoApertura;
    private Integer codigoCorrecto;

    public CajaFuerte() {
        this.estadoApertura = Boolean.TRUE;
    }

    public boolean estaAbierta() {
        return this.estadoApertura;
    }

    public void cerrar(Integer codigoDeApertura) {
        this.estadoApertura = Boolean.FALSE;
        this.codigoCorrecto = codigoDeApertura;
    }

    public void abrir(Integer codigoDeApertura) {
        if (this.codigoCorrecto.equals(codigoDeApertura)) {
            this.estadoApertura = Boolean.TRUE;
        }
    }
}
