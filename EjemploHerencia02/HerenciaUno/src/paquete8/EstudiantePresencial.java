package paquete8;


public class EstudiantePresencial {

    String numeroCreditos;
    String costoCredito;
    String matriculaPresencial;
    int edad;

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public EstudiantePresencial(String nom, String ape, String iden, int ed){
        numeroCreditos = nom;
        costoCredito = ape;
        matriculaPresencial = iden;
        edad = ed;
    }
    public void establecerNumeroCreditos(String numero) {
        numeroCreditos = numero;
    }

    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(String valor) {
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void establecerMatriculaPresencial(String c) {
        matriculaPresencial = c;
    }
    public void establecerEdad(int c){
        edad = c;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public String obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    // 6. Método obtenerCostoCredito() : Real
    public String obtenerCostoCredito() {
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public String obtenerMatriculaPresencial() {
        return matriculaPresencial;
    }
    public int obtenerEdad(){
        return edad;
    }
     public String toString(){
        
        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %s\n",
                numeroCreditos,
                costoCredito,
                matriculaPresencial,
                edad);
        return cadenaFinal;
    }
}
