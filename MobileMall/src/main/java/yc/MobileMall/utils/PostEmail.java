package yc.MobileMall.utils;

import javax.annotation.Resource;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class PostEmail {
	@Resource
	private JavaMailSender jms;
	
	/**
	 * 发送邮件
	 * @param url  接收的邮箱
	 * @param title  邮件标题
	 * @param text  邮件内容
	 */
	public void sendMail(String url,String title,String text){
		SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1023998784@qq.com");   //由谁发送
        message.setTo(url);		//发送给谁
        message.setSubject(title);		//主题
        message.setText(text);			//内容
        jms.send(message);
	}
}
