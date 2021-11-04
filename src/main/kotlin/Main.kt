fun main() {
    val p1 = Personaje("Paquito", 1)

    println(p1)
    println(p1.toJson())

    val json1= "{\"nombre\":\"Rodolfo\",\"edad\":2}"
    val p2= Personaje.fromJson(json1)

    println(p2)
    println(p2.toJson())


    var numero = p1.let {
        println("Hola soy un let y tengo dentro a $it")
        it.edad
    }

    var numero2 = with(p1) {
        println("Hola soy un let y tengo dentro a $this")
        edad
    }

    var numero3 = p1.run {
        println("Hola soy un let y tengo dentro a $this")
        edad
    }

    var numero4 = run {
        println("Hola soy un let y tengo dentro a $p1")
        p1.edad
    }

    var p3 = p1.apply {
        println("Hola soy un let y tengo dentro a $p1")
        edad
    }

    var p4 = p1.also {
        println("Hola soy un let y tengo dentro a $p1")
        it.edad
    }

    

}