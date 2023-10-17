package Practice.Practice_2.Задание4;

public class Shop {
    int storage_size = 5;
    int storage_occupancy = 0;

    Computer[] computers;
    public Shop() {
        computers = new Computer[storage_size];

        computers[0] = new Computer(16, 1024, 8, 4);
        storage_occupancy += 1;
    }

    public boolean add_computer(int index, int ram, int hdd, int cpc, int gpm){
        if( index < storage_size && storage_occupancy < storage_size){
            computers[index] = new Computer(ram, hdd, cpc, gpm);
            return true;
        }

        return false;
    }

    public boolean del_computer(int index){
        if( index < storage_size ) {
            computers[index] = null;
            return true;
        }
        return false;
    }

    public Computer[] display(){
        return computers;
    }
}
