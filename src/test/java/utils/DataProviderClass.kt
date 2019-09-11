package utils

import org.testng.annotations.DataProvider
import automation.data.Test1SampleData
import automation.data.Test2SampleData
import automation.data.TestData
import java.lang.reflect.Method

class DataProviderClass {
    @DataProvider(name = "dataProvider")
    fun provideData2(method: Method): Array<Any>? {
        var result: Array<Any>? = null
        val resultAsList = (JsonUtils().resolveJson("src/test/resources/TestData.json", "automation.data.TestData")
                as TestData)
        when (method.name) {
            "test1" -> {
                val array = arrayOfNulls<Test1SampleData>(resultAsList.test1SampleData.size)
                result = (ArrayList(resultAsList.test1SampleData).toArray(array)) as Array<Any>
            }
            "test2" -> {
                val array = arrayOfNulls<Test2SampleData>(resultAsList.test2SampleData.size)
                result = (ArrayList(resultAsList.test2SampleData).toArray(array)) as Array<Any>
            }
        }
        return result
    }
}