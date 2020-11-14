import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 *
 */
public class HttpClient {
    public static void main(String[] args) {
        String url ="http://localhost:8803";
        doGet(url);
    }

    private static void doGet(String url) {
        //创建一个httpclient客户端
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建get请求
        HttpGet httpGet =new HttpGet(url);
        CloseableHttpResponse response =null;
        try {
            //客户端执行get请求
            response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            //输出结果
            System.out.println(EntityUtils.toString(entity));

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            if (response !=null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (httpClient !=null) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }

    }
}
