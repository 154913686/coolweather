package com.coolweather.app.util;

public interface IHttpCallbackListener {
	void onFinish(String response);
	void onError(Exception e);
}
