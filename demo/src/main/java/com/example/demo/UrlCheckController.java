package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UrlCheckController {
    private final String SITE_IS_UP = "Site is Up";
    private final String SITE_IS_DOWN = "Site is Down";
    private final String INCORRECT_URL = "Incorrect URL";

    @GetMapping("/check")
    public String getURLStatusMessage(@RequestParam String url) {
        String returnMsg = "";

        try {
            URL urlObj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int res_code = conn.getResponseCode() / 100;
            System.out.println(res_code);
            if (res_code != 2 && res_code != 3) {
                returnMsg = SITE_IS_DOWN;
            } else {
                returnMsg = SITE_IS_UP;
            }
        } catch (MalformedURLException e) {
            returnMsg = INCORRECT_URL;
            // e.printStackTrace();
        } catch (IOException e) {
            returnMsg = SITE_IS_DOWN + "io_exception";
            // e.printStackTrace();
        }

        return returnMsg;
    }

}
