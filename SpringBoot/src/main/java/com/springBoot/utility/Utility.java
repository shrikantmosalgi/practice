package com.springBoot.utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class Utility {

	public String UPLOAD_DIR="\\SpringBoot\\src\\main\\resources\\static\\image";
	
	public boolean uploadFile(MultipartFile multipart) {
		boolean f=false;
		try {
			InputStream ips =multipart.getInputStream();
			byte data[]=new byte[ips.available()];
			
			ips.read(data);
			
			FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+File.separator+multipart.getOriginalFilename());
			fos.write(data);
			
			fos.flush();
			fos.close();
			
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
}
