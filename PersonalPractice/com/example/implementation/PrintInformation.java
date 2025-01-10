package PersonalPractice.com.example.implementation;

import PersonalPractice.com.example.exceptions.CannotPrintInformationException;
import PersonalPractice.com.example.interfaces.InformationInterface;

public class PrintInformation {
    public final void printClassInformation() throws CannotPrintInformationException {

        if (this instanceof InformationInterface) {
            System.out.println("Class Name: " + this.getClass());
            System.out.println("Hash Code: " + this.hashCode());
        } else {
            throw new CannotPrintInformationException();
        }
    }
}
