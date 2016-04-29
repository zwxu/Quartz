package com.ustc.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class GsonTest {

	public static void main(String[] args) {
		
		String json="{'id':'1001','age':20,'name':'scott','addr':[{'title':'BJ','list':'testing'}]}";
		// TODO Auto-generated method stub
		Map map = new HashMap();

	       

	      
	       Gson gson = new Gson();
	       // Map -> Json

	      map = gson.fromJson(json,Map.class);
	      List<Map> list=(List<Map>) map.get("addr");
	       System.out.println(list.get(0).get("list"));
	}

}
