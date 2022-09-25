package icicom.gl4.tp

class admin (email: String, private var password: String, override var age: Int):User(email,password,age){
    override fun myFunction(){
        super.myFunction()
        println("admin is having fun")
    }

}