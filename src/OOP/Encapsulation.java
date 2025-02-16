package OOP;

public class Encapsulation {
// private thuộc tính
// public phương thức
// truy cập và thay đổi dữ liệu đối tượng thông qua get/set

// bảo vệ, quản lí. Keyword có 7: 
// private: không thể truy cập bên ngoài lớp
// public: truy cập từ bất kì đâu 
// protected: truy cập trong cùng package hoặc subclasses
// defaul: khi không chỉ định phạm vi => các class trong cùng package có thể
// final: thuộc tính hoặc phương thức không thể thay đổi, ghi đè sau khi đã khai báo  

// this: phân biệt từ khóa thuộc tính hoặc phương thức của lớp
// static: thuộc tính hoặc phương thức thuộc về class, không thuộc dối tượng cụ thể
// static có thể truy cập từ bất kì đâu và ảnh hưởng đến cách chia sẻ dữ liệu đến các đối tượng

    private String ex;
    String name = "abc";
    protected Integer number = 333;
    static int exx = 113;
    final String age = "18";

    public Encapsulation() {
    }

    public Encapsulation(String ex) {
        this.ex = ex;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    // lớp trong có thể truy cập thuộc tính của lớp ngoài (nested class,inner class or static class)
    class Ex {
        void displayAge() {
            System.out.println(age);
        }

    }

    // để main có thể gọi phải vừa public vừa static (vì main nằm ngoài package)
    public static class ahihi {
        public void displaySomeThing() {
            System.out.println("gia tri " + exx);
        }


    }

}

