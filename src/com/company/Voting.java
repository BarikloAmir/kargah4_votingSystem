package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    //type of voting
    private int type;
    //question of voting
    private String question;
    //choise and their votes
    private HashMap<String, HashSet<Vote>> choices = new HashMap<>();
    //list of voters
    private ArrayList<Person> voters = new ArrayList<>();

    /**
     *
     * @param type
     * @param question
     */
    public Voting (int type ,String question){
        this.type = type;
        this.question = question;
    }

    /**
     *
     * @return question of voting
     */
    public String getQuestion(){return question;}

    /**
     * this method create new choice and new list of vote for that
     * @param choice adding to the choices
     */
    public void createChoice( String choice){
        HashSet<Vote> newVoteList = new HashSet<>();
        choices.put(choice,newVoteList);
    }

    /**
     *this method adding vote of person to choices list
     * @param person who wants to vote
     * @param personChoices
     */
    public void vote (Person person,ArrayList<String> personChoices) {
        Vote voteOfPerson = new Vote(person, "1399");
        int m = 0;
        for (Person person1 : voters)
            if (person1.getLastName().equals(person.getLastName()) && person1.getFirstName().equals(person.getFirstName())){
                System.out.println(person.getFirstName()+" "+person.getLastName()+" : sorry you can not vote again!");
                m=1;
                break;}
            if(m==0) {
                if (type == 0)
                    if (choices.containsKey(personChoices.get(0))) {
                        choices.get(personChoices.get(0)).add(voteOfPerson);
                        voters.add(person);
                    } else
                        System.out.println("not exist this choice in choices!!!!");
                else
                    for (String choice : personChoices)
                        if (choices.containsKey(choice)) {
                            choices.get(choice).add(voteOfPerson);
                            voters.add(person);
                        } else
                            System.out.println("not exist this choice in choices!!!");
            }

    }


    /**
     * print result of voting
     */
    public void printResult (){
        for( String choice : choices.keySet()){
            System.out.println(choice+" :");
            for (Vote vote : choices.get(choice))
                vote.printVoteInfo();}


    }

    public void printQuestionAndChoices(){
        System.out.println(question);
        for(String choice : choices.keySet())
            System.out.println(choice);
    }

}