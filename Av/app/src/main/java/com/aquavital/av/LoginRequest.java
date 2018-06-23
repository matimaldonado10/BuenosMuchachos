package com.aquavital.av;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {
//https://192.168.1.14/av/login/login.php
    // "https://aquavital.000webhostapp.com/login/login.php"
    private static final String LOGIN_REQUEST_URL = "https://aquavital.000webhostapp.com/login/login.php";
    private Map<String, String> params;

        public LoginRequest(String username, String password, Response.Listener<String> listener) {
            super(Request.Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("usuario", username);
        params.put("contraseña", password);
    }


    public Map<String, String> getParams() {
        return params;
    }
}
