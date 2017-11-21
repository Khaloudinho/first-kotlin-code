fun main(args: Array<String>) {

    /*
    val helloName = HelloName("salut")
    helloName.hello()

    println("Hello World !")
    */

    val panier = Panier
    print("Panier => ")
    panier.afficherFruits()

    val panier2 = Panier
    println("** On ajoute une fraise")
    panier2.ajouterUnFruit("Fraise")
    print("Panier 1 => ")
    panier.afficherFruits()
    print("Panier 2 => ")
    panier2.afficherFruits()
    print("** Les deux paniers sont les mêmes car un seul objet a été instancié !")
}