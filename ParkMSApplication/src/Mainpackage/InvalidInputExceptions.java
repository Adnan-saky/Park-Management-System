package Mainpackage;

public class InvalidInputExceptions extends Exception {

    public InvalidInputExceptions() {
    }

    //user defined excetion message showing on the option pane
    String str1;

    public InvalidInputExceptions(String str2) {
        str1 = str2;
    }

    public String toString() {
        return (str1);
    }

    //checking if text fields are empty or not
    public boolean checkIfEmptyField(String strText) {
        if (strText.trim().equals("")) {
            return true;
        }
        return false;
    }

    //checking if names are valid or not (A-Z or a-z character) 
    public boolean checkIfInvalidName(String strName) {
        strName = strName.toLowerCase().trim().replaceAll("\\s+", "");
        if (strName.matches("[a-z]*")) {
            return false; //false means valid
        } else {
            return true;
        }
    }

    //checking if Phone number is valid or not (0-9 and + character) 
    public boolean checkIfInvalidPhone(String strPhone) {
        strPhone = strPhone.toLowerCase().trim().replaceAll("\\s+", "");
        if (strPhone.matches("[+][0-9]*") || strPhone.matches("[0-9]*")) {
            return false; //false means valid
        } else {
            return true;
        }
    }

    //checking if Age is valid or not (0-9character and age 1-124) 
    public boolean checkIfInvalidAge(String strAge) {
        strAge = strAge.toLowerCase().trim().replaceAll("\\s+", "");
        if (strAge.matches("[0-9]*")) {
            int intAge = Integer.parseInt(strAge);
            if (intAge > 0 && intAge < 125) {
                return false; //false means valid
            } else {
                return true;
            }

        } else {
            return true;
        }
    }
}
