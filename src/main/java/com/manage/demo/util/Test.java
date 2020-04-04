package com.manage.demo.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.OSSClient;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private static String endpoint = "http://oss-cn-shenzhen.aliyuncs.com/";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
    private static String accessKeyId = "LTAI39GscXA3TzaQ";
    private static String accessKeySecret = "DmPvgIQ4yRLmqWand0HEbQG6DWld1I";
    private static String bucketName = "superljc";

    public static void main(String[] args) throws IOException {
        RandomAccessFile randomFile = new RandomAccessFile("/home/super/Business/prodotti.csv", "rw");
        long fileLength = randomFile.length();
        randomFile.seek(fileLength);
        String sss = "1,1/1/1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        randomFile.write(sss.getBytes("utf-8"));
        randomFile.close();
        System.out.println("xxxxxxxxxxxxxxxxxxxxx");

        //csv头
//        RandomAccessFile rf = new RandomAccessFile("/home/super/Business/test.csv", "rw");
//        long fl = rf.length();
//        rf.seek(fl);
//        rf.writeBytes("gid,one,two,three,brand,title,description,discount,price,pro_code,color,size,im");
//        rf.writeBytes("\n");
//        rf.close();

        BufferedReader reader = new BufferedReader(new FileReader("/home/super/Business/prodotti.csv"));
        reader.readLine();
        String address = "my0039/pict/goods/";

        String line = null;
        String gid = "";
        String one = "";
        String two = "";
        String three = "";
        String brand = "";
        String title = "";
        String description = "";
        String discount = "";
        String price = "";
        String pro_code = "";
        String color = "";
        String size = "";
        String im = "";

        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        int i = 0;

        while ((line = reader.readLine()) != null ){
            //去除所有不可见字符
            line = line.replaceAll("\\p{C}", "");
            //将所有“”内的 , 去除
            Pattern p = Pattern.compile("(\".*?),(.*?\")");
            Matcher m = p.matcher(line);
            StringBuffer sb=new StringBuffer();
            while(m.find()){
                m.appendReplacement(sb,m.group().replace(",", " "));

            }
            m.appendTail(sb);

            String ctx[] = sb.toString().split(",");
            int yy = pro_code.hashCode();
            int xx = ctx[8].split("#")[0].hashCode();
            if (!(yy == xx) && !ctx[0].equals("EAN")) {
                if (!gid.equals("")){
                    RandomAccessFile rf1 = new RandomAccessFile("/home/super/Business/test.csv", "rw");
                    long fl1 = rf1.length();
                    rf1.seek(fl1);
                    String s = gid+","+one+","+two+","+three+","+brand+","+title+","+description+","
                            +discount+","+price+","+pro_code+","+color+","+size+","+im;
//                    rf1.writeBytes(gid+","+one+","+two+","+three+","+brand+","+title+","+description+","
//                            +discount+","+price+","+pro_code+","+color+","+size+","+im);
                    rf1.write(s.getBytes("utf-8"));
                    rf1.writeBytes("\r");
                    rf1.close();
                }

                //初始化所有变量
                gid = "";
                one = "";
                two = "";
                three = "";
                brand = "";
                title = "";
                description = "";
                discount = "";
                price = "";
                pro_code = "";
                color = "";
                size = "";
                im = "";

                System.out.println(ctx[9].split("#")[0]);

                System.out.println("开始初始化++++++++++++++++");

                one = ctx[1].split("/")[0];
                two = ctx[1].split("/")[1];
                three = ctx[1].split("/")[2];
                brand = ctx[2];
                title = ctx[3];
                System.out.println(title);
                description = ctx[4];
                discount = ctx[5];
                System.out.println(discount);
                price = ctx[6];
                pro_code = ctx[8].split("#")[0];
                color = ctx[11];
                size = ctx[12];
                im = "";

                set1.add(brand);
                System.out.println(set1.toString());
                set2.add(three);
                System.out.println(set2.toString());
                i++;
                System.out.println("i:"+i);

//                long l = RedisOperating.incr("creategoods");
//                String str = String.format("%08d",l);
//                gid = "goods:"+str;
////              将图片url连接起来
//                for (int i1=20; i<=25; i++){
//                    if(!ctx[i1].equals("") ){
//                        InputStream inputStream = new URL(ctx[i]).openStream();
//                        OSSClient ossClient = new OSSClient(endpoint,accessKeyId, accessKeySecret);
//                        ossClient.putObject(bucketName,address+gid+"/图片"+(i-19)+".jpg",inputStream);
//                        ossClient.shutdown();
//                        Date expiration = new Date(System.currentTimeMillis() + 3600 * 1000 * 24 * 365 * 10L);
//                        String url = ossClient.generatePresignedUrl(bucketName, address+gid+"/图片"+(i-19)+".jpg", expiration).toString();
//                        im += url+"|";
//                        System.out.println(im);
//                        ossClient.shutdown();
//                    }
//                }
            }else {
                //将尺寸拼接起来
                size += ("|"+ctx[12]);
            }

        }

    }
}
