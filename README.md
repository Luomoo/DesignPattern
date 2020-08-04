# 设计模式

### 单例模式
> e.g.  JDK中的Runtime类
1. 饿汉式
    1. 静态常量（type1）
    2. 静态代码块 **推荐**（type2）
2. 懒汉式
    1. 线程不安全（type3）
    2. 线程安全但效率慢（type4）
    3. 双重校验 **推荐**（type5）
    4. 静态内部类 **推荐**（type6）
    5. 枚举实现 **推荐**（type7）
### 工厂模式
1. 简单工厂（simplefactory）
2. 工厂方法（factorymethod）
3. 抽象工厂模式（abstractfactory）
### 建造者模式
1. 建造者（builder）

 