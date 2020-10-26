package com.company;

public class Person {
    //the first name of person
    private String firstName;
    //the last name of person
    private String lastName;

    /**
     *
     * @param firstName
     * @param lastName
     */
    public Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getter methods of fields
    public String getFirstName (){return firstName;}
    public String getLastName (){ return lastName;}

    //setter methods of fields
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName (String lastName ){ this.lastName = lastName;}



}
