package automation.data

import com.google.gson.annotations.SerializedName

data class TestData(
        @SerializedName("test1SampleData")
        val test1SampleData: ArrayList<Test1SampleData>,
        @SerializedName("test2SampleData")
        val test2SampleData: ArrayList<Test2SampleData>
)

data class Test1SampleData(
        @SerializedName("booleanParam1")
        val booleanParam1: Boolean,
        @SerializedName("booleanParam2")
        val booleanParam2: Boolean,
        @SerializedName("stringParam1")
        val stringParam1: String,
        @SerializedName("stringParam2")
        val stringParam2: String
)

data class Test2SampleData(
        @SerializedName("booleanParam2")
        val booleanParam2: Boolean,
        @SerializedName("intParam2")
        val intParam2: Int,
        @SerializedName("stringParam2")
        val stringParam2: String
)