public class suscripcion {
        //Atributos
        private String tipo;
        private int costo;
        private String periodicidad;

        //Métodos
        //Constructor
        public suscripcion(String tipo, int costo, String periodicidad) {
            this.tipo = tipo;
            this.costo = costo;
            this.periodicidad = periodicidad;
        }

        //Getters
        public String getTipo() {
            return tipo;
        }

        public int getCosto() {
            return costo;
        }

        public String getPeriodicidad() {
            return periodicidad;
        }

        //Setters
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setCosto(int costo) {
            this.costo = costo;
        }

        public void setPeriodicidad(String periodicidad) {
            this.periodicidad = periodicidad;
        }

        //toString
        public String toString(){
            return "\n Tipo " + tipo +
                    "\n Costo " + costo +
                    "\n Periodicidad " + periodicidad + "\n";
        }
}
