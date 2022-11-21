package com.sist.util;
/*
 *   "https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001557?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
 *   +"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001556?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
 *   +"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001558?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
 *   +"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001555?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
 *   +"https://mp-seoul-image-production-s3.mangoplate.com/479607/1013171_1667742567362_1000001468?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
 */
public class MainClass_StringTokenizer_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String image="https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001557?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
        		 +"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001556?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
        		 +"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001558?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
        		 +"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001555?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
        		 +"https://mp-seoul-image-production-s3.mangoplate.com/479607/1013171_1667742567362_1000001468?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
        // 한개를 잘라온다 
        String fImage=image.substring(0,image.indexOf("^"));
        System.out.println(fImage);
        String lImage=image.substring(image.lastIndexOf("^")+1);
        System.out.println(lImage);
	}

}
