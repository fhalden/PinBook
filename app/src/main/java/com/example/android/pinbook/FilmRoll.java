package com.example.android.pinbook;

import java.util.ArrayList;

public class FilmRoll {

    // The name of the film manufacturer
    private String mFilmManufacturer;

    // The brand of the film
    private String mFilmBrand;

    // The format of the film image (e.g. 35mm, 120, 5x7, 8x12)
    private String mFilmFormat;

    // The ISO value of the film (e.g. 100,200,400,1000)
    private int mFilmISO;



    /**
     * Public constructor of FilmRoll Object
     * @param filmManufacturer is the company name for the manufacturer of the film (e.g. Kodak, Fuji)
     * @param filmBrand is the brand name of the film roll (e.g. Portra, HP4, Delta)
     * @param filmFormat is the physical dimensions of the images on the roll
     * @param filmISO is the ISO value of the film roll
     */

    public FilmRoll (String filmManufacturer, String filmBrand, String filmFormat, int filmISO) {
        mFilmManufacturer = filmManufacturer;
        mFilmBrand = filmBrand;
        mFilmFormat = filmFormat;
        mFilmISO = filmISO;
        ArrayList<Image> imageArrayList = new ArrayList<Image>();
    }

    public String getFilmType() {
        return mFilmManufacturer + " " + mFilmBrand + " " + mFilmFormat + " " + mFilmISO;
    }

}
