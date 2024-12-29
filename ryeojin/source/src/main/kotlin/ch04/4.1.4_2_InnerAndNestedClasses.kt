package ch04.InnerAndNestedClasses

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}

