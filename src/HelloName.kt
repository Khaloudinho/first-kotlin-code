class HelloName(var name: String){

    init {
        println("L'objet HelloName de nom << $name >> est initialisé")
    }

    fun hello() {
        println("Hello, $name")
    }

}