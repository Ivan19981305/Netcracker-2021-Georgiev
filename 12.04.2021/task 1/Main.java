package ivge;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        String data = "Daniel Paul Issel (born October 25, 1948) is an American former professional basketball player and coach. An outstanding collegian at the University of Kentucky, Issel was twice named an All-American en route to a school-record 25.7 points per game for his career. The American Basketball Association Rookie of the Year in 1971, he was a six-time ABA All-Star and a one-time NBA All-Star.\n" +
                "\n" +
                "A prolific scorer, Issel remains the all-time leading scorer at the University of Kentucky, the second-leading scorer of all time for the NBA's Denver Nuggets, and the second-leading scorer of all time for the American Basketball Association itself. Upon Issel's retirement from the NBA in 1985, Wilt Chamberlain, Kareem Abdul-Jabbar, and Julius Erving were the only professional basketball players to have scored more career points.[1] Issel was inducted into the Naismith Memorial Basketball Hall of Fame in 1993.";

        ArrayList<String> splittedData = new ArrayList<String>(Arrays.asList(data.split(" ")));

        for (String string : splittedData)
            hashMap.put(string, hashMap.containsKey(string) ? hashMap.get(string) + 1 : 1);

        System.out.println(hashMap);

        /*
        {named=1, career=1, All-Star=1, leading=1, remains=1, NBA=2, retirement=1, professional=2, points=1, (born=1, basketball=2, Kentucky,=2, All-American=1, Fame=1, his=1, NBA's=1, Issel's=1, Kareem=1, all-time=1, only=1, from=1, per=1, Memorial=1, All-Star.

A=1, all=2, scorer,=1, second-leading=2, in=3, players=1, 1971,=1, en=1, is=1, Daniel=1, Julius=1, an=2, former=1, points.[1]=1, 1948)=1, twice=1, at=2, route=1, University=2, were=1, ABA=1, prolific=1, Naismith=1, game=1, American=3, scorer=3, Erving=1, for=3, 25,=1, inducted=1, Basketball=3, Paul=1, An=1, collegian=1, one-time=1, The=1, into=1, October=1, Association=2, six-time=1, Wilt=1, and=4, of=6, have=1, Denver=1, Chamberlain,=1, 25.7=1, player=1, a=3, 1993.=1, outstanding=1, more=1, was=3, Rookie=1, Issel=4, 1985,=1, coach.=1, the=11, Upon=1, school-record=1, itself.=1, career.=1, Year=1, scored=1, Abdul-Jabbar,=1, to=2, time=2, Hall=1, Nuggets,=1, he=1}

         */
    }
}