package io.swagger.repository;

public interface RedisActions {

    public String getHost();

    public void setHost(String host);

    public int getPort();

    public void setPort(int port);
}
