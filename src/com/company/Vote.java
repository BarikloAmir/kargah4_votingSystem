package com.company;
import ir.huri.jcal.JalaliCalendar;

public class Vote {
    //person who voting
    private Person person;
    //date of vote
    private String date;

    /**
     *
     * @param person1
     * @param date1
     */
    public Vote(Person person1 ,String date1){
        person = person1;
        date = date1;
    }

    //getter methods
    public String getDate(){return date;}
    public Person getPerson(){return person;}

    //setter methods
    public void setPerson(Person person){this.person = person;}
    public void setDate(String date){this.date =  date;}

    /**
     * printing info of vote
     */
    public void printVoteInfo(){
        System.out.println("name :"+person.getFirstName()+" "+person.getLastName()+" , date :"+date);
    }

}