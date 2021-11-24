public class AppMain {
    public static void main(String[] args) {
        Animal c1 = new Animal();
        c1.setName("Rex");
        c1.setAge((byte)4);
        c1.setHealthStatus((byte)10);
        c1.setHungerLevel((byte)2);
        c1.setSpirit((byte)10);
        c1.setFavouriteFood("RoyalKanin");
        c1.setFavouriteActivity("Playing");
        c1.print();

        Adopter ad1 = new Adopter();
        ad1.setName("Aurel Nicu");
        ad1.setMoney(450);
        ad1.print();

        AnimalFood af1 = new AnimalFood();
        af1.setName("RoyalKanin");
        af1.setPrice(50.50);
        af1.setQuantity(3);
        af1.setAvailable(true);
        af1.print();

        RecreationAcivity ra1 = new RecreationAcivity();
        ra1.setPlayActivity("Fetch");
        ra1.print();

        VeterinaryMedic vm1 = new VeterinaryMedic();
        vm1.setName("Persan Viorel");
        vm1.setSpecialization("PHD in Vet School");
        vm1.print();

        //------------------------------------------------//
        Dog dg1 = new Dog();
        dg1.playing();
        dg1.growl();

        Cat ct1 = new Cat();
        ct1.scratching();
        ct1.purrrrrrs();
        //Animal extension ^//
        System.out.println("---------------");
        Woman wm1 = new Woman();
        wm1.aww();
        wm1.eww();

        Man mn1 = new Man();
        mn1.bargain();
        mn1.petting();
        //Adopter extension ^//
        System.out.println("---------------");
        Bag bg1 = new Bag();
        bg1.bagWeight();
        bg1.qualityOfFood();

        Can cn1 = new Can();
        cn1.cold();
        cn1.hot();
        //AnimalFood extension
        System.out.println("---------------");
        Veteran vt1 = new Veteran();
        vt1.notSoHard();
        vt1.magicTouch();

        Newbie nb1 = new Newbie();
        nb1.notSoGood();
        nb1.experienceLevelUp();

        //Tema Polimorfism
        ct1.talkie();
        dg1.talkie();
        //^From Animal extesion
        System.out.println("---------------------");
        mn1.preference();
        wm1.preference();
        //^From Adopter extension
        System.out.println("---------------------");
        nb1.workTime();
        vt1.workTime();
        //^From VeterinaryMedic extension


        //Tema Abstract
    }
}
