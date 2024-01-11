package step_defination.web;

import org.apache.commons.lang3.RandomStringUtils;
import pages.Page;

import java.sql.Time;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

public class CommonFunctions extends Page {

    public int randomEmialSuffix() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return randomInt;
    }

    public String random5NumberSuffix(String previousNumbers) {
        String randomNumber = RandomStringUtils.randomNumeric(5);
        String mobileNumber = previousNumbers+randomNumber;
        return mobileNumber;
    }

    public String random2NumberSuffix(){
        String randomNumber = RandomStringUtils.randomNumeric(2);
        return randomNumber;
    }

    public String providerInfoDoctorNumber(String doctorNumber){
        int doctorNumberInt = Integer.parseInt(doctorNumber);
        doctorNumberInt--;
        String doctorNumberString = Integer.toString(doctorNumberInt);
        String doctorResult = "doctor["+doctorNumberString+"].";
        return doctorResult;
    }
    public String providerInfoDentistNumber(String dentistNumber){
        int dentistNumberInt = Integer.parseInt(dentistNumber);
        dentistNumberInt--;
        String dentistNumberString = Integer.toString(dentistNumberInt);
        String dentistResult = "dentist["+dentistNumberString+"].";
        return dentistResult;
    }
    public String lowerCaseAnyString(String str){
        return str.toLowerCase();
    }
    public String replaceSpaceWithUnderscore(String str){
        String result = lowerCaseAnyString(str);
        return result.replaceAll(" ", "_");
    }
    public String todaysDateInMMDDYYYY(){
        LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = dateObj.format(formatter);
        System.out.println(date);
        return date;
    }
    public String decrementStringNumber(String stringNumber){
        int intNumber = Integer.parseInt(stringNumber);
        intNumber--;
        return Integer.toString(intNumber);
    }

    public String currentTimeInHHMM(){
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("HH:mm");
        System.out.println(format.format(date));
        return format.format(date);
    }
//    public String currentTimeInSeconds(){
//        String dateFormat = currentTimeInHHMMSS();
//        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
//    }

    public String currentTimeInHHMMBut10minutesAhead(){
        int oldTime = Integer.parseInt(currentTimeInHHMM());
        int modTime = oldTime + 10;
        System.out.println(modTime);
        return String.valueOf(modTime);
    }

}