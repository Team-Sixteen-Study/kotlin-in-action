package org.example.ch05

/**
 * 5.2.2. all, any, count, find : 컬렉션에 술어 적용
 * 어떤 사람의 나이가 27세 이하인지 판단하는 술어 함수
 */
val canBeInClub27 = {p: Person -> p.age <= 27}
