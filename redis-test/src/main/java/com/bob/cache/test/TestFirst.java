package com.bob.cache.test;

import redis.clients.jedis.Jedis;

public class TestFirst {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.64.131", 6379);
        jedis.set("bobName","BOB");
        jedis.close();
    }
}
