package pe.ffernacu.sealed;

import pe.ffernacu.sealed.service.PagoNoProcesado;
import pe.ffernacu.sealed.service.PagoProcesado;
import pe.ffernacu.sealed.usecase.PagoUseCase;
import pe.ffernacu.sealed.usecase.ValidarPagoUseCase;


public class Main
{
    public static void main(String[] args)
    {
        procesarPago();
        //validarPago();
    }

    /**
     * @procesarPagoUseCase solo permite intanciar las clases PagoProcesado o PagoNoProcesado
     * cualquier otra clase lanza error de compilacion
     */
    private static void procesarPago() {
        PagoUseCase pagoProcesado = new PagoUseCase(new PagoProcesado());
        pagoProcesado.procesarPago(50.0);
        PagoUseCase pagoNoProcesado = new PagoUseCase(new PagoNoProcesado());
        pagoNoProcesado.procesarPago(50.0);
    }

    private static void validarPago(){
        ValidarPagoUseCase validarPagoUseCase = new ValidarPagoUseCase();
        validarPagoUseCase.validarPago(00.0);
    }

}
