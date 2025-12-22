public class OTPGenerator {

    // Method to generate 6-digit OTP
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check uniqueness
    public static boolean isUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       //Create the arrys size of 10
        int[] otps = new int[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        System.out.println("All OTPs are Unique: " + isUnique(otps));
    }
}

