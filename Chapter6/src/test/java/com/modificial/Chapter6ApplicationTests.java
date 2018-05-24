package com.modificial;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter6ApplicationTests {
@Autowired
private RestTemplate restTemplate;
	@Test
	public void contextLoads() {
		long start=System.currentTimeMillis();
			String url="https://api.xiaofeitongbao.com/xft/hello?token=c4daa36a7b464b4388045ca8fe0977ba";
			System.out.println(restTemplate.getForObject(url,String.class));
			long end=System.currentTimeMillis();
		System.out.println(end-start);
	}
@Test
	public void test() throws IOException {
//	RequestConfig.Builder requestBuilder = RequestConfig.custom();//4.3.5版本
//	requestBuilder = requestBuilder.setConnectTimeout(5000);
//	requestBuilder = requestBuilder.setConnectionRequestTimeout(100);
//
//	HttpClientBuilder builder = HttpClientBuilder.create();
//	builder.setDefaultRequestConfig(requestBuilder.build());
//	CloseableHttpClient httpClient = builder.build();
//	HttpPost post = new HttpPost("http://172.19.136.192:8088/app/brandStatList");
//	ResponseHandler<String> responseHandler = new BasicResponseHandler();
//	post.setHeader("Content-type","application/x-www-form-urlencoded");
//    post.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
//	post.setEntity(new StringEntity("nihao","UTF-8"));
//	String response=httpClient.execute(post,responseHandler);
//	System.out.println(response);
//	post.releaseConnection();
    CloseableHttpClient client = HttpClients.createDefault();
    //创建post方式请求对象
    HttpPost httpPost=new HttpPost("http://172.19.136.192:8088/xft/app/brandStatList?token=13a0d6615f214e2485e03b11f6d2edba");
    httpPost.addHeader("Content-Type","application/json");
    HttpResponse httpResponse=client.execute(httpPost);
    System.out.println(httpResponse.getStatusLine());
}
}
