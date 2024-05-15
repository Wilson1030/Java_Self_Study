package 集合;

import java.util.ArrayList;

public class ArrayList讲解 {
    public static void main(String[] args) {
        /* 
        ArrayList的成员方法:    
            1. Boolean add(E e)   添加元素, 返回值表示是否添加成功
            2. boolean remove(E e)   删除指定元素, 返回值表示是否删除成功
            3. E remove(int index)   删除指定索引的元素, 返回被删除元素
            4. E set(int index, E e)   修改指定索引的元素, 返回原来的元素
            5. E get(int index)   获取指定索引的元素
            6. int size()   集合的长度, 也就是集合中元素的个数
         */
        // 1.创建集合的对象
        //泛型: 限定集合中存储数据的类型
        //ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>();
        //打印对象不是地址值, 而是集合中存储数据的内容

        // 2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // 3.删除元素
        boolean result = list.remove("aaaa");
        System.out.println(result);

        String str1 = list.remove(0);
        System.out.println(str1);

        // 4.修改元素
        String str2 = list.set(1, "ddd");
        System.out.println(str2);

        // 5.查询元素
        String str3 = list.get(1);
        System.out.println(str3);

        // 6.获取长度
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
