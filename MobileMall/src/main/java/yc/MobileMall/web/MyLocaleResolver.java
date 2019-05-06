package yc.MobileMall.web;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

public class MyLocaleResolver implements LocaleResolver{
	
	/**
	 * 解析区域信息
	 */
	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		String l=request.getParameter("l");
		Locale locale=Locale.getDefault();
		if(! StringUtils.isEmpty(l)){
			String[] ss=l.split("_");
			locale=new Locale(ss[0],ss[1]);
		}
		return locale;
	}

	@Override
	public void setLocale(HttpServletRequest arg0, HttpServletResponse arg1, Locale arg2) {
		// TODO Auto-generated method stub
		
	}
}
