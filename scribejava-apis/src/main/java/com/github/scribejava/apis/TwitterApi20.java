package com.github.scribejava.apis;

import com.github.scribejava.core.builder.api.DefaultApi20;

public class TwitterApi20 extends DefaultApi20 {

    protected TwitterApi20() {
    }

    private static class InstanceHolder {
	private static final TwitterApi20 INSTANCE = new TwitterApi20();
    }

    public static TwitterApi20 instance() {
	return InstanceHolder.INSTANCE;
    }

    @Override
    public String getAccessTokenEndpoint() {
	return "";
    }

    @Override
    protected String getAuthorizationBaseUrl() {
	return "";
    }
    
}
