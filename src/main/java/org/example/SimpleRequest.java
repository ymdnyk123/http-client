package org.example;

import org.asynchttpclient.ListenableFuture;
import org.asynchttpclient.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.asynchttpclient.Dsl.asyncHttpClient;

public class SimpleRequest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public void get(String url) {

        logger.info("#############################################");

        try {

            ListenableFuture<Response> res = asyncHttpClient().prepareGet(url).execute();

            Response resa = res.get();

            logger.info(resa.getResponseBody());

            asyncHttpClient().close();

        } catch(Exception e) {

            logger.error(e.getMessage());
        } finally {

            logger.info("#############################################");
        }
    }
}
