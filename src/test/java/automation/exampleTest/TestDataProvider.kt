package automation.exampleTest

import org.testng.annotations.Test
import automation.data.Test1SampleData
import automation.data.Test2SampleData
import utils.DataProviderClass
import kotlin.reflect.full.declaredMemberProperties

class TestDataProvider {
    @Test(priority = 1, dataProvider = "dataProvider", dataProviderClass = DataProviderClass::class)
    fun test1(test1SampleData: Test1SampleData) {
        test1SampleData.javaClass.kotlin.declaredMemberProperties.forEach {
            println("Param ${it.name}  of type ${it.returnType} with value ${it.get(test1SampleData)}")
        }
    }

    @Test(priority = 2, dataProvider = "dataProvider", dataProviderClass = DataProviderClass::class)
    fun test2(test2SampleData: Test2SampleData) {
        test2SampleData.javaClass.kotlin.declaredMemberProperties.forEach {
            println("Param ${it.name}  of type ${it.returnType} with value ${it.get(test2SampleData)}")
        }
    }
}
