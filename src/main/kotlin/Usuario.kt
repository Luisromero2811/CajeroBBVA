class Usuario {
    /*Variables para datos del usuario*/
    var user = ""
    var nip = 0
    constructor(user: String, nip: Int){
        this.user = user
        this.nip = nip
    }
    /*Función para crear usuario nuevo donde pida Nombre y NIP*/
    fun crearUsuario(){
        print("!Bienvenido, creemos una cuenta nueva para ti¡\n")
        print("Inserta por favor tu nombre de usuario \n")
        this.user = readLine().toString()
        print("Ingresa tu NIP, Ojo este dato es importante, así que escoje un número del que puedas recordar \n")
        this.nip = readLine()!!.toInt()
    }
}