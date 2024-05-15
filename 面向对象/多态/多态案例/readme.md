1. 定义狗类
    属性:
        年龄, 颜色
    行为:
        eat(String something) (something表示吃的东西)
        lookHome()
2. 定义猫类
    属性:
        年龄, 颜色
    行为:
        eat(String something) (something表示吃的东西)
        catchMouse()
3. 定义饲养员
    属性:
        姓名, 年龄
    行为:
        keepPet(Dog dog, String something)
            功能: 喂养宠物狗, something表示吃的东西
        keepPet(Cat cat, String something)
            功能: 喂养宠物猫, something表示吃的东西
    生成空参有参构造, set和get方法
4. 定义测试类
    keepPet(Dog dog, String soemthing)打印如下内容:
        年龄为30岁的老王养了一只黑色的2岁的狗
        2岁的黑色的狗两只前腿死死的抱住骨头猛吃
    keepPet(Cat cat, String soemthing)打印如下内容:
        年龄为25岁的老李养了一只灰色的3岁的猫
        3岁的灰色的猫眯着眼睛侧着头吃鱼
5. 最后的代码由自己更改, 用多态将其简化