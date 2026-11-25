package quanlithuvien;

public class Quanlithuvien {
    public static void main(String[] args) {
        Book sach1 = new Book("B001", "Lap trinh Java", "Nguyen Van A");
        Book sach2 = new Book("B002", "Co so du lieu", "Tran Thi B");
        sach1.hienThi();
        System.out.println("---------------");
        sach2.hienThi();
    }
}