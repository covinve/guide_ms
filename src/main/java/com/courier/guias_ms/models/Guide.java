package com.courier.guias_ms.models;

import org.springframework.data.annotation.Id;

public class Guide {
    @Id
    private String idGuide;
    private String origin;
    private String countryOrigin;
    private String cityOrigin;
    private String zipcodeOrigin;
    private String destiny;
    private String countryDestiny;
    private String cityDestiny;
    private String zipcodeDestiny;

    public Guide(String idGuide, String origin, String countryOrigin, String cityOrigin, String zipcodeOrigin, String destiny, String countryDestiny, String cityDestiny, String zipcodeDestiny) {
        this.idGuide = idGuide;
        this.origin = origin;
        this.countryOrigin = countryOrigin;
        this.cityOrigin = cityOrigin;
        this.zipcodeOrigin = zipcodeOrigin;
        this.destiny = destiny;
        this.countryDestiny = countryDestiny;
        this.cityDestiny = cityDestiny;
        this.zipcodeDestiny = zipcodeDestiny;
    }

    public String getIdGuide() {
        return idGuide;
    }

    public void setIdGuide(String idGuide) {
        this.idGuide = idGuide;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public String getCityOrigin() {
        return cityOrigin;
    }

    public void setCityOrigin(String cityOrigin) {
        this.cityOrigin = cityOrigin;
    }

    public String getZipcodeOrigin() {
        return zipcodeOrigin;
    }

    public void setZipcodeOrigin(String zipcodeOrigin) {
        this.zipcodeOrigin = zipcodeOrigin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public String getCountryDestiny() {
        return countryDestiny;
    }

    public void setCountryDestiny(String countryDestiny) {
        this.countryDestiny = countryDestiny;
    }

    public String getCityDestiny() {
        return cityDestiny;
    }

    public void setCityDestiny(String cityDestiny) {
        this.cityDestiny = cityDestiny;
    }

    public String getZipcodeDestiny() {
        return zipcodeDestiny;
    }

    public void setZipcodeDestiny(String zipcodeDestiny) {
        this.zipcodeDestiny = zipcodeDestiny;
    }
}
