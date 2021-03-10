package model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class PhoneNumber {

    @NotEmpty
    @Size(min = 10, max = 11)
    private String number;

    public PhoneNumber() {
    }

    public PhoneNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


//    @Override
//    public boolean supports(Class<?> clazz) {
//        return PhoneNumber.class.isAssignableFrom(clazz);
//    }

//    @Override
//    public void validate(Object target, Errors errors) {
//        PhoneNumber phoneNumber = (PhoneNumber) target;
//        String number = phoneNumber.getNumber();
//        ValidationUtils.rejectIfEmpty(errors, "number", "Phone number not empty.");
//        if (number.length() > 11 || number.length() < 10) {
//            errors.rejectValue("number", "Length form 10 to 11.");
//        } else if (!number.startsWith("0")) {
//            errors.rejectValue("number", "Phone number start with 0.");
//        } else if (!number.matches("(^$|[0-9]*$)")) {
//            errors.rejectValue("number", "Phone number only include number.");
//        }
//    }

}
