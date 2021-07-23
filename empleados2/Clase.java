public class Clase {
    private int numero;

    public Clase(int numero) {
        this.numero = numero;
    }

    public class SubClase {
        public int potencia() {
            return numero * numero;
        }
    }
}
