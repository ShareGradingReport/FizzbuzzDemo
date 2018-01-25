package me.riri.fizzbuzz.demofizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;


@RestController
public class FizzBuzzController {

    @RequestMapping("/")
    public String fizzBuzz(){
        int first = 1;
        int last = 100;
        int count = 0;
        String fizzy = "";
        for(int i=first; i<=last; i++){
            if(count % 10 == 0)
                fizzy = fizzy +"</br>";
            if(i%3 != 0 && i%5!=0)
                fizzy = fizzy + String.valueOf(i)+" ";
            if(i%3 == 0 && i%5!=0)
                fizzy = fizzy + " Fizz ";
            if(i%5 == 0 && i%3!=0)
                fizzy = fizzy +" Buzz ";
            if(i%3 == 0 && i%5==0)
                fizzy = fizzy +(" FizzBuzz ");
            count++;
        }
        return fizzy;
    }


    @RequestMapping("/bonus")
    public String fizzBuzzBonus(){
        Scanner reader = new Scanner(System.in);
        int first = 1, count7=0, count17=0,count23=0;
        System.out.println("How many numbers? Enter an integer ");
        int last = reader.nextInt();

        for(int i=first; i<=last; i++){
            if(i%7 == 0)
                count7++;
            if(i%17 == 0)
                count17++;
            if(i%23 == 0)
                count23++;

        }

        return fizzBuzz()+"</br></br>"+"The number of multiples of 7 are "+String.valueOf(count7)+"</br>The number of multiples of 17 are "+String.valueOf(count17)+"</br>The number of multiples of 23 are "+String.valueOf(count23);
    }
}
