package kg.chinodev.weather;

import com.google.gson.annotations.SerializedName;

//отдельный элемент массива данных
public class CurrentWeatherItem {
    @SerializedName("city_name")
    private String cityName;
    @SerializedName("temp")
    private float temp;
    @SerializedName("wind_cdir_full")
    private String windDir;
    @SerializedName("wind_spd")
    private float windSpeed;
    @SerializedName("sunrise")
    private String sunrise;
    @SerializedName("sunset")
    private String sunset;
    @SerializedName("weather")
    private Weather weather;

    public String getCityName() {
        return cityName;
    }

    public float getTemp() {
        return temp;
    }

    public String getWindDir() {
        return windDir;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public String getSunrise() {
        return sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public Weather getWeather() {
        return weather;
    }
}


//внутренний обьект (с инфой о погоде)
class Weather {
    @SerializedName("description")
    private String description;

    public String getDescription() {
        return description;
    }
}
