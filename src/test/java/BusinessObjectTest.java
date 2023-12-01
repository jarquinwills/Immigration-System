package test.java;

import org.openjfx.BusinessObject;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BusinessObjectTest {
    String petitionerLastName = "Bell";
    String petitionerFirstName = "Alan";
    String businessName = "Soft Ware";
    String address = "123 Main St, Fairfax, VA 22032";
    String phoneNumber = "7031234567"; // 703-123-4567
    String email = "software@email.com";
    String EIN = "123456777"; // 12-3456777

    String beneficiaryLastName = "Baker";
    String beneficiaryFirstName = "Jane";
    String beneficiaryDOB = "10201985"; // 10/20/1985
    String beneficiaryGender = "F";
    String beneficiaryA_Number = "123456789"; // 123-456-789
    String beneficiaryCountryOfBirth = "Canada";
    String beneficiaryAddress = "456 Lee Hwy, Toronto, ON M9C 1W3";
    String beneficiaryArrivalDate = "11202023"; // 11/20/2023
    String beneficiaryPassportExpirationDate = "07152028"; // 07/15/2028

    String workID = "123456";
    boolean approveStatus = false;
    boolean emailSent = false;

    BusinessObject bo = new BusinessObject(petitionerLastName, petitionerFirstName, businessName, address, phoneNumber, email, EIN,
                                           beneficiaryLastName, beneficiaryFirstName, beneficiaryDOB, beneficiaryGender, beneficiaryA_Number,
                                           beneficiaryCountryOfBirth, beneficiaryAddress, beneficiaryArrivalDate, beneficiaryPassportExpirationDate, workID);

    @Test
    public void testGetPetitionerLastName() {
        assertEquals(petitionerLastName, bo.getPetitionerLastName());
    }
}
