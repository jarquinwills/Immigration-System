package JUnitTests;

import org.openjfx.BusinessObject;//.Step;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * This function is in charge of testing the methods of the BusinessObject Class.
 * @author Nam Kyu Lee.
 */
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
    //Step currentStep = Step.DATA_ENTRY;
    boolean approveStatus = false;
    boolean emailSent = false;

    BusinessObject bo = new BusinessObject(petitionerLastName, petitionerFirstName, businessName, address, phoneNumber, email, EIN,
                                           beneficiaryLastName, beneficiaryFirstName, beneficiaryDOB, beneficiaryGender, beneficiaryA_Number,
                                           beneficiaryCountryOfBirth, beneficiaryAddress, beneficiaryArrivalDate, beneficiaryPassportExpirationDate, workID);

    /**
     * Test 1 tests getPetitionerLastName() method
     */
    @Test
    public void testGetPetitionerLastName() {
        assertEquals("This should return petitioner's last name.", petitionerLastName, bo.getPetitionerLastName());
    }
    
    /**
     * Test 2 tests getPetitionerFirstName() method
     */
    @Test
    public void testGetPetitionerFirstName() {
        assertEquals("This should return petitioner's first name.", petitionerFirstName, bo.getPetitionerFirstName());
    }

    /**
     * Test 3 tests getBusinessName() method
     */
    @Test
    public void testGetBusinessName() {
        assertEquals("This should return business name.", businessName, bo.getBusinessName());
    }

    /**
     * Test 4 tests getAddress() method
     */
    @Test
    public void testGetAddress() {
        assertEquals("This should return business address.", address, bo.getAddress());
    }

    /**
     * Test 5 tests getPhoneNumber() method
     */
    @Test
    public void testGetPhoneNumber() {
        assertEquals("This should return business's phone number.", phoneNumber, bo.getPhoneNumber());
    }

    /**
     * Test 6 tests getEmail() method
     */
    @Test
    public void testGetEmail() {
        assertEquals("This should return business's email.", email, bo.getEmail());
    }
    
    /**
     * Test 7 tests getEIN() method
     */
    @Test
    public void testGetEIN() {
        assertEquals("This should return business's EIN.", EIN, bo.getEIN());
    }
    
    /**
     * Test 8 tests getBeneficiaryLastName() method
     */
    @Test
    public void testGetBeneficiaryLastName() {
        assertEquals("This should return beneficiary's last name.", beneficiaryLastName, bo.getBeneficiaryLastName());
    }

    /**
     * Test 9 tests getBeneficiaryFirstName() method
     */
    @Test
    public void testGetBeneficiaryFirstName() {
        assertEquals("This should return beneficiary's first name.", beneficiaryFirstName, bo.getBeneficiaryFirstName());
    }

    /**
     * Test 10 tests getBeneficiaryDOB() method
     */
    @Test
    public void testGetBeneficiaryDOB() {
        assertEquals("This should return beneficiary's date of birth.", beneficiaryDOB, bo.getBeneficiaryDOB());
    }

    /**
     * Test 11 tests getBeneficiaryGender() method
     */
    @Test
    public void testGetBeneficiaryGender() {
        assertEquals("This should return beneficiary's gender.", beneficiaryGender, bo.getBeneficiaryGender());
    }

    /**
     * Test 12 tests getBeneficiaryA_Number() method
     */
    @Test
    public void testGetBeneficiaryA_Number() {
        assertEquals("This should return beneficiary's A-Number.", beneficiaryA_Number, bo.getBeneficiaryA_Number());
    }

    /**
     * Test 13 tests getBeneficiaryCountryOfBirth() method
     */
    @Test
    public void testGetBeneficiaryCountryOfBirth() {
        assertEquals("This should return beneficiary's country of birth.", beneficiaryCountryOfBirth, bo.getBeneficiaryCountryOfBirth());
    }

    /**
     * Test 14 tests getBeneficiaryAddress() method
     */
    @Test
    public void testGetBeneficiaryAddress() {
        assertEquals("This should return beneficiary's address.", beneficiaryAddress, bo.getBeneficiaryAddress());
    }

    /**
     * Test 15 tests getBeneficiaryArrivalDate() method
     */
    @Test
    public void testGetBeneficiaryArrivalDate() {
        assertEquals("This should return beneficiary's arrival date.", beneficiaryArrivalDate, bo.getBeneficiaryArrivalDate());
    }

    /**
     * Test 16 tests getBeneficiaryPassportExpirationDate() method
     */
    @Test
    public void testGetBeneficiaryPassportExpirationDate() {
        assertEquals("This should return beneficiary's passport expiration date.", beneficiaryPassportExpirationDate, bo.getBeneficiaryPassportExpirationDate());
    }

    /**
     * Test 17 tests getWorkID() method
     */
    @Test
    public void testGetWorkID() {
        assertEquals("This should return work ID.", workID, bo.getWorkID());
    }

    /**
     * Test 18 tests getCurrentStep() method
     
    @Test
    public void testGetCurrentStep() {
        assertEquals("This should return current step.", currentStep, bo.getCurrentStep());
    }
    
    */

    /**
     * Test 19 tests getApproveStatus() method
     */
    @Test
    public void testGetApproveStatus() {
        assertEquals("This should return whether beneficiary has been approved or not.", bo.getApproveStatus());
    }

    /**
     * Test 20 tests getEmailSent() method
     */
    @Test
    public void testGetEmailSent() {
        assertEquals("This should return whether eamil has been sent to beneficiary.", bo.getEmailSent());
    }

    /**
     * Test 21 tests setPetitionerLastName() method
     */
    @Test
    public void testSetPetitionerLastName() {
        String pLastName = "Bean";
        bo.setPetitionerLastName(pLastName);
        assertEquals("This should set petitioner's last name.", pLastName, bo.getPetitionerLastName());
    }

    /**
     * Test 22 tests setPetitionerFirstName() method
     */
    @Test
    public void testSetPetitionerFirstName() {
        String pFirstName = "James";
        bo.setPetitionerFirstName(pFirstName);
        assertEquals("This should set petitioner's first name.", pFirstName, bo.getPetitionerFirstName());
    }

    /**
     * Test 23 tests setBusinessName() method
     */
    @Test
    public void testSetBusinessName() {
        String newBusinessName = "Hard Ware";
        bo.setBusinessName(newBusinessName);
        assertEquals("This should set business name.", newBusinessName, bo.getBusinessName());
    }

    /**
     * Test 24 tests setAddress() method
     */
    @Test
    public void testSetAddress() {
        String newAddress = "789 Master Ln, Falls Church, VA, 22043";
        bo.setAddress(newAddress);
        assertEquals("This should set business's address.", newAddress, bo.getAddress());
    }

    /**
     * Test 25 tests setPhoneNumber() method
     */
    @Test
    public void testSetPhoneNumber() {
        String newPhoneNumber = "7030987654";
        bo.setPhoneNumber(newPhoneNumber);
        assertEquals("This should set business's phone number.", newPhoneNumber, bo.getPhoneNumber());
    }

    /**
     * Test 26 tests setEmail() method
     */
    @Test
    public void testSetEmail() {
        String newEmail = "hardware@email.com";
        bo.setEmail(newEmail);
        assertEquals("This should set business's email.", newEmail, bo.getEmail());
    }

    /**
     * Test 27 tests setEIN() method
     */
    @Test
    public void testSetEIN() {
        String newEIN = "456789000";
        bo.setEIN(newEIN);
        assertEquals("This should set business's EIN.", newEIN, bo.getEIN());
    }

    /**
     * Test 28 tests setBeneficiaryLastName() method
     */
    @Test
    public void testSetBeneficiaryLastName() {
        String bLastName = "Jen";
        bo.setBeneficiaryLastName(bLastName);
        assertEquals("This should set beneficiary's last name.", bLastName, bo.getBeneficiaryLastName());
    }

    /**
     * Test 29 tests setBeneficiaryFirstName() method
     */
    @Test
    public void testSetBeneficiaryFirstName() {
        String bFirstName = "Logan";
        bo.setBeneficiaryFirstName(bFirstName);
        assertEquals("This should set beneficiary's first name.", bFirstName, bo.getBeneficiaryFirstName());
    }

    /**
     * Test 30 tests setBeneficiaryDOB() method
     */
    @Test
    public void testSetBeneficiaryDOB() {
        String bDOB = "03251990";
        bo.setBeneficiaryDOB(bDOB);
        assertEquals("This should set beneficiary's date of birth.", bDOB, bo.getBeneficiaryDOB());
    }

    /**
     * Test 31 tests setBeneficiaryGender() method
     */
    @Test
    public void testSetBeneficiaryGender() {
        String bGender = "Male";
        bo.setBeneficiaryGender(bGender);
        assertEquals("This should set beneficiary's gender.", bGender, bo.getBeneficiaryGender());
    }

    /**
     * Test 32 tests setBeneficiaryA_Number() method
     */
    @Test
    public void testSetBeneficiaryA_Number() {
        String bA_Number = "112233445";
        bo.setBeneficiaryA_Number(bA_Number);
        assertEquals("This should set beneficiary's A-Number." + bA_Number, bA_Number, bo.getBeneficiaryA_Number());
    }

    /**
     * Test 33 tests setBeneficiaryCountryOfBirth() method
     */
    @Test
    public void testSetBeneficiaryCountryOfBirth() {
        String bCountryOfBirth = "Mexico";
        bo.setBeneficiaryCountryOfBirth(bCountryOfBirth);
        assertEquals("This should set beneficiary's country of birth.", bCountryOfBirth, bo.getBeneficiaryCountryOfBirth());
    }

    /**
     * Test 34 tests setBeneficiaryAddress() method
     */
    @Test
    public void testSetBeneficiaryAddress() {
        String bAddress = "246 Main Rd, Fairfax, VA, 22032";
        bo.setBeneficiaryAddress(bAddress);
        assertEquals("This should set beneficiary's address.", bAddress, bo.getBeneficiaryAddress());
    }

    /**
     * Test 35 tests setBeneficiaryArrivalDate() method
     */
    @Test
    public void testSetBeneficiaryArrivalDate() {
        String bArrivalDate = "01062024";
        bo.setBeneficiaryArrivalDate(bArrivalDate);
        assertEquals("This should set beneficiary's arrival date.", bArrivalDate, bo.getBeneficiaryArrivalDate());
    }

    /**
     * Test 36 tests setBeneficiaryPassportExpirationDate() method
     */
    @Test
    public void testSetBeneficiaryPassportExpirationDate() {
        String bPassportExpirationDate = "01062024";
        bo.setBeneficiaryPassportExpirationDate(bPassportExpirationDate);
        assertEquals("This should set beneficiary's passport expiration date.", bPassportExpirationDate, bo.getBeneficiaryPassportExpirationDate());
    }

    /**
     * Test 37 tests setWorkID() method
     */
    @Test
    public void testSetWorkID() {
        String newWorkID = "999999";
        bo.setWorkID(newWorkID);
        assertEquals("This should set new work ID.", newWorkID, bo.getWorkID());
    }

    /**
     * Test 38 tests setApproveStatus() method
     */
    @Test
    public void testSetApproveStatus() {
        boolean newApproveStatus = true;
        bo.setApproveStatus(newApproveStatus);
        assertEquals(newApproveStatus, bo.getApproveStatus());
    }

    /**
     * Test 39 tests setEmailSent() method
     */
    @Test
    public void testSetEmailSent() {
        boolean newEmailSent = true;
        bo.setEmailSent(newEmailSent);
        assertEquals(newEmailSent, bo.getEmailSent());
    }
}
