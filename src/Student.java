public class Student {
    private String fullName;
    private int fhonNum;
    private String adress;
    private int bankChet;

    void setFullName(String fullName) {
        this.fullName = fullName;
    }

    void setFhonNum(int fhonNum) {
        this.fhonNum = fhonNum;
    }

    void setAdress(String adress) {
        this.adress = adress;
    }

    void setBankChet(int bankChet) {
        this.bankChet = bankChet;
    }

    String getFullName() {
        return fullName;
    }

    long getFhonNum() {
        return fhonNum;
    }

    String getAdress() {
        return adress;
    }

    int getBankChet() {
        return bankChet;
    }

    void getinf() {
        System.out.printf("""
                fullname :  %s,
                tellnum : %s,
                adderes : %s,
                bankchet : %s
                  
                  \n""", fullName, fhonNum, adress, bankChet);
    }

    int livein(int payy) {
        int pay = bankChet/payy;
        return pay;


    }
}

