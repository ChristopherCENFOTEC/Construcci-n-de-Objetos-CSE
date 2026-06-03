public class Cliente {
        //Atributos
        private String nombre;
        private String apellidos;
        private String cedula;
        private String sexo;
        private String ubicacion;

        //Métodos
        //Constructor
        public Cliente(String nombre, String apellidos, String cedula, String sexo, String ubicacion) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.cedula = cedula;
            this.sexo = sexo;
            this.ubicacion = ubicacion;
        }

        public Cliente(String nombre, String apellidos, String cedula, String ubicacion) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.cedula = cedula;
            this.ubicacion = ubicacion;
        }

        public Cliente(){}

    public void suscribirse(suscripcion actual) {
        System.out.println(nombre + " " + apellidos +" adquirió la suscripción " + actual.getTipo() + ".");
    }

        //Getters
        public String getNombre() {
            return nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public String getCedula() {
            return cedula;
        }

        public String getSexo() {
            return sexo;
        }

        public String getUbicacion() {
            return ubicacion;
        }

        //Setters
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public void setUbicacion(String ubicacion) {
            this.ubicacion = ubicacion;
        }

        // Equals
        public boolean equals(Cliente cliente){
            return cedula.equals(cliente.cedula);
        }

        //toString
        public String toString(){
            return "\n Nombre " + nombre +
                    "\n Apelllidos " + apellidos +
                    "\n Cédula " + cedula +
                    "\n Sexo " + sexo +
                    "\n Ubicación " + ubicacion + "\n";
        }
}
