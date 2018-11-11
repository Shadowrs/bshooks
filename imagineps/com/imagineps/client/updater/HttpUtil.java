/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.nio.charset.Charset
 *  java.nio.charset.StandardCharsets
 *  java.security.KeyManagementException
 *  java.security.NoSuchAlgorithmException
 *  java.security.SecureRandom
 *  java.security.cert.X509Certificate
 *  javax.net.ssl.KeyManager
 *  javax.net.ssl.SSLContext
 *  javax.net.ssl.SSLSocketFactory
 *  javax.net.ssl.TrustManager
 *  javax.net.ssl.X509TrustManager
 */
package com.imagineps.client.updater;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public final class HttpUtil {
    private static final int CONNECT_TIMEOUT = 60000;
    private static final int READ_TIMEOUT = 30000;

    public static HttpURLConnection getConnection(String spec) throws IOException {
        URL url = new URL(spec);
        HttpURLConnection.setFollowRedirects((boolean)false);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setUseCaches(false);
        connection.setInstanceFollowRedirects(false);
        connection.setDefaultUseCaches(false);
        connection.setAllowUserInteraction(false);
        connection.setConnectTimeout(60000);
        connection.setReadTimeout(30000);
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "*");
        connection.setRequestProperty("Cache-Control", "no-store,max-age=0,no-cache");
        connection.setRequestProperty("Expires", "0");
        connection.setRequestProperty("Pragma", "no-cache");
        connection.connect();
        return connection;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String readText(InputStream ins) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream(10000);
        byte[] arr = new byte[10000];
        try {
            do {
                int x;
                if ((x = ins.read(arr)) <= 0) {
                    byte[] result = out.toByteArray();
                    String string = new String(result, 0, result.length, StandardCharsets.UTF_8);
                    return string;
                }
                out.write(arr, 0, x);
            } while (true);
        }
        finally {
            ins.close();
        }
    }

    public static SSLSocketFactory spoofSSLSocket() {
        TrustManager[] trustManager = new TrustManager[]{new X509TrustManager(){

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        }};
        try {
            SSLContext sslContext = SSLContext.getInstance((String)"TLS");
            sslContext.init(null, trustManager, new SecureRandom());
            return sslContext.getSocketFactory();
        }
        catch (KeyManagementException | NoSuchAlgorithmException cause) {
            throw new RuntimeException("Unable to create SSLContext for TLS algorithm.", (Throwable)cause);
        }
    }

}

