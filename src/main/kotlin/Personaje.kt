import com.google.gson.Gson

class Personaje(var nombre: String, var edad : Int) {

    companion object{               //Todo lo que este dentro de esto es estatico
        fun fromJson(json:String) : Personaje{
            val gson=Gson()
            return gson.fromJson(json, Personaje::class.java)
        }
    }

    fun toJson(): String{
        val gson = Gson()
        return gson.toJson(this)
    }

    override fun toString(): String {
        return "$nombre $edad"
    }

}