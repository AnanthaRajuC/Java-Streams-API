package io.github.anantharajuc.jsa;

import lombok.Data;

@Data
public class Person {
    public int id;
    public String first_name;
    public String last_name;
    public String email;
    public String gender;
    public String ip_address;
    public int car_model_year;
    public boolean sports;
    public Object bank_account;
    public String file;
}
