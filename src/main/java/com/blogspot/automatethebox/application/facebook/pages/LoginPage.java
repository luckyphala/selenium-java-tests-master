package com.blogspot.automatethebox.application.facebook.pages;

/**
 * @author Lalit Kumar Narnaulia
 * https://automatethebox.blogspot.com
 */
public interface LoginPage {
    String APP_URL = "http://www.facebook.com";
    String APP_TITLE_STRING = "Facebook".toLowerCase();

    /**
     * Login to Facebook application successfully.
     *
     * @param emailOrPhone user login email address or phone number
     * @param password     user password
     */
    public HomePage loginAs(String emailOrPhone, String password);
}
