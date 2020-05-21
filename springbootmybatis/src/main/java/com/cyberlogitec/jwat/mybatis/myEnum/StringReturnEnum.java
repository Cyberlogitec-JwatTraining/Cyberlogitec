package com.cyberlogitec.jwat.mybatis.myEnum;

public enum StringReturnEnum {
	
	ADD_SUCCESS("Thêm dữ liệu thành công"),
    ADD_FAILED("Thêm dữ liệu thất bại"),
	UPDATE_SUCCESS("Cập nhật dữ liệu thành công"),
	UPDATE_FAILED("Cập nhật dữ liệu thất bại"),
	DELETE_SUCCESS("Xóa dữ liệu thành công"),
	DELETE_FAILED("Xóa dữ liệu thất bại");
	
	private final String text;
	
	private StringReturnEnum(String text) {
		// TODO Auto-generated constructor stub
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}

}
