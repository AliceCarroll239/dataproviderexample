package automation.exampleTest

import org.testng.annotations.Test
import automation.data.Test1SampleData
import automation.data.Test2SampleData
import utils.DataProviderClass

class TestDataProvider {
    @Test(priority = 1, dataProvider = "dataProvider", dataProviderClass = DataProviderClass::class)
    fun test1(test1SampleData: Test1SampleData) {
        println(test1SampleData.stringParam1 + " " + test1SampleData.booleanParam1.toString())
    }

    @Test(priority = 2, dataProvider = "dataProvider", dataProviderClass = DataProviderClass::class)
    fun test2(test2SampleData: Test2SampleData) {
        println(test2SampleData.stringParam2 + " " + test2SampleData.intParam2.toString())
    }
}
