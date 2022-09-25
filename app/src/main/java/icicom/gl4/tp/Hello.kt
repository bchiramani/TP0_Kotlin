package icicom.gl4.tp

import java.lang.Math.pow
import java.lang.Math.sqrt


fun distance(p1:Point,p2:Point): Double {
    return sqrt(pow((p1.x-p2.x).toDouble(),2.0)+pow((p1.y-p2.y).toDouble(),2.0))
}
fun main(argv: Array<String>){
    println("Hello")


    var p1 =Point(10,5)
    var p2 =Point(13,6)
    var distance :Double
    distance =distance(p1,p2)
    println("distance entre les deux points est : $distance ")


    val rectangles= arrayOf(Rectangle(Point(5,3),Point(3,6)),Rectangle(Point(4,4),Point(5,9)),Rectangle(Point(2,4),Point(3,3)),Rectangle())
    var surface : Int ;
    for ( i in 0.. rectangles.size-1 ){
        surface=rectangles[i].surface()
        println ("la surface du rectangle $i est : $surface" )
    }
}
