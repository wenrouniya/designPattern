package pattern.build;

public class CreateBuilder extends Builder {
    Computer computer = new Computer();

    public void createCPU() {

        computer.add("组装了cpu");

    }

    public void createMainborad() {

        computer.add("组装了主板");
    }

    public void createHD() {

        computer.add("组装了硬盘");

    }

    public Computer getComputer() {
        return computer;
    }
}
