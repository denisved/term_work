package com.vedernikov.DTO;

import com.vedernikov.models.BmpData;

public class BmpDataDTO {
    private BmpData bmpData;

    public BmpDataDTO(BmpData bmpData) {
        this.bmpData = bmpData;
    }

    public Integer getId() {
        return bmpData.getId();
    }

    public String getAltitudeValue() {
        return bmpData.getAltitudeValue();
    }

    public String getTemperatureValue() {
        return bmpData.getTemperatureValue();
    }

    public String getPressureValue() {
        return bmpData.getPressureValue();
    }

    public String getRelativePressureValue() {
        return bmpData.getRelativePressureValue();
    }


}
