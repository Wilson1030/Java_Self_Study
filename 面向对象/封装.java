public class 封装 {
    public static void main(String讲解[] args) {
        /* 
        封装:
            告诉我们如何正确设计对象的属性和方法
        原则:
            对象代表什么, 就得封装什么, 并提供数据对应的行为
        private关键字:
            是一个权限修饰符
            可以修饰成员(成员变量和成员方法)
            被private修饰的成员只能在本类中才能访问
            Example:
                public class GirlFriend {
                    private int age;
                    public void setAge(int a){
                        if(a >= 18 && a <=  50) {
                            age = a;
                        } else {
                            System.out.println("非法数据");
                        }
                    }
                    public int getAge(){
                        return age;
                    }
                }
         */
    }
}
