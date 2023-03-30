package br.com.test.api.via.cep.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class RecuperaCepService {
    public static String recuperaEnderecoCep(Long cep) throws IOException {
        URL url = new URL("https://viacep.com.br/ws/" + cep + "/json/");
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));

        String line = "";

        StringBuilder jsonCep = new StringBuilder();

        while ((line = bufferedReader.readLine()) != null) {
            jsonCep.append(line);
        }
        System.out.println(jsonCep);
        return jsonCep.toString();
    }
}
