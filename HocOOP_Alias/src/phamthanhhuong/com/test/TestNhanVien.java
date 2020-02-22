package phamthanhhuong.com.test;

import phamthanhhuong.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien nv1=new NhanVien(1,"Obama");
		NhanVien nv2=new NhanVien(2,"Putin");
		nv1=nv2;
		nv2.setTen("Kim Jong Un");
		System.out.println("Tên của Nhân Viên 1 = "+nv1.getTen());
		nv1.setTen("Hồ Cẩm Đào");
		System.out.println("Tên của Nhân Viên 2 = "+nv2.getTen());
	
		NhanVien nv3=new NhanVien(3,"Ông Tèo");
		NhanVien nv4=new NhanVien(4,"Ông Tý");
		nv3=nv4.copy();
		System.out.println("Tên Nhân Viên 3 = "+nv3.getTen());
		nv4.setTen("Thắm");
		System.out.println("Tên Nhân Viên 3 = "+nv3.getTen());
		nv3.setTen("Ali33");
		System.out.println("Tên Nhân Viên 4 = "+nv4.getTen());
		
	}

}
