class Cajero {
    /* Tipos de Billetes */
    var veinte: Int
    var cincuenta: Int
    var cien: Int
    var doscientos: Int
    var quinientos: Int
    /*Usuario Hardcodeado*/
    val usuario: Usuario = Usuario("LuisRomero",281199)
    var newValor = 0
    /*Variable de monto de ATM*/
    var atmMoney: Int = 5000
    /*Variable de monto de cuenta usuario*/
    var userMoney: Int = 0
    /*Objeto billetes con su propiedad*/
    object billetes {
        const val bVeinte = 20
        const val bCincuenta = 50
        const val bCien = 100
        const val bDoscientos = 200
        const val bQuinientos = 500
    }
    constructor(){
        this.veinte = 20
        this.cincuenta = 50
        this.cien = 100
        this.doscientos = 200
        this.quinientos = 500
    }
    /*Función para agregar dinero a cajero ATM, acordé al tipo de billete seleccionado se le sumara su cantidad*/
    fun DepositoATM(billete : Int, cantidad : Int ){
        when(billete){
            /*Agregado de billetes de 20*/
            billetes.bVeinte->{
                veinte += cantidad
                atmMoney += (cantidad * billetes.bVeinte)
            }
            /*Agregado de billetes de 50*/
            billetes.bCincuenta->{
                cincuenta += cantidad
                atmMoney += (cantidad * billetes.bCincuenta)
            }
            /*Agregado de billetes de 100*/
            billetes.bCien->{
                cien += cantidad
                atmMoney += (cantidad * billetes.bCien)
            }
            /*Agregado de billetes de 200*/
            billetes.bDoscientos->{
                doscientos += cantidad
                atmMoney += (cantidad * billetes.bDoscientos)
            }
            /*Agregado de billetes de 500*/
            billetes.bQuinientos->{
                quinientos += cantidad
                atmMoney += (cantidad * billetes.bQuinientos)
            }
            else ->{
                println("Billete no valido para ingresar!!")
            }
        }
    }
    /*Función para agregar dinero a cuenta de usuario*/
    fun DepositoUsuario(newAmount: Int){
        userMoney += newAmount
    }
    /*Función para restar dinero a cuenta de usuario*/
    fun RetiroUsuario (subtract: Int){
        userMoney -= subtract
        print("Retiro Exitoso!! \n Saldo: $userMoney")
    }
    /*Función para mostrar status de dinero de usuario*/
    fun EstadodineroUsuario(){
        print("Su saldo es: $userMoney \n")
    }
    /*Función para mostrar status de dinero de ATM*/
    fun EstadodineroATM (){
        println("El cajero tiene un monto de: $$atmMoney")
    }
}