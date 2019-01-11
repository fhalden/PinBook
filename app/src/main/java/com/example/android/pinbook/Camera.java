package com.example.android.pinbook;

/**
 * {@link Camera} represents a physical camera in the user inventory.
 * It contains a camera name, a film roll object, and an image resource id.
 */
public class Camera {

    /** Name of the camera */
    private String mCameraName;


    /** Image resource ID for the camera */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Camera object.
     *
     * @param cameraName is the name of the camera.
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Camera(String cameraName, int imageResourceId) {
        mCameraName = cameraName;
        mImageResourceId = imageResourceId;

    }


    /**
     * Get the camera name.
     */
    public String getCameraName() {
        return mCameraName;
    }


    /**
     * Return the image resource ID of the camera.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this camera.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the type of film from the film roll
     */
    public String getFilmType() {
        return "Kodak Portra 120 ISO 400";
    }


    @Override
    public String toString() {
        return "Word{" +
                "mCameraName='" + mCameraName + '\'' +

                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}