package com.example.javaweb.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
	private int code;
	private String msg;
	private Object data;
	
	static public Result success() {
		return new Result(200, "success", null);
	}
	
	static public Result success(Object data) {
		return new Result(200, "success", data);
	}
	
	static public Result error ( String msg) {
		return new Result(500, msg, null);
	}
}
