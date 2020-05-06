package com.example.demo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class ShainForm {

@NotEmpty(message = " 社員Noを入れてください")
@Pattern(regexp = "\\d{3}", message = "半角、３桁で")
private String number;

public String getNumber() {
return number;
}

public void setNumber(String number) {
this.number = number;
}

}