package PersonalPractice.com.example.client;

import PersonalPractice.com.example.implementation.PrintInformation;
import PersonalPractice.com.example.interfaces.InformationInterface;

class InfomrationPrint extends PrintInformation {
    InfomrationPrint() {
        try {
            this.printClassInformation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ClientApplication {
    public static void main(String[] args) {
        InfomrationPrint ip = new InfomrationPrint();
    }
}
