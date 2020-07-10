package pattern.build;

public class Pattern {

    public static void main(String[] args) {
        Director director = new Director();//找到一家店可以组装电脑
        Builder builder = new CreateBuilder();
        director.create(builder);
        Computer computer = builder.getComputer();
        computer.showComputer();


    }
}
