package com.mnrc.sales.forecasting.mnrcsalesforecasting.model.forecast;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

/**
 * The type Unit details.
 */
public class UnitDetails {
    private String salesId;
    private String channelId;
    private String productId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate date;
    private double units;
    private double uppers;
    private double lowers;

    /**
     * Gets sales id.
     *
     * @return the sales id
     */
    public String getSalesId() {
        return salesId;
    }

    /**
     * Sets sales id.
     *
     * @param salesId the sales id
     */
    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    /**
     * Gets channel.
     *
     * @return the channel
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Sets channel.
     *
     * @param channelId the channel
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * Gets product.
     *
     * @return the product
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets product.
     *
     * @param productId the product
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Gets units.
     *
     * @return the units
     */
    public double getUnits() {
        return units;
    }

    /**
     * Sets units.
     *
     * @param units the units
     */
    public void setUnits(double units) {
        this.units = units;
    }

    /**
     * Instantiates a new Unit details.
     *
     * @param channelId the channel
     * @param productId the product
     * @param date    the date
     * @param units   the units
     */
    public UnitDetails(String channelId, String productId, LocalDate date, double units) {
        this.channelId = channelId;
        this.productId = productId;
        this.date = date;
        this.units = units;
    }

    /**
     * Instantiates a new Unit details.
     */
    public UnitDetails() {

    }

    public double getUppers() {
        return uppers;
    }

    public void setUppers(double uppers) {
        this.uppers = uppers;
    }

    public double getLowers() {
        return lowers;
    }

    public void setLowers(double lowers) {
        this.lowers = lowers;
    }

    @Override
    public String toString() {
        return "UnitDetails{" +
                "salesId='" + salesId + '\'' +
                ", channel='" + channelId + '\'' +
                ", product='" + productId + '\'' +
                ", date=" + date +
                ", units=" + units +
                ", uppers=" + uppers +
                ", lowers=" + lowers +
                '}';
    }
}
