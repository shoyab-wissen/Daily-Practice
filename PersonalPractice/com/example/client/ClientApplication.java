package PersonalPractice.com.example.client;

import PersonalPractice.com.example.implementation.PrintInformation;
import PersonalPractice.com.example.interfaces.InformationInterface;

class InfomrationPrint extends PrintInformation implements InformationInterface {
    InfomrationPrint() {
        try {
            this.printClassInformation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ClientApplication implements InformationInterface {
    public static void main(String[] args) {
        InfomrationPrint ip = new InfomrationPrint();
    }
}
