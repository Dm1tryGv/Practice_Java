package Практика.Практика4_1;

public class Test {
    public static void main(String[] args){
        Phone[] phones = {
                new Phone("+79876543211", "Samsung Galaxy S21 FE", 10),
                new Phone("+71232327489", "Iphone 14", 8),
                new Phone("+75437453454", "Samsung Galaxy S22", 10),
        };

        Phone phone = new Phone();

        for(Phone _phone : phones){
            System.out.println(_phone.toString());
        }

        System.out.println();

        for(Phone _phone : phones){
            System.out.println(_phone.getNumber());
            _phone.receiveCall("Дмитрий", "+79154002968");
            System.out.println();
        }

        phone.sendMassage("+79154002456", "+79152742968", "+79195502968");
    }
}
