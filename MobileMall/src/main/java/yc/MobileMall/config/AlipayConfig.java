package yc.MobileMall.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016100100637175";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCe0tgS3frQexeQcUVdnvBi/lMP3wOglMJwXdMYxhO7gsh0XRjc+f5TcooFZtvJUJv3segJO+4ZodhP/lGbLs0o4VeHM/pypnVAlxLnmwbpwdCLAJSgiISfk"
    		+ "rWBJZmqeqNWhM78IXmsbz4mv0BBNIqdq9LSnSPyQPHiauDFpT30yT7unSGb+0uAJ6N393qw9S5V7SM85Ua7EA48d0WT1N/feKdj1AGLn/zZXpgP9LnYhRyHMwDPABnizbjnApX6G2MZtBW6mUP6JV8rvEaAdPDI7PtLqY8IG7eeKxpIcHuC8jq+LgUUDHQExy5MPkqASF5CdA6y+0d80"
    		+ "cdNIuXNW1YHAgMBAAECggEBAJ04w0UKEXvIHm+SccRXzkdw0/DmJ8US/dgWSR5BFs+Mi7sFXdOCdk1NGWx3giMrdPoiVzys4urk2Cl37HjeP6G0UN06izZrqa6i3sf/IzzL7BFuJbM08XS12o9aFWA5vu+q0Ouuh7A2/yOEN6tUw9OJgE2V2Tu7JreobZG6HjbuYXTt44kgPWUwS52uyC"
    		+ "Jw/qxm3cdlA0FUmBZtZzFTZ+yOxGRRcieADtiCy88OMH8CanaoD8VUYhjumbrLdesBB02xMWHce5Ju54jTQyfnQSy1kX6Q/3THIkkVrNFcI/daW6dZjral4Di6nu8632LCClJpaNe9flkn1ausBWarbEECgYEA09u6zr5ltJk1THDdfJUMU9luf4F0iQuiom73tzSkNueSxemxI1i3Xta"
    		+ "UjnmdFyxfCaJSWgSGW/0e+LyqYo4pHs070CmYoU0yK7rdWjYgiw31ARJKpcq8jc/VThDxzxAh3ELBRu6cmNutKk/UzXgqiWEJ6o4zHi/MHH+DxFiHgy8CgYEAv+pOXPCKsEbwIISXHuMxgKuKY9h4y817DYdtafqi0gnRY7LHDwfbaZ8nhkn8yOV/ArYVfJRBzkKNe7yH5a0LJiP/bvSnr"
    		+ "+wvwZegCjA+vM+CMFjFX2AqRmPPM048WB3nIio2J1hyx9Spei9K23HlHZRj1J6b6SDtznYLqC13BKkCgYAdsE0da9EU3eN6MtbW/owbs/yoIZwTGG5SFPrh0Z6xkwIeegE40tXflHJ9BM3e0XkAAJ9JvhiWC4KrmMTHyuQ4TMp1AV9CO28scaNTYQJueiY7YDTVxvNlbBqYNges3LXiB/jN"
    		+ "1+JaCW7a3xUTNiO/3LlnBUZklI4l8Dim60ESQQKBgD/Biz78+lYNewCSi9HLEEr6sgLxi0/Jd7PK5eJrTWQRtuo0HkU0CwRPx0Wplrz24Pb5nrHAXwwyt+X/f/YhQq7tDpLB3GNpR4Q85wH7fRwko8+D7i39OI4h4lfdCdcMOBj1hQAVNiyEzbi1tVypvb/R6EheWNVeByKrvLumPv/hAoGBAJnVKlTb4FMG7MLmozkcrAvbc6YA1+Rn2Q6XcWBtfjsD3r0SNRgQnCQA282F3JJRK9mwA4K8BW13X6vtjGXkFBNmrtMOU8kZOTW4PRdiK/wGfN1YMQALJuFQDKYa5+uP2UTOK47iG15KUMspvrVs/m1zAqiBp+0feATrqgv79dQQ";
	
    
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAntLYEt360HsXkHFFXZ7wYv5TD98DoJTCcF3TGMYTu4LIdF0Y3Pn+U3KKBWbbyVCb97HoCTvuGaHYT/5Rmy7NKOFXhzP6cqZ1QJcS55sG6cHQiwCUoIiEn5K1gSWZqn"
    		+ "qjVoTO/CF5rG8+Jr9AQTSKnavS0p0j8kDx4mrgxaU99Mk+7p0hm/tLgCejd/d6sPUuVe0jPOVGuxAOPHdFk9Tf33inY9QBi5/82V6YD/S52IUchzMAzwAZ4s245wKV+htjGbQVuplD+iVfK7xGgHTwyOz7S6mPCBu3nisaSHB7gvI6vi4FFAx0BMcuTD5KgEheQnQOsvtHfNHHTSLlzVtWBwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	//支付界面，（未上云必填）
	public static String return_url = "http://localhost/return_url";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "https://openapi.alipaydev.com/gateway.do";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

