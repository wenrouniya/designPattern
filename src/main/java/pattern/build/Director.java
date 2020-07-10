package pattern.build;

/**
 * 负责组装建造者的类
 */
public class Director {

    public  void create(Builder builder){
        builder.createCPU();
        builder.createHD();
        builder.createMainborad();
    }
}
