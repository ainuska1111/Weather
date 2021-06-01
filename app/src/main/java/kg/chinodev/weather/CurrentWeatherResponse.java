package kg.chinodev.weather;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//данные приходят в виде обьекта, где есть массив данных
public class CurrentWeatherResponse {
    @SerializedName("data") // сами данные
    private List<CurrentWeatherItem> data;
    @SerializedName("count") // количество элементов в data
    private int count;

    public List<CurrentWeatherItem> getData() {
        return data;
    }

    public int getCount() {
        return count;
    }
}
