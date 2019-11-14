package com.mnrc.sales.forecasting.mnrcsalesforecasting.model.forecast;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Forecast response.
 */
public class ForecastResponse {

    @JsonIgnore
    private Map<String,List<UnitDetails>> forecastMap;
    private List<Forecast> forecast = new ArrayList<>();
    private List<UnitDetails> historyDetails;

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    /**
     * Gets forecast map.
     *
     * @return the forecast map
     */
    public Map<String, List<UnitDetails>> getForecastMap() {
        if(null == forecastMap){
            forecastMap = new HashMap<>();
        }
        return forecastMap;
    }

    /**
     * Sets forecast map.
     *
     * @param forecastMap the forecast map
     */
    public void setForecastMap(Map<String, List<UnitDetails>> forecastMap) {
        this.forecastMap = forecastMap;
    }

    /**
     * Gets history details.
     *
     * @return the history details
     */
    public List<UnitDetails> getHistoryDetails() {
        return historyDetails;
    }

    /**
     * Sets history details.
     *
     * @param historyDetails the history details
     */
    public void setHistoryDetails(List<UnitDetails> historyDetails) {
        this.historyDetails = historyDetails;
    }

    @Override
    public String toString() {
        return "ForecastResponse{" +
                "forecastMap=" + forecastMap +
                ", historyDetails=" + historyDetails +
                '}';
    }
}
