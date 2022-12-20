
import java.util.ArrayList;

// import java.util.*;
abstract class Player{
    private String name;

    public Player(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}

class BaseBallPlayer extends Player{
    public BaseBallPlayer(String name)
    {
        super(name);
    }

}

class FootBallPlayer extends Player{
    public FootBallPlayer(String name)
    {
        super(name);
    }
}

class SoccerPlayer extends Player{
    public SoccerPlayer(String name)
    {
        super(name);
    }
}

class Team<T extends Player>{
    private String name;
    int played = 0;
    int won = 0;
    int lost=0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public boolean addPlayer(T player)
    {
        if(members.contains(player))
        {
            System.out.println(player.getName() + " is always on this team");
            return false;
        }
        else{
            members.add(player);
            System.out.println(player.getName()+" picked for team "+this.name);
            return true;
        }
    }

    public int numPlayers()
    {
        return this.members.size();
    }

    public void matchResult(Team opponent,int ourScore,int theirScore)
    {
        if(ourScore > theirScore)
        {
            won++;
        }
        else if(ourScore == theirScore)
        {
            tied++;
        }
        else{
            lost++;
        }
        played++;
        if(opponent != null)
        {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking()
    {
        return (won*2) + tied;
    }
}
public class Test {
    public static void main(String[] args)
    {
        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team<FootBallPlayer> adelaideCrows = new Team("Adelaide Crows");

        adelaideCrows.addPlayer(joe);
        // adelaideCrows.addPlayer(pat);
        // adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseBallPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);


        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(beckham);
    }

    
    
}
