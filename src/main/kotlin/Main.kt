fun main(args: Array<String>) {
    /*Instancia sobre la clase Cajero*/
    val cajero : Cajero = Cajero()
    /*Instancia sobre la clase Usuario*/
    val usuario : Usuario = Usuario("LuisRomero",281199)
    /*Variables para validar al usuario*/
    val user = usuario.user
    var nip = usuario.nip
    /*Lista de almacenamiento de usuarios creados*/
    var userList = mutableListOf<Usuario>()
    userList.add(usuario)
    var i = 0
    /*Banner de bienvenida a cajero*/
    print("!Bienvenido a su cajero ATM BBVA favorito¡ \n");
    /*Menú de opciones a seleccionar*/
    var opcion = ""
    while (opcion != "s"){
        println("Por favor, Ingrese la opcion que desee usar \n")
        print("a) Deposito a cajero ATM \n")
        print("b) Retiro de Efectivo a cuenta de usuario\n")
        print("c) Crear cuenta de usuario nuevo \n")
        print("d) Depositar a cuenta de usuario \n")
        print("e) Estado de cuenta de usuario \n")
        print("f) Estado del cajero ATM \n")
        print("s) salir de cajero\n")
        print("--------------------------------------------------------- \n")
        opcion = readLine().toString()
        /*Cuando el usuario oprima una acción del menú,
          seleccionara la letra para ejercer la función deseada*/
        when(opcion){
            "a" -> {
                var more = ""
                do {
                    print("Por favor, escoja el tipo de billete a depositar: \n20\n50\n100\n200\n500\n")
                    var sBillete = readLine()!!.toInt()
                    print("Por favor, Ingrese la cantidad de billetes a ingresar de $sBillete \n")
                    var amountAtm = readLine()!!.toInt()
                    cajero.DepositoATM(sBillete, amountAtm)
                    print("¿Desea depositar más billetes? s / n \n")
                    more = readLine().toString()
                }while (more == "s")

            }
            "b" -> {
                print("Por favor, Ingrese su nombre de usuario \n")
                var user = readLine()!!
                var ue = false
                i = 0
                for(u in userList){
                    if ( u.user == user){
                        ue = true
                        break
                    }
                    i ++
                }
                if (ue){
                    print("Por favor, Indique su NIP \n")
                    var nip = readLine()!!.toInt()
                    print("Ingrese la cantidad que desea retirar")
                    var userMoney = readLine()!!.toInt()
                    cajero.RetiroUsuario(userMoney)
                }else print("El usuario $user no existe")
            }
            "c" -> {
                usuario.crearUsuario()
                userList.add(Usuario(user, nip))
                for (i in userList) print("${i.user} \n")
            }
            "d" -> {
                print("Ingrese la cantidad de dinero a depositar \n")
                var userMoney = readLine()!!.toInt()
                cajero.DepositoUsuario(userMoney)
            }
            "e" -> cajero.EstadodineroUsuario()
            "f" -> cajero.EstadodineroATM()
            "s" -> break
            else -> println("Opción no valida \n")
        }
    }
}
