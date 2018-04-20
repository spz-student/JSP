package com.bdqn.spz.news.util;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.*;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUpload extends HttpServlet{

	/**
	 * 
	 * @param request
	 * @param name
	 * @return
	 */
	public static boolean upload(HttpServletRequest request,String name){
		try {
			request.setCharacterEncoding("utf-8");
			String uploadFile=request.getSession().getServletContext().getRealPath("");
			//判断请求信息中的内容是否是multipart类型，如果是则进行处理
			boolean isMultipart=ServletFileUpload.isMultipartContent(request);
			if(isMultipart){
				//下面我们需要获得所有的表单元素，在这里所有的表单元素都是一个FileItems
				//的对象，获得所有表单元素的方法是ServletFileUpload的非静态方法，
				//所以需要ServletFileUpload的对象，但是创建该对象需要FileItemFactory工厂
				//对象，但是这个工厂对象是一个接口，它的实现类是DiskFileItemFactory
				FileItemFactory factory=new DiskFileItemFactory();
				ServletFileUpload upload=new ServletFileUpload(factory);
				//有了ServletFileUpload对象就可以调用遍历每一个表单元素即FileItem接口
				//返回list集合
				List<FileItem> items = upload.parseRequest(request);
				for (FileItem item : items) {
					//表单的元素又分为文本和文件。处理之前需要先判断属于哪种类型
					//这就需要调用FileItem的isFormFieId方法. 是文本返回true，否则返回false
					if(item.isFormField()){//是文本
						//获得表单元素的name属性值
						String Name=item.getFieldName();
					}else{//是文件
						//获得上传的文件名
						String fileName=item.getName();//F:\katong.jpg
						String Name=item.getFieldName();
						if(fileName!=null&&!fileName.equals("")&&Name.equals(name)){
							File fullFile=new File(fileName);
							//服务器的绝对路径+katong.jpg
							System.out.println(fullFile.getName());
							File saveFile=new File(uploadFile,fullFile.getName());
							item.write(saveFile);
							return true;
						}
					}
				}
			}	
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return false;
	}
	
	
	/**
	 * 
	 * @param request
	 * @param name
	 * @param wjj
	 * @return
	 */
	public static boolean upload(HttpServletRequest request,String name,String wjj){
		try {
			request.setCharacterEncoding("utf-8");
			String uploadFile=request.getSession().getServletContext().getRealPath(wjj);
			//判断请求信息中的内容是否是multipart类型，如果是则进行处理
			boolean isMultipart=ServletFileUpload.isMultipartContent(request);
			if(isMultipart){
				//下面我们需要获得所有的表单元素，在这里所有的表单元素都是一个FileItems
				//的对象，获得所有表单元素的方法是ServletFileUpload的非静态方法，
				//所以需要ServletFileUpload的对象，但是创建该对象需要FileItemFactory工厂
				//对象，但是这个工厂对象是一个接口，它的实现类是DiskFileItemFactory
				FileItemFactory factory=new DiskFileItemFactory();
				ServletFileUpload upload=new ServletFileUpload(factory);
				//有了ServletFileUpload对象就可以调用遍历每一个表单元素即FileItem接口
				//返回list集合
				List<FileItem> items = upload.parseRequest(request);
				for (FileItem item : items) {
					//表单的元素又分为文本和文件。处理之前需要先判断属于哪种类型
					//这就需要调用FileItem的isFormFieId方法. 是文本返回true，否则返回false
					if(item.isFormField()){//是文本
						//获得表单元素的name属性值
						String fileName=item.getFieldName();
					}else{//是文件
						//获得上传的文件名
						String fileName=item.getName();//F:\katong.jpg
						String Name=item.getFieldName();
						if(fileName!=null&&!fileName.equals("")&&Name.equals(name)){
							File fullFile=new File(fileName);
							//服务器的绝对路径+katong.jpg
							File saveFile=new File(uploadFile,fullFile.getName());
							item.write(saveFile);
							return true;
						}
					}
				}
			}	
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return false;
	}
	
	
	/**
	 * 
	 * @param request
	 * @param name
	 * @param wjj
	 * @param wjm
	 * @return
	 */
	public static boolean upload(HttpServletRequest request,String name,String wjj,String wjm){
		try {
			request.setCharacterEncoding("utf-8");
			String uploadFile=request.getSession().getServletContext().getRealPath(wjj);
			//判断请求信息中的内容是否是multipart类型，如果是则进行处理
			boolean isMultipart=ServletFileUpload.isMultipartContent(request);
			if(isMultipart){
				//下面我们需要获得所有的表单元素，在这里所有的表单元素都是一个FileItems
				//的对象，获得所有表单元素的方法是ServletFileUpload的非静态方法，
				//所以需要ServletFileUpload的对象，但是创建该对象需要FileItemFactory工厂
				//对象，但是这个工厂对象是一个接口，它的实现类是DiskFileItemFactory
				FileItemFactory factory=new DiskFileItemFactory();
				ServletFileUpload upload=new ServletFileUpload(factory);
				//有了ServletFileUpload对象就可以调用遍历每一个表单元素即FileItem接口
				//返回list集合
				List<FileItem> items = upload.parseRequest(request);
				for (FileItem item : items) {
					//表单的元素又分为文本和文件。处理之前需要先判断属于哪种类型
					//这就需要调用FileItem的isFormFieId方法. 是文本返回true，否则返回false
					if(item.isFormField()){//是文本
						//获得表单元素的name属性值
						String fileName=item.getFieldName();
					}else{//是文件
						//获得上传的文件名
						String fileName=item.getName();//F:\katong.jpg
						String Name=item.getFieldName();
						if(fileName!=null&&!fileName.equals("")&&Name.equals(name)){
							File fullFile=new File(fileName);
							fileName=fullFile.getName();
							fileName=fileName.substring(fileName.indexOf('.'));
							System.out.println(fileName);
							//服务器的绝对路径+katong.jpg
							File saveFile=new File(uploadFile,wjm+fileName);
							item.write(saveFile);
							return true;
						}
					}
				}
			}	
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return false;
	}
	
	/**
	 * 
	 * @param request
	 * @param name
	 * @param wjj
	 * @param wjm
	 * @param hzm
	 * @return
	 */
	public static boolean upload(HttpServletRequest request,String name,String wjj,String wjm,String hzm){
		try {
			request.setCharacterEncoding("utf-8");
			String uploadFile=request.getSession().getServletContext().getRealPath(wjj);
			//判断请求信息中的内容是否是multipart类型，如果是则进行处理
			boolean isMultipart=ServletFileUpload.isMultipartContent(request);
			if(isMultipart){
				//下面我们需要获得所有的表单元素，在这里所有的表单元素都是一个FileItems
				//的对象，获得所有表单元素的方法是ServletFileUpload的非静态方法，
				//所以需要ServletFileUpload的对象，但是创建该对象需要FileItemFactory工厂
				//对象，但是这个工厂对象是一个接口，它的实现类是DiskFileItemFactory
				FileItemFactory factory=new DiskFileItemFactory();
				ServletFileUpload upload=new ServletFileUpload(factory);
				//有了ServletFileUpload对象就可以调用遍历每一个表单元素即FileItem接口
				//返回list集合
				List<FileItem> items = upload.parseRequest(request);
				for (FileItem item : items) {
					//表单的元素又分为文本和文件。处理之前需要先判断属于哪种类型
					//这就需要调用FileItem的isFormFieId方法. 是文本返回true，否则返回false
					if(item.isFormField()){//是文本
						//获得表单元素的name属性值
						String fileName=item.getFieldName();
					}else{//是文件
						//获得上传的文件名
						String fileName=item.getName();//F:\katong.jpg
						String Name=item.getFieldName();
						if(fileName!=null&&!fileName.equals("")&&Name.equals(name)){
							//服务器的绝对路径+katong.jpg
							File saveFile=new File(uploadFile,wjm+"."+hzm);
							item.write(saveFile);
							return true;
						}
					}
				}
			}	
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return false;
	}
}
