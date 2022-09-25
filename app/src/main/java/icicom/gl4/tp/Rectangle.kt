package icicom.gl4.tp

import java.lang.Math.abs

class Rectangle(var p:Point=Point(0,0), var q :Point=Point(1,1)) {

    override fun toString(): String {
        return( "p=$p  q=$q")
    }
    fun surface():Int{
        return abs(p.x-q.x)*abs(p.y-q.y)
    }
}