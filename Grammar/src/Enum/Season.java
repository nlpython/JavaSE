package Enum;

public enum Season {
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "烈日炎炎"),
    AUTUMN("秋天", "硕果累累"),
    WINTER("冬天", "冰天雪地");
    // 属性
    private final String Name;  // 季节名字
    private final String Desc;  // 季节描述

    // 利用构造器对属性进行赋值：
    // 构造器私有化，使外部不能调用这个构造器
    private Season(String Name, String Desc) {
        this.Name = Name;
        this.Desc = Desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "Name='" + Name + '\'' +
                ", Desc='" + Desc + '\'' +
                '}';
    }
}
