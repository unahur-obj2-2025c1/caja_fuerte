package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CajaFuerteTest {

    private static final int CODIGO_APERTURA = 123;

    @Test
    public void alCrearUnaCajaFuerteDeberiaEstarAbierta() {
        // Preparaci�n - given (dado)
        // Ejecuci�n - when (cuando)
        CajaFuerte caja = cuandoCreoUnaCajaFuerte();
        // Validacci�n - then (entonces)
        entoncesLaCajaFuerteEstaAbierta(caja);
    }

    @Test
    public void alCerrarDeberiaEstarCerrada() {
        CajaFuerte caja = dadoQueExisteCajaFuerte();
        cuandoCierroLaCajaFuerte(caja);
        entoncesLaCajaFuerteEstaCerrada(caja);
    }

    @Test
    public void alAbrirLaCajaFuerteConElCodigoDeCierreDeberiaEstarAbierta() {
        CajaFuerte caja = dadoQueExisteCajaFuerte();
        dadoQueCierroLaCajaFuerte(caja, CODIGO_APERTURA);
        cuandoAbroLaCajaFuerteCon(caja, CODIGO_APERTURA);
        entoncesLaCajaFuerteEstaAbierta(caja);
    }

    @Test
    public void alAbrirLaCajaFuerteConUnCodigoErroneoNoDeberiaAbrirse() {
        CajaFuerte caja = dadoQueExisteCajaFuerte();
        dadoQueCierroLaCajaFuerte(caja, CODIGO_APERTURA);
        cuandoAbroLaCajaFuerteCon(caja, CODIGO_APERTURA + 5);
        entoncesLaCajaFuerteEstaCerrada(caja);
    }

    private void cuandoAbroLaCajaFuerteCon(CajaFuerte caja, Integer codigoDeApertura) {
        caja.abrir(codigoDeApertura);
    }

    private void dadoQueCierroLaCajaFuerte(CajaFuerte caja, Integer codigoDeApertura) {
        caja.cerrar(codigoDeApertura);
    }

    private void entoncesLaCajaFuerteEstaCerrada(CajaFuerte caja) {
        assertFalse(caja.estaAbierta());
    }

    private void cuandoCierroLaCajaFuerte(CajaFuerte caja) {
        caja.cerrar(CODIGO_APERTURA);
    }

    private CajaFuerte dadoQueExisteCajaFuerte() {
        return new CajaFuerte();
    }

    private void entoncesLaCajaFuerteEstaAbierta(CajaFuerte caja) {
        assertTrue(caja.estaAbierta());
    }

    private CajaFuerte cuandoCreoUnaCajaFuerte() {
        return new CajaFuerte();
    }
}
