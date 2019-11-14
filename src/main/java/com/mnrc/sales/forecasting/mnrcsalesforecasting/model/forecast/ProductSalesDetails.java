package com.mnrc.sales.forecasting.mnrcsalesforecasting.model.forecast;

import java.util.List;

/**
 * The type Product sales details.
 */
public class ProductSalesDetails {
    private List<UnitDetails> historUnitDetails;
    private List<UnitDetails> forecastUnitDetails;

    /**
     * Gets histor unit details.
     *
     * @return the histor unit details
     */
    public List<UnitDetails> getHistorUnitDetails() {
        return historUnitDetails;
    }

    /**
     * Sets histor unit details.
     *
     * @param historUnitDetails the histor unit details
     */
    public void setHistorUnitDetails(List<UnitDetails> historUnitDetails) {
        this.historUnitDetails = historUnitDetails;
    }

    /**
     * Gets forecast unit details.
     *
     * @return the forecast unit details
     */
    public List<UnitDetails> getForecastUnitDetails() {
        return forecastUnitDetails;
    }

    /**
     * Sets forecast unit details.
     *
     * @param forecastUnitDetails the forecast unit details
     */
    public void setForecastUnitDetails(List<UnitDetails> forecastUnitDetails) {
        this.forecastUnitDetails = forecastUnitDetails;
    }

    @Override
    public String toString() {
        return "ProductSalesDetails{" +
                "historUnitDetails=" + historUnitDetails +
                ", forecastUnitDetails=" + forecastUnitDetails +
                '}';
    }
}
