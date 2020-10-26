package com.company;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

    ArrayList <String> favor = new ArrayList<>();
    favor.add("amir");
    ArrayList <String> favor1 = new ArrayList<>();
    favor1.add("hasan");
    ArrayList <String> favor2 = new ArrayList<>();
	Person person = new Person("amir","barik");
	Person person1 = new Person("amir","h");
	Person person2 = new Person("hasan","zand");

	VotingSystem votingSystem =new VotingSystem();
	votingSystem.createVoting(1,"what is your favor actor?");
	votingSystem.addChoiceToVoting(0,"amir");
	votingSystem.addChoiceToVoting(0,"hasan");
	votingSystem.vote(0,person1,favor);
	votingSystem.vote(0,person2,favor1);
	votingSystem.printResult(0);
	votingSystem.vote(0,person1,favor1);
	votingSystem.createVoting(0,"am i winner?");
	votingSystem.printListOfVotings();

    }
}
