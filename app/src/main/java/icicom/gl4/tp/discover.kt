package icicom.gl4.tp



fun add(a:Int, b : Int=0 ,c:Int=0  , d:Int=0 ,e:Int=0 ): Int {
    // on a ajouté des valeurs par defaut(ci un argument a une valeur par defauts il peut ne pas lui affecter une valeur
    return a+b+c+d+e
}

fun activiteAdd(a:Int ,b:Int ):Int {
    return a+b
}

fun sayMyName(name:String) {
    println(" $name ")
}

fun sayHello(): String="Hello"

fun showList(list: List<String>){
    // Complétez la fonction pour afficher les éléments de la liste
    for( i in 0 .. list.size-1 ){
        print(list[i]+ " ")
    }
}

fun oddNumbersTo10(){
    println("Nombres impaires")
    // Complétez la fonction pour afficher les nombres impairs jusqu'à 10
    for (i in 0..10){
        if (i%2 !=0 ){
            print(" $i ,")
        }
    }
}

fun calcul(a : Int , b:Int , c:String){
    var resultat: Int=0
    when(c){
        "+"-> print(a+b)
        "-"->print(a-b)
        "*"-> print(a*b)
        "/"->print(a/b)
        "%"->print(a%b)
        else -> print ("verifier l'operateur ")
    }
}
private val languages = listOf("python","java","c","c++","c#","kotlin") // Créez une liste ordonnée de plusieurs languages de programation


fun main (argv : Array<String>){
    print ("hello");


    //Les Variables:
    println("**Variables")
        //Variables non-mutables
        val i: Int = 5 ;
        //i+=1; => error : can t be reassigned
        //Varibales mutables
        var j: Int;
        j=1;
        j+=1;

        //Conversion automatique : N'existe pas
        //val k : Double = 6 ; => error
        val k : Double =6.0;
        val x: Int=4;
        val y : Double=x.toDouble()

        val name: String = "Mohamed"
        val age: Int = 27
        val isDeveloper: Boolean = true

        val name1 = "Mohamed"
        val age1 = 27
        val isDeveloper1 = true

        // Null Safety: pour chaque type T , il existe de meme le type T? qui contient les valeurs de T en plus de la valeur null=> eviter le NullPointExceprion
        var a: Int = 3
        //var a = null => error : a ne peut pas prendre la valeur null
        var b:Int? = 3
        b= null
        val s : String? ="amani"
        //val l=s.length => error car s peut etre null et dans ce cas length ne peut pas s appliquer

        var message: String = "My message can possibly be null !"
        println(message.uppercase())

        // l'operateur d'assertion non nul (!!):  convertit toute valeur en un type non nul et lève une exception si la valeur est nulle
        val ss=s!!
        val l=ss.length
        //lateint
        //private lateinit var submitButton: Button => lateint est utilisé pour indiquer à Kotlin qu'on est sur d’initialiser la variable en question, un peu plus tard dans le code

        //String
        val name2 = "Mohamed"
        println("Hello $name2")

    //Les Fonctions
    println("**Functions")
    val valeur1: Int =add(345,1454)
    println(valeur1)
    val valeur2 : Int =add(123,d=23)
    println(valeur2)

    //Les boucles
    println("**Boucles")
    for (i in 0..10 step 2){
        print("$i ")
    }
    println()

    //Les Listes
        //listOf : Permet de créer une liste d’éléments ordonnée et immuable.
        val listOfNames1 = listOf("Jake Wharton", "Joe Birch", "Robert Martin")
        listOfNames1[0] // => Jake Wharton
        //listOfNames1[0] = "Mathieu Nebra"  => ERROR ! List is immutable

        //mutableListOf : Permet de créer une liste d’éléments ordonnée et muable.
        val listOfNames2 = mutableListOf("Jake Wharton", "Joe Birch", "Robert Martin")
        listOfNames2[0] // => Jake Wharton
        listOfNames2[0] = "Mathieu Nebra" // => SUCCESS !

        //setOf : Permet de créer une liste d’éléments désordonnée et immuable.
        val setOfNames3 = setOf("Jake Wharton", "Joe Birch", "Robert Martin")
        setOfNames3.first() // => Jake Wharton
        //setOfNames3.add("Mathieu Nebra")  => ERROR ! Set is immutable

        //mutableSetOf : Permet de créer une liste d’éléments désordonnée et muable.
        val setOfNames4 = mutableSetOf("Jake Wharton", "Joe Birch", "Robert Martin")
        setOfNames4.first() // => Jake Wharton
        setOfNames4.add("Mathieu Nebra") // => SUCCESS !


        println("Languages :")
        showList(languages)
        println("Odd Numbers to 10 :")
        oddNumbersTo10()

    //Les choix et les conditions
    var aa = 10
    var bb = 12

    val result=if (aa > bb){
                    aa++
                    aa
                } else {
                    bb++
                    bb
                }
    println("Result is : $result")
    println("Fonction de calcul")
    calcul(5,20,"*")

}


