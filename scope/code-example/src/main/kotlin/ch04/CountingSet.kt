package org.example.ch04

/**
 * 4.3.3.클래스 위임 기능을 사용(by)
 * 원소를 추가하려고 시도한 횟수를 기록하는 컬렉션 구현
 */
class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {

    var objectsAdded = 0

    // 다음 처럼 위임을 사용하지않고, 새로운 구현을 제공할 수도 있다. 이때 컴파일러는 해당 오버라이드한 메서드를 사용한다.
    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}