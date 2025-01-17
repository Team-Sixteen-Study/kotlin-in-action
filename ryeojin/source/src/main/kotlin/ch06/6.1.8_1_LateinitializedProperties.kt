package ch06.LateinitializedProperties

import org.junit.Before
import org.junit.Test
import org.junit.Assert

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private var myService: MyService? = null

    @Before fun setUp() {
        myService = MyService()
    }

    @Test fun testAction() {
        Assert.assertEquals("foo", myService!!.performAction())
    }
}