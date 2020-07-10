package pattern.build;

/**
 * 组装电脑的建造者
 */
public abstract class Builder {

    public abstract void createCPU();

    public abstract void createMainborad();

    public abstract void createHD();

    public abstract Computer getComputer();

}
