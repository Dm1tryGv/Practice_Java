package Practice.Practice_2.Задание4;

public class Computer {
    public int RAM;
    public int HDD;
    public int CPC;
    public int GPM;


    public Computer(int RAM, int HDD, int CPC, int GPM){
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPC = CPC;
        this.GPM = GPM;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM=" + RAM +
                ", HDD=" + HDD +
                ", CPC=" + CPC +
                ", GPM=" + GPM +
                '}';
    }
}
