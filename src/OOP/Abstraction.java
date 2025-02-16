package OOP;

public class Abstraction {
// Abstract Class không thể tạo trực tiếp đối tượng
// Chứa các thuộc tính và hàm triển khai hoặc chưa triển khai
// Lớp kế thừa nếu không phải abstract phải triển khai toàn bộ các abstract method
// Interface chỉ chứa trừu tượng, class implement phải thực triển khai toàn bộ các hàm của interface
// Trừu tượng giúp ẩn đi các chi tiết cài đặt phức tạp và chỉ cung cấp giao diện mà người sử dụng có thể tương tác (dễ mở rộng và bảo trì)

    // abstract có thể implement class và không cần triển khai phương thức nếu không muốn (implements)
    // interface chỉ có thể kế thừa từ một hoặc nhiều interface khác (extends)
    // class chỉ có thể extends 1 class duy nhất nhưng có thể implements nhiều interface
}

abstract class Animal {
    // lớp con kế thừa có thể truy cập thông qua các hàm public
    private String name;

    // Phương thức trừu tượng
    public abstract void sound();

    // Phương thức đã cài đặt
    public void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
    // lớp kế thừa phải triển khai abstract method kế thừa khi nó không phải abstract class
}
