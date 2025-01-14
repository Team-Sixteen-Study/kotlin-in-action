package org.example.ch05

/**
 * 5.1.1. 컬렉션을 직접 검색하는 기능을 직접 작성
 * 가장 연장자를 출력하는 함수
 */
fun findTheOldest(people: List<Person>) {
    var maxAge = 0;
    var theOldest: Person? = null; // 가장 연장자인 사람을 저장
    for (person in people) {
        if(person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }

    println(theOldest);
}