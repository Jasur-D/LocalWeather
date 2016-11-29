package uz.inha.iutlab.localweather;


import retrofit.Call;
import retrofit.http.GET;
import uz.inha.iutlab.localweather.POJO.Model;

public interface RestApi {
    @GET("/data/2.5/weather?q=London,uk&appid=19efd92459f655a0bf0714e63d981e9b")
    Call<Model> getWheatherReport();
}
