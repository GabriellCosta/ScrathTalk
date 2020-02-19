import com.google.gson.Gson

enum class TestEnum {
    FIRST,
    SECOND
}

class EnumTypeDTO(
    val type: TestEnum
)

val api = """
        {
          type: FIRST
        }
    """

val gson = Gson()

val result = gson.fromJson<EnumTypeDTO>(api, EnumTypeDTO::class.java)

println("Enum type: ${result.type}")
