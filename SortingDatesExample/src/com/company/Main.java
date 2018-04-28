package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Repo repo = new Repo("Repo1", "2016-10-24T11:32:11Z");
        Repo repo1 = new Repo("Repo 2", "2018-04-24T12:32:11Z");
        Repo repo2 = new Repo("Repo 3", "2018-04-24T14:32:11Z");

        ArrayList<Repo> repos = new ArrayList<>();
        repos.add(repo);
        repos.add(repo1);
        repos.add(repo2);

        for(Repo repository : repos){
            System.out.println(repository);
        }

        repos.sort(Collections.reverseOrder());

        for(Repo repository : repos){
            System.out.println(repository);
        }

//
//        ArrayList<String> dates = new ArrayList<>();
//
//        dates.add("2016-10-24T11:32:11Z");
//        dates.add("2018-04-24T21:54:35Z");
//        dates.add("2018-04-24T12:32:11Z");
//
//        for(String date : dates){
//            System.out.println(date);
//        }
//
//        Collections.sort(dates, Collections.reverseOrder());
//
//
//        for(String date : dates){
//            System.out.println(date);
//        }


    }


}


