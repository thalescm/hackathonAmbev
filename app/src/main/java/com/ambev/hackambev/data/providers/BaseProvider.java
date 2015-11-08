package com.ambev.hackambev.data.providers;

import com.ambev.hackambev.data.connection.API;
import com.ambev.hackambev.data.connection.Connector;

import retrofit.Response;


/**
 * Created by thalesmachado on 11/8/15.
 */
public class BaseProvider {

    public static class ConnectionError extends Exception {

        public static String getDefaultErrorMessage() {
            return "Desculpe, algo de errado aconteceu. Tente novemente";
        }

        private String message;

        private ConnectionError(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    protected void checkResponse(Response response) throws ConnectionError {
        if (response.code() == 401) {
            throw new ConnectionError("Você não é autorizado a fazer essa chamada");
        } else if (response.code() == 500) {
            throw new ConnectionError("Desculpe, estamos enfrentando problemas tecnicos, tente novamente mais tarde");
        } else if (response.code() < 200 && response.code() >= 300){
            throw new ConnectionError(ConnectionError.getDefaultErrorMessage());
        }
    }

    protected API getConnector() {
        return Connector.getConnector();
    }
}
