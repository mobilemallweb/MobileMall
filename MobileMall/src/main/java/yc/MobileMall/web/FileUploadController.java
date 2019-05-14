package yc.MobileMall.web;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;

@Controller
public class FileUploadController {
	
	//单文件上传
	@RequestMapping("fileupload")
	@ResponseBody()
	public String fileUpload(@RequestParam("file")MultipartFile file) throws IOException{
		System.err.println("come in!!");
		File fl=new File("e:/"+file.getOriginalFilename());
		BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(fl));
		out.write(file.getBytes());
		out.flush();
		out.close();
		return "ok";
	}
	
	
	//多文件上传
	@RequestMapping("manyfileupload")
	@ResponseBody()
	public String manyfileUpload(HttpServletRequest request) throws IOException{
		List<MultipartFile> files=((MultipartHttpServletRequest)request).getFiles("file");
		
		for(int i=0;i<files.size();i++){
			File fl=new File("e:/"+files.get(i).getOriginalFilename());
			BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(fl));
			out.write(files.get(i).getBytes());
			out.flush();
			out.close();
		}
		
		return "ok";
	}
	
}
