package org.ossTest;

import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RedisOperating {
    public static void set(String key,String value){
        Jedis jedis = RedisUtils.getJedis();
        jedis.set(key,value);
        RedisUtils.returnResource(jedis);
    }

    public static Object get(String key){
        long t3 = System.currentTimeMillis();
        Jedis jedis = RedisUtils.getJedis();
        long t4 = System.currentTimeMillis();
        System.out.println("getJedis时间:"+(t4- t3));

        Object value = jedis.get(key);

        RedisUtils.returnResource(jedis);
        return value;
    }

    public static long incr(String key){
        Jedis jedis = RedisUtils.getJedis();
        long l = jedis.incr(key);
        RedisUtils.returnResource(jedis);
        return l;
    }

    public static long decr(String key){
        Jedis jedis = RedisUtils.getJedis();
        long l = jedis.decr(key);
        RedisUtils.returnResource(jedis);
        return l;
    }

    public static void hset(String key, Map<String, String> hash){
        Jedis jedis = RedisUtils.getJedis();
        jedis.hmset(key,hash);
        RedisUtils.returnResource(jedis);
    }

    public static Object hget(String key, String hkey){
        Jedis jedis = RedisUtils.getJedis();
        Object s = jedis.hget(key, hkey);
        RedisUtils.returnResource(jedis);
        return s;
    }

    public static long expire(String key,int second){
        Jedis jedis = RedisUtils.getJedis();
        long l = jedis.expire(key,second);
        RedisUtils.returnResource(jedis);
        return l;
    }

    public static Map<String, String> hgetAll(String key){
        Jedis jedis = RedisUtils.getJedis();
        Map<String, String> map = new HashMap<>();
        map = jedis.hgetAll(key);
        RedisUtils.returnResource(jedis);
        return map;
    }

    public static long hlen(String key){
        Jedis jedis = RedisUtils.getJedis();
        long l = jedis.hlen(key);
        RedisUtils.returnResource(jedis);
        return l;
    }

    public static void hdel(String key, String value){
        Jedis jedis = RedisUtils.getJedis();
        jedis.hdel(key,value);
        RedisUtils.returnResource(jedis);
    }

    public static void del(String key){
        Jedis jedis = RedisUtils.getJedis();
        jedis.del(key);
        RedisUtils.returnResource(jedis);
    }

    public static void lpus(String key,String... value){
        Jedis jedis = RedisUtils.getJedis();
        jedis.lpush(key,value);
        RedisUtils.returnResource(jedis);
    }

    public static List<String> lrange(String key,int start,int end){
        Jedis jedis = RedisUtils.getJedis();
        List<String> list = jedis.lrange(key, start, end);
        RedisUtils.returnResource(jedis);
        return list;
    }

    public static void lrem(String key,String value){
        Jedis jedis = RedisUtils.getJedis();
        jedis.lrem(key, 0, value);
        RedisUtils.returnResource(jedis);
    }

    public static long llen(String key){
        Jedis jedis = RedisUtils.getJedis();
        long size = jedis.llen(key);
        RedisUtils.returnResource(jedis);
        return size;
    }

    public static void main(String[] args) throws IOException {
//        RandomAccessFile randomAccessFile = new RandomAccessFile("/home/super/Business/log/user.log", "rw");
//        FileChannel channel = randomAccessFile.getChannel();
//        ByteBuffer buffer = ByteBuffer.allocate(10);
//        int bytesRead = channel.read(buffer);
//        String out = "";
//        while (bytesRead != -1) {
//            // System.out.println("读取字节数："+bytesRead);
//            // 之前是写buffer，现在要读buffer
//            buffer.flip();
//            // 切换模式，写->读
//            CharBuffer ss = Charset.forName("utf-8").decode(buffer);
//            out += ss;
////            System.out.print(ss);
//            // 这样读取，如果10字节恰好分割了一个字符将出现乱码
//            buffer.clear();// 清空,position位置为0，limit=capacity //  继续往buffer中
//            bytesRead = channel.read(buffer);
//        }
//        randomAccessFile.close();
//        System.out.println(out);
//        System.out.println(1);
//        String ln[] = out.split("\n");
//        System.out.println(ln[1]);
        String a = "ab";
        String b = "a";
        String c = "b";
        String d = b+c;
        System.out.println(d);
        System.out.println(a==d);
        }


}
