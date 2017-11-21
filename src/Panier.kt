object Panier {

    val fruits: MutableList<String> = mutableListOf("Banane")

    fun ajouterUnFruit(fruit: String) {
        fruits.add(fruit)
    }

    fun afficherFruits(){
        println(fruits)
    }

}