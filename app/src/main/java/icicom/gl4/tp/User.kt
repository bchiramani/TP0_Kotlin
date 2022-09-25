package icicom.gl4.tp

open class User (email: String, private var password: String, open var age: Int){
    var email: String = email


    get() {
        println("User is getting his email.");
        return field
    }
    set(value) {
        println("User is setting his email");
        field = value
        }
    open fun myFunction(){
        println("user is having fun")
    }


}
//visibilité par defaut public
// sinon : private, protected(dans sa classe et ses sous-classes via heritage), internal(le meme module), public

//heritage : pour pouvoir heriter d'une classe il faut qu elle soit declarée "Open"
//modificateur d'accessibilité: final(ne peut pas etre redefinie/ c'est le par defaut), open(peut etre redefinie, abstract(doit etre redefinie)
//"override": utilisé pour redefinie une methode
