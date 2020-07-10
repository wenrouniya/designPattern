建造者模式：将复杂的对象的创建解耦
组成：
    使用builder接口分部创建一个复杂对象的各个部分
    createBuilder类实现builder接口 完成对象各个部分的创建
    Director类用于指定对象创建的顺序或完整创建
    Product类 要创建的复杂对象