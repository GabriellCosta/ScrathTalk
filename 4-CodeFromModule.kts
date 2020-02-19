import com.google.gson.JsonElement
import me.tigrao.aegis.network.NetworkClient
import retrofit2.Call
import retrofit2.http.GET

interface Myapi {

    @GET("search/repositories?q=language:kotlin&sort=stars")
    fun fetchRepositoriesAsync(
    ): Call<JsonElement>
}

val api = NetworkClient.getApi(Myapi::class.java)

val result = api.fetchRepositoriesAsync().execute()

println(result.body()?.toString())
